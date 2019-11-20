import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		
		WebElement move = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions a= new Actions(driver);
		a.moveToElement(move).contextClick().build().perform();
		
		WebElement textfield = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(textfield).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
	}
}
