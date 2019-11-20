import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class base {

	/**
	 * 
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		 * uzycie implicity wait powoduje ze selenium czeka maks.sekund na pojawienie
		 * sie elementu na stronie zanim wywali blad implicity jest uzyte globalnie
		 * odnosi sie do kazdego elementu
		 */
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);// odnosi sie do calego testu (globalnie)
		
		WebDriverWait w = new WebDriverWait(driver, 5);//do uzycia explicit wait

		String[] szukane = { "Cucumber", "Brocolli", "Beetroot" }; // tablica stringow tablica zajmuje miej pameici niz
																	// ArrayList
		driver.get("http://rahulshettyacademy.com/seleniumPractise");
		Thread.sleep(3000);
		dodajElementy(driver, szukane); // wywolanie metody statycznej czyli bez tworzenia obiektu
		/*
		 * gdy metoda wywolywana nie jest statyczna to trzeba utwrozyc objekt tej klasy
		 * i tym obiekcie wywolac metode base b =new base(); b.dodajElementy(driver,
		 * szukane);
		 */
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();// za pomoca CSS tagname[attribute='value']
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));//czekaj az bedzie widoczny
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");// tagname.clasname
		driver.findElement(By.cssSelector("button.promoBtn")).click();// nazwatagu.nazwaklasy

		/*
		 * explicit wait- ma wplyw tylko na jeden okreslony element 1.Stworzyc obiekt
		 * WebDriverWait(webdriver,czas) 2.wywolac metode until z odpowiednimi
		 * parametrami
		 */

		// czekaj 5 sekund az element bedzie widoczny
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

		String tekst_kontrolny = driver.findElement(By.cssSelector("span.promoInfo")).getText();
		Assert.assertEquals(tekst_kontrolny, "Promo code applied successfully!");
		System.out.println(tekst_kontrolny);
	}

	// metoda musi byc statyczna bo jest wywolywana bez tworzenia obiektu klasy
	public static void dodajElementy(WebDriver driver, String[] szukane) { // metoda musi dostac referencje do obiektu
																			// driver i tablice

		int j = 0;
		// selector "h4.produkt-name" zwraca 30 elementow , dodaje je do Listy -->
		List<WebElement> produkty = driver.findElements(By.cssSelector("h4.product-name"));

		List listaElemSzuka = Arrays.asList(szukane);// konwersja array na ArrayList zeby potem uzyc metode contains

		/*
		 * w petli pobieram kolejno nazwe kazdego elemntu ->> produkty.get(i).getText()
		 * , jeslis ie zgadza to klikam na element i przerywam dzialanie petli
		 */

		for (int i = 0; i < produkty.size(); i++) {
			String[] name = produkty.get(i).getText().split("-"); // name[0] cucumber, name[1] - brocoli
			String formattedName = name[0].trim();
			// sformatowac nazwe warzywa zeby nie zawierala (- 1 Kg)

			if (listaElemSzuka.contains(formattedName)) { // nazwe kolejnego elementu porownuje z nazwa elementu
															// szukanego
				j++; // click on Add Cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();// get(i) zwraca
																										// // elementWEB
																										// pod
				// indeksem (i) Listy
				if (j == listaElemSzuka.size())
					break;
			}

		}

	}

}