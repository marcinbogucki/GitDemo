import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		//    //nazwaTagu[@unikalny_attrybut='wartosc']   -
		/*driver.findElement(By.xpath("//input[@type='email']")).sendKeys("moj wlasny xpath");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value='Anmelden']")).click();*/ //z uzyciem Xpath
		
		//tagName[atrybut='wartosc_atrybutu'] -CSS
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("moj cssSelektor");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("haslo");
		driver.findElement(By.cssSelector("[value='Anmelden']")).click();
	}

}
