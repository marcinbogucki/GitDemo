import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.pl");
		
		// casting obiektu driver do TakesScreenshot i wywolanie metody getScreenshotAs
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  //casting 
		
		//skopiowanie pliku z obiektu File do podanej lokalizacji 
		FileUtils.copyFile(src,new File("C://Users/mbogu/screenshot.png")); 
		
	}

}
