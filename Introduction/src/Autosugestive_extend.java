import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugestive_extend {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		//System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());//nie zadziala
		//...bo selenium nie jest w stanie identyfikowac ukrytych elementow
		
		// JavaScript DOM moze wyciagnac ukryte elementy
		// przesledzic wlasciwosci objektu jesli posiada ukryty text
		//Jak uzyc javascript w Java??--> JavascriptExecutor
	
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String script ="return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);
		int i=0;
		while (!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))	//dopoki tekst nie zgadza sie 
			{
				//przejdz na dol
				driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);//pobierz wartosc
				text = (String) js.executeScript(script);//wywolaj skrypt
				System.out.println(text);
				i++;
				if(i>10)
				{
					break;
				
				}
			}
		if (i>10)
			System.out.println("element nie znaleziony");
		
	}

}
