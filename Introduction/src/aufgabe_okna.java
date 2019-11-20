import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author mbogu
 *
 */
/**
 * @author mbogu
 *
 */
public class aufgabe_okna {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//1 przejscie do http://the-internet.herokuapp.com/
		driver.get("http://the-internet.herokuapp.com/");
		
		//2 click multiplewindows
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		Thread.sleep(2000L);
		//3 kliknac "click here" (otworzy nowy tab)
		driver.findElement(By.xpath("//div[@id='content']/div/a")).click();
		Thread.sleep(2000L);
		//4 przechwycic tekst w nowym oknie i wyswietlic go na sysout
		Set<String>ids=driver.getWindowHandles();	//pobiera otwarte okna
		Iterator<String>it=ids.iterator(); 	//obiekt do iteracji
		String parentid=it.next();	//pobiera okno rodzic
		String childid= it.next();	// pobiera kolejne okna z setu, czyli okno dziecka
		driver.switchTo().window(childid);
		String textchild= driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println(textchild);
		Thread.sleep(2000L);
		//5 wrocic do pierwszego okna i wyswietlic napis "Opening a new Window"
		driver.switchTo().window(childid); //przechodzi do okna dziecka
		driver.switchTo().window(parentid);
		String textparent = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println(textparent);
		
	}

}
