import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforceE2E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();// regula: nazwa_tagu[atrybut*='wartosc']
		driver.findElement(By.xpath("//input[contains(@id,'login')]")).sendKeys("xpatx regularny");// nazwa_tagu[@contains(@atrybut,'wartosc_stala')]
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("122354");
		driver.findElement(By.cssSelector("input[name='proceed']")).click();
	}

}
