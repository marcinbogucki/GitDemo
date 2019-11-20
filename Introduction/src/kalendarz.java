import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class kalendarz {
//dropdown statyczny 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");

		// wzbor zrodla i celu lotu
		Thread.sleep(2000L);// uspienie na 2 sekundy
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000L);// uspienie na 2 sekundy
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		// obsluga dynamicznego Kalendarza na stronie
		// tworzenie lokatora css: (kropka na poczatku i zamiana spacji na kropki)
		// wybor aktualnej daty, na temat wyboru innych dat bedzie w kolejnych lekcjach
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover"))
				.click();

		// obsluga checkboksow ze znizkami dla lotu
		WebElement zaznaczenie = driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_friendsandfamily']"));
		Assert.assertFalse(zaznaczenie.isSelected());
		zaznaczenie.click();
		Assert.assertTrue(zaznaczenie.isSelected());

	}
}
