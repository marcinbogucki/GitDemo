import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tabela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;// suma elementow 
		
		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22747/ind-vs-ban-2nd-t20i-bangladesh-tour-of-india-2019");
	
		// Definiuje szukana tablice aby zagescic szukanie tylko do jednej tablicy
		WebElement tabela= driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		//definiuje wiersze tablicy
		tabela.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms"));//wiersz tablicy
		int count= tabela.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();//trzecia kolumna
	
		for(int i=0;i<count-2;i++)//bez dwoch ostatnich wierszy
		{// z kazdego wiersza wybierz trzeci element dziecko wg wzoru--> nazwa_tagu:nth-child(numer) --> div:nth-child(3)
			
			//System.out.println(tabela.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
			//zliczenie sumy elementow
			String value= tabela.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			//konwersja string (value) na int w celu zliczenia sumy
			sum=sum+Integer.parseInt(value);
		}
		System.out.println("Suma elementow bez wartosci extra: "+ sum);
		
		//pobranie wartosci elementu wyswietlajacego wiersz extra sume wierszy 
		String extras= driver.findElement(By.xpath("//div[text()='Extras']//following-sibling::div")).getText();
		int extrasValue= Integer.parseInt(extras);
		int totalSum=sum+extrasValue;
		
		System.out.println("Suma elementowpo dodaniu wartosci extra: "+ totalSum);
		System.out.println("Kolumna Total " + driver.findElement(By.xpath("//div[text()='Total']//following-sibling::div")).getText());
		
		String actualTotal= driver.findElement(By.xpath("//div[text()='Total']//following-sibling::div")).getText();
		int actualTotalValue= Integer.parseInt(actualTotal);
		if (actualTotalValue==totalSum)
		{
			System.out.println("Wynik zgadza sie");
		}
		else
		{
			System.out.println("Wynik dodawania jest bledny");
		}
	}
}
