import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// 	//tag_name[@atribute='value'] skladnia dla XPath  //div[@class='identify']  lub //*[@class='identify']
		//	tagname[attribute='value']	  skladnia dla CSS  	div[class='identify']   lub [class='identify']
		
		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=de");
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("siemanko");
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("12345");
		//driver.findElement(By.xpath("//*[@id='Login']")).click();
		driver.findElement(By.cssSelector(".button.r4.wide.primary")).click();
	}
}
