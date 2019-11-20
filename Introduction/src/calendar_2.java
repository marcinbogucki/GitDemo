import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		// koncepcja generycznej metody do wybrania daty z kalendarza ( do uzycia kalendarza na roznych stronach)
		//august 23
		driver.findElement(By.id("travel_date")).click();
		
		
		//dopoki text pobrany z etykiety z miesiacem nie zawiera "April" (negacja)
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
		{
			//kliknij przycisk next (szukaj April)
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();//relacja parent-child
			
		}
					//szukam daty
		// wszystkie daty w aktualnym miesiacu przypisz do listy typu WebElement
		//znalezc wspolny atrybut dla dat i wlozyc do listy i iterowac
		List<WebElement> daty = driver.findElements(By.cssSelector(".day"));
		int count= driver.findElements(By.cssSelector("td.day")).size();
		System.out.println(count);
		
		for (int i=0;i<=count;i++)
		{
			String text= driver.findElements(By.cssSelector("td.day")).get(i).getText();
			if(text.equalsIgnoreCase("21"))
			{
				driver.findElements(By.cssSelector("td.day")).get(i).click();
				break;
			}
		}
		
		
	}

}
