import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class Aufgabe7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		WebElement tabela= driver.findElement(By.cssSelector("table[class='table-display']"));
		// table rows
		System.out.println(tabela.findElements(By.tagName("tr")).size() +" columns");
		//table columns
		System.out.println(tabela.findElements(By.tagName("th")).size() +" rows");
		
		// second row 2 sposoby
		System.out.println(driver.findElement(By.cssSelector("table[class='table-display'] tr:nth-child(3)")).getText());
	}
}