package test;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	@Test(groups={"Smoke"})
	public void WebloginHomeLoan()
	{
		System.out.println("naleze do grupy smoke");
		//Kod Selenium do logowaniac
	}
	
	@Parameters({"URL"}) // globalna wartosc atrybutu zostala nadpisana 
	@Test
	public void MobileLoginHomeLoan(String urll)
	{
		System.out.println("MobileLoginHome");
		System.out.println("Przejety parametr: "+ urll);
		//kod Appium 
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		System.out.println("APIloginHome");
		// rest Api automation
	}
}
	