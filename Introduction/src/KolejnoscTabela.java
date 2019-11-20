import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class KolejnoscTabela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 odczytanie wartosci z kolumny "nazwa owocu"
		//2 wlozenie pobranych wartosci do Listy1 typu ArrayList
		//3 skopiowanie Listy1 do nowej listy Lista2
		//4 posortowanie Listy Lista2
		//5 porownanie obu list w celu sprawdzenia czy pobrana Lista1 byla posortowana
		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		// tr->table row, th->>table_header, child(2)-->kolumn(2) ...powoduje uporzadkowanie tabeli w kolejnosci rosnacej/malejacej 
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click(); //zmiana wyswietlania rosnaca /malejaco
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click(); 
		//driver.manage().window().maximize();
		
		List<WebElement> firstColList= driver.findElements(By.cssSelector("tr td:nth-child(2)"));//pobieram druga kolumne tabeli
		
		ArrayList<String> originalList=new ArrayList<String>(); //tworzymy obiekt ArrayList typu String
		
		//kopiuje elementy do drugiej listy
		for(int i=0;i<firstColList.size();i++)
		{	// pobieramy kazda wartosc z pierwszej listy i dodajemy do drugiej listy
			originalList.add(firstColList.get(i).getText()); 
		}
		
		// tworzymy kopie drugiej listy ktora potem posortujemy
		ArrayList<String> copiedList = new ArrayList<String>();
		for(int i=0; i<originalList.size();i++)
		{
			copiedList.add(originalList.get(i));
		}
		for(String s:originalList) //dla kazdego elementu typu string w liscie //to samo co for(i=0;i<copiedList.size();i++)
		{
			System.out.println(s); //wyswietl kazdy element listy 
		}
		//sortowanie copiedList
		Collections.sort(copiedList);//sort rosnace(A-Z)
		Collections.reverse(copiedList);// sort malejace (Z-A)
		System.out.println("*********************");
		//petla do wyswietlenia elementow z listy
		for(String s:copiedList) //dla kazdego elementu typu string w liscie //to samo co for(i=0;i<copiedList.size();i++)
		{
			System.out.println(s); //wyswietl kazdy element listy
		}
		System.out.println("*********************");
		//porownanie dwoch list
		Assert.assertTrue(originalList.equals(copiedList));// jesli lista pobrana jest identyczna z posortowana to zwroci True 
	}
}
