import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;// konieczny import !!!

public class Dropdown_dynam {
//dropdown statyczny 
	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies(); 
		driver.get("http://spicejet.com");

		Actions act =new Actions (driver);
		act.moveToElement(driver.findElement(By.id("divpaxinfo"))).click().build().perform();
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		//Thread.sleep(2000L);// uspienie na 2 sekundy
		s.selectByValue("5"); // wybieram element z listy
		String tekst = driver.findElement(By.id("divpaxinfo")).getText();
		System.out.println(tekst);

	}

}
