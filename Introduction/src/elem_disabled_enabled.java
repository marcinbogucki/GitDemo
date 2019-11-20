import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class elem_disabled_enabled {
//dropdown statyczny 
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		
		// czy radio button jest aktywny ( nie dziala dla tej strony, trzeba uzyc metody
		// porownania wartosci opacity
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		//obsluga checkboksow ze znizkami dla lotu
		WebElement zaznaczenie= driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_friendsandfamily']"));
		zaznaczenie.click();
		
		//obsluga wartosci opacity
		System.out.println("wartosc opacity przed klinknieciem radiobutton: ");
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		System.out.println("wartosc opacity po klinknieciu w radiobutton: ");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		//jesli wartosc opacity wynosi 0.5 -> aktywny = false
		//jesli wartosc opacity wynosi 0.5 -> aktywny = true
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.print("is aktive");
			Assert.assertTrue(true);
		}
			else
			{
				System.out.print("is not aktive");
				Assert.assertTrue(false);
			}
}
}
