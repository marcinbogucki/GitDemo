import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkbox {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/checkboxes");
		
		WebElement guzik1= driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]"));
		
		//Assercja sprawdza czy warunek jest falszywy.,jesli tak to test zdany, jesli nie test failed
		//Assercja oczekuje ze warunek bedzie falszywy 
		Assert.assertFalse(guzik1.isSelected());//metoda isSelected zwroci false
		guzik1.click();
		
		//Assercja sprawdza czy warunek jest prawdziwy.,jesli tak to test zdany, jesli nie test failed
		//Assercja oczekuje ze warunek bedzie prawdziwy 
		Assert.assertTrue(guzik1.isSelected());
		
		
		WebElement guzik2= driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]"));
		
		//Assert.assertFalse(guzik2.isSelected());//oczekuje false ale znajduje true (bo domyslnie jest true)
		// !!!!!!!!!!!!! skrypt przerywa dzialanie
		guzik2.click();
		//Assert.assertTrue(guzik2.isSelected());//oczekuje true
		
		//Zliczenie liczby checkboxow
		int ile = driver.findElements(By.xpath("//*[@type='checkbox']")).size();
		
		//Asercja porownujaca dwie wartosci (czy na stronie sa dwa checkboksy, czy wartosc ile rowna jest 2)
		Assert.assertEquals(ile, 5);
		System.out.println("Na stronie znaleziono: "+ile+" element(y) chceckbox");
	}	
}
