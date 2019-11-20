import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://makemytrip.com");
		driver.findElement(By.id("fromCity")).click();

		// variable for source
		WebElement zrodlo = driver.findElement(By.xpath("//input[@placeholder='From']"));

		// use variable
		zrodlo.clear();
		zrodlo.click();
		zrodlo.sendKeys("MUM");
		Thread.sleep(2000L);// uspienie na 2 sekun
		zrodlo.sendKeys(Keys.ARROW_DOWN);
		zrodlo.sendKeys(Keys.ENTER);

		// variable for destination
		WebElement cel = driver.findElement(By.cssSelector(".react-autosuggest__input.react-autosuggest__input--open"));

		cel.click();
		cel.sendKeys("DEL");
		Thread.sleep(2000L);// uspienie na 2 sekun

		for (int i = 0; i < 4; i++) {
			cel.sendKeys(Keys.ARROW_DOWN);
		}
		cel.sendKeys(Keys.ENTER);
	}
}
