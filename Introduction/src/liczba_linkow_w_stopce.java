import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class liczba_linkow_w_stopce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//pobierz liczbe linkow na stronie
		// linki maja tag --> a
		
		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		//sposob na pokazanie liczby odnosnikow ( tagName 'a') na stopce strony
		// zawezamy poszukiwanie do danego obszaru (stopka strony)
		WebElement stopka=driver.findElement(By.id("gf-BIG"));//cala stopka
		System.out.println(stopka.findElements(By.tagName("a")).size());//wyswietla liczbe linkow znajdujacych sie w stopce strony
		WebElement kolumna1= stopka.findElement(By.xpath("//table[@class='gf-t']//td[1]//ul[1]"));
		System.out.println("W kolumnie pierwszej jest " +kolumna1.findElements(By.tagName("a")).size() + " elementow");
		
	}
	
}