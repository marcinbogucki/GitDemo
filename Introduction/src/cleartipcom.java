import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cleartipcom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*
		 * 1.autosugestive dropdown ominac ( bedzie omowiony pozniej) 2. wybrac liczbe
		 * pasazerow dzieci i doroslych( statyczny dropdown -obiekt Select) 3. wybrac
		 * dzisiejsza date 4. kliknac link "more options" 5. wpisac linie lotnicza
		 * "indigo" 6. kliknac wyszukaj lot 7. przejac error message i wyswietlic ja na
		 * wyjsciu
		 */

		// 1
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://cleartrip.com");

		// 2
		Select a = new Select(driver.findElement(By.id("Adults")));
		a.selectByIndex(2);
		Select c = new Select(driver.findElement(By.id("Childrens")));
		c.selectByIndex(4);

		// 3
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();
		
		Thread.sleep(1000L);// uspienie na 2 sekundy
		driver.findElement(By.xpath("//input[@id='AirlineAutocomplete']")).sendKeys("indigo");
		Thread.sleep(2000L);// uspienie na 2 sekundy
		driver.findElement(By.cssSelector("input[id='SearchBtn']")).click();
		Thread.sleep(2000L);// uspienie na 2 sekundy

		// 6
		String tekst = driver.findElement(By.cssSelector("div[id='homeErrorMessage']")).getText();
		System.out.println(tekst);
	}

}
