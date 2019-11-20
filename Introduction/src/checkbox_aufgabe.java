import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkbox_aufgabe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		WebElement option1= driver.findElement(By.xpath("//*[@id='checkBoxOption1']"));
		option1.click();
		Assert.assertTrue(option1.isSelected());
		Thread.sleep(1000L);
		option1.click();
		Assert.assertFalse(option1.isSelected());
		
		//Count
		int count = driver.findElements(By.xpath("//*[@type='checkbox']")).size();
		System.out.println(count+" chceckboxes are present in the page");
	}	
}
