import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;// konieczny import !!!

public class Dropdown {
//dropdown statyczny 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dropdown");
		
		//uzywamy obiektu selektor do operacji na liscie rozwijalnej (dropdownlist)
		Select s= new Select(driver.findElement(By.id("dropdown")));//znajduje liste rozwijalna
		//s.selectByValue("2");//po znalezieniu wzbiera drugi element z listy
		s.selectByIndex(2);//wybor na podstawie indeksu
		s.selectByVisibleText("Option 2");//wybor na podstawie widocznego tekstu na liscie
	}

}
