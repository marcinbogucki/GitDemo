import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		//System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());//nie zadziala
		//...bo selenium nie jest w stanie identyfikowac ukrytych elementow
		
		// JavaScript DOM moze wyciagnac ukryte elementy
		// przesledzic wlasciwosci objektu jesli posiada ukryty text
		//Jak uzyc javascript w Java??--> JavascriptExecutor
	
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String script ="return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		
	}

}
