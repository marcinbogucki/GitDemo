import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathParentChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://google.com");
		driver.findElement(By.xpath("//div[@class='a4bIc']/input")).sendKeys("sdfsa");
		driver.findElement(By.xpath("//div[@id=\"gbw\"]/div/div/div[1]/div[2]/a")).click();

	}

}
