import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		WebDriverWait w = new WebDriverWait(driver, 5);
		
		driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
		WebElement elem = driver.findElement(By.xpath("//div[@id='results']"));
		w.until(ExpectedConditions.visibilityOf(elem)); 
		System.out.println(elem.getText());
	}

}
