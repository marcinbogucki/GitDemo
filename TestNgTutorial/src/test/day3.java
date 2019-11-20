package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@BeforeClass
	public void beforeclas()
	{
		System.out.println("jednorazowo przed wykonaniem metod w tej klasie @BeforClass");
	}
	
	@Parameters({"URL","APIKey/usrname"}) 
	@Test
	public void WebloginCarLoan(String urlname,String key)
	{
		System.out.println("Weblogincar");
		System.out.println(urlname);// globalna wartosc atrybutu zostala nadpisana
		System.out.println(key);
		//Kod Selenium do logowania
	}
	
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("uzylem @BeforeMethod");
	}
	
	@AfterClass
	public void afterclas()
	{
		System.out.println("po wykonaniu wszystkich metod w podanej klasie @AfterClass");
	}
	
	@AfterMethod
	public void afterevery()
	{
		System.out.println("uzylem anotacje @AfterMethod");
	}
	
	@Test(groups={"Smoke"})
	public void MobileLogincarLoan()
	{
		System.out.println("naleze do grupy smoke nazywam sie MobileLogincarLoan");
		//kod Appium 
	}
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("Metoda wykonana przed zestawem testowym");
	}
	
	@Test(dataProvider="getData")		
	public void MobilesignoutcarLoan(String username, String password)
	{
		System.out.println("Mobile Signin");
		System.out.println(username);
		System.out.println(password);
	}
	
	@BeforeTest		// metoda zostanie wykonana jako pierwsza przed wszystkimi innymi testami nalezacymi do tego folderu
	public void prerequiste()
	{
	System.out.println("Zostane wykonany jako pierwszy bo mam @BeforeTest");
	}
	
	@Test(dependsOnMethods={"WebloginCarLoan"})
	public void APIcarLoan()
	{
		System.out.println("APIlogincar");
		// rest Api automation
	}
	
	@DataProvider
	public Object[][] getData()
	{
		// pierwsza kombinacja danych - username password -	dobra historia kredytowa
		// druga kombinacja danych - 	username password - brak histori kredytowej
		// trzecia kombinacja - oszukana historia kredytowa
		Object[][] data = new Object[3][2]; // wielowymiarowa tablica objektow 3 wiersze , 2 kolumny
		
		// pierwszy zestaw danych
		data[0][0]="firstusername";
		data[0][1]="firstpasword";
		
		//2 zestaw danych
		data[1][0]="secondusername";
		data[1][1]="secondpasword";
		
		//3 zestaw danych
		data[2][0]="third username";
		data[2][1]="third password";
		
		return data;
	}
}