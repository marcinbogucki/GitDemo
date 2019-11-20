import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());//wyswietli ilosc ramek na stronie
		WebElement ramka=driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(ramka);
		//alternatywa podajac indeks ramki--> driver.switchTo().frame(0);
		
		WebElement zrodlo = driver.findElement(By.id("draggable"));
		WebElement cel = driver.findElement(By.id("droppable"));
		Actions a= new Actions(driver);
		a.dragAndDrop(zrodlo, cel).build().perform();//przeniesienie elementu na inne miejsce
		driver.switchTo().defaultContent();//wyjscie z ramki 
		
	}
}
