import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class obsluga_alertow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String tekst ="Marcin";
		
		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//alert z przyciskiem OK
		
		WebElement poletekst = driver.findElement(By.id("name"));
		poletekst.sendKeys(tekst);
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		Thread.sleep(2000L);
		Assert.assertEquals(driver.switchTo().alert().getText(), "Hello Marcin, share this practice page and share your knowledge");
		driver.switchTo().alert().accept();//klikniecie ok 
		
		// alert z dwoma przyciskami Ok oraz Cancel
		Thread.sleep(2000L);
		poletekst.sendKeys(tekst);
		WebElement potwierdz= driver.findElement(By.xpath("//input[@id='confirmbtn']"));
		potwierdz.click();
		driver.switchTo().alert().dismiss();
	}
}
