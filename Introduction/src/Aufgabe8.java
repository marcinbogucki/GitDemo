import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Aufgabe8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		WebElement country= driver.findElement(By.xpath("//input[@id='autocomplete']"));
		country.sendKeys("Pol");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
		
		Actions a= new Actions(driver);
		a.moveToElement(country).build().perform();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String script ="return document.getElementById(\"autocomplete\").value;";
		String text = (String) js.executeScript(script);
		int i=0;
		while (!text.equalsIgnoreCase("POLAND"))
		{
			//przejdz na dol
			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
			i++;
			if(i>6)
			{
				break;
			
			}
		}
	}
}