import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class aufgabe6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		//1
		WebElement opt2= driver.findElement(By.xpath("//*[@id='checkBoxOption2']"));
		opt2.click();
		
		//2
		String opt2Name = opt2.getAttribute("value");
		
		//3
		Select s= new Select(driver. findElement(By.id("dropdown-class-example"))); 
		s.selectByValue(opt2Name);
		
		//4
		WebElement enterName= driver.findElement(By.id("name"));
		enterName.sendKeys(opt2Name);
		
		//5
		driver.findElement(By.id("alertbtn")).click();
		String alertText= driver.switchTo().alert().getText();
		Assert.assertTrue(alertText.contains(opt2Name)); //assertTrue(actualString.contains(expectedString));	
	}
}
