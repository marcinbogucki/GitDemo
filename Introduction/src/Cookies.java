import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//usuniecie wszystkich cookies
		driver.manage().deleteAllCookies();
		
		//usuniecie okreslonego cookie
		driver.manage().deleteCookieNamed("nazwa_cookie");
	}

}
