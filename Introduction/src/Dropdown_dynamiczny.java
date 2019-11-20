import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;// konieczny import !!!

public class Dropdown_dynamiczny {
//dropdown statyczny 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://spicejet.com");
		Thread.sleep(2000L);//uspienie na 2 sekundy
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000L);//uspienie na 2 sekundy
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		
		
		
	}

}
