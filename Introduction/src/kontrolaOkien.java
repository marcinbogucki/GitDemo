import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kontrolaOkien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://accounts.google.com/signup");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/footer[1]/ul[1]/li[1]/a[1]")).click();
		System.out.println("Przed przejsciem do otwartego okna: " + driver.getTitle());
		
		Set<String>ids=driver.getWindowHandles();//pobiera otwarte okna
		Iterator<String>it=ids.iterator(); //obiekt do iteracji
		
		String parentid=it.next();//pobiera okno rodzic
		String childid= it.next();// pobiera kolejne okna z setu, czyli okno dziecka
		
		driver.switchTo().window(childid); //przechodzi do okna dziecka
		System.out.println("Po przejsciu do oktawrtego okna: " + driver.getTitle());// informacja ze przeslismy do okna dziecka
		
		driver.switchTo().window(parentid);
		System.out.println("Teraz przeszedlem do okna: " + driver.getTitle());
		
	}

}
