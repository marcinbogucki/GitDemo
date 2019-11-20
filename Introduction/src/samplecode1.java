import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class samplecode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		float d=3.00f;
		driver.get("http://www.qaclickacademy.com/interview.php");
		// xpath tekst
		int a=5;
		driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();
		// xpath sibling
		driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();

		// przejscie z siblinga do rodzica i metoda getAtribute pobiera text dla
		// atrybutu podanego jako parametr
		System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));

	}

}
