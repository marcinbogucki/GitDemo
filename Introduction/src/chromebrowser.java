import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.System;


public class chromebrowser {

	public static void main(String[] args) {				
		
		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("To moj zajebisty test");
		driver.findElement(By.name("pass")).sendKeys("12345");
		driver.findElement(By.linkText("Passwort vergessen?")).click();*/
		driver.findElement(By.className("inputtext")).sendKeys("siema");
		driver.findElement(By.cssSelector("#email")).sendKeys("mde@wp.pl");
		
		//driver.close();
	}

}
