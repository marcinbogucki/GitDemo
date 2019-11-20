import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class liczba_linkow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pobierz liczbe linkow na stronie
		// linki maja tag --> a
		
		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());//wyswietla calkowita liczbe linkow na stronie
	}

}
