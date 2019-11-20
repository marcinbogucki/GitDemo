import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentWaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//div[@id='start']//button")).click();
		
		// klasa FluentWait implementuje interfejs Wait , trzeba podac jaki typ <WebDriver>
		// w ciagu 30 sekund co 3 sekundy bedzie sprawdzac dostepnosc elementu, dodatkowo ignoruje bledy 
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		 
		 
		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.xpath("//div[@id='finish']"));
		     }
		   });
		
		
	}

}
