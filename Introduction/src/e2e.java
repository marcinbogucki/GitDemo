import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class e2e {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		/*1.wybrac zrodlo podrozy
		2.wybrac cel podrozy
		3. wybarac date dzisiejsza
		4.upewnic sie ze drugi kalendarz jest nieaktywny
		5.wybrac 3 pasazerow
		6.wybrac walute
		7.kliknac wyszukaj lot */
		
		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://spicejet.com");
		//1
		WebElement zrodlo = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
		zrodlo.sendKeys("BLR");
		Thread.sleep(2000L);//uspienie na 2 sekun
		//2
		WebElement cel = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		cel.click();
		cel.sendKeys("DEL");
		//3
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		//4
		
		Thread.sleep(2000L);//uspienie na 2 sekun
		Actions act =new Actions (driver);
		act.moveToElement(driver.findElement(By.id("divpaxinfo"))).click().build().perform();
	
		//driver.findElement(By.cssSelector("")).click();//najpierw kliknac,bo jest nieaktywne
		Thread.sleep(2000L);//uspienie na 2 sekun
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']//option[3]")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"3 Adult");
		//6
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")).sendKeys("U");
		//7
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		getScreenshoot();
		
	}
	public static void getScreenshoot()
	{
		System.out.println("jestem w funkcji");
	}
	}