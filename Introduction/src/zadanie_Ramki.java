import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zadanie_Ramki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://the-internet.herokuapp.com");
		
		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
		System.out.println(driver.findElements(By.tagName("frame")).size());//outer frame
		
		WebElement frameOuter=driver.findElement(By.cssSelector("frame[name='frame-top'"));
		driver.switchTo().frame(frameOuter);
		System.out.println(driver.findElements(By.tagName("frame")).size());//inner frame
		
		WebElement frameInner=driver.findElement(By.cssSelector("frame[name='frame-middle'"));
		driver.switchTo().frame(frameInner);
		
		System.out.println(driver.findElement(By.id("content")).getText());
		
		
	}

}
