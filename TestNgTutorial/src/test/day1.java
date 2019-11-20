package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import datadriven.TestBase;

public class day1 extends TestBase{

	@Test
	public void Demo() 
	{
		System.out.println("hello ");// kod do automatyzacji
		Assert.assertTrue(false);
	}
	@AfterTest
	public void Ostatnia()
	{
		System.out.println("I will execute last in module, i have @AfterTest");
	}
	
	@Test
	public void wyborPrzegladarki() throws IOException {
	Login();
	}
	
	@Test(enabled=false)
	public void SecondTest()
	{
		System.out.println("drugi przypadek testowy w tej samej klasie");
	}
	
	@AfterSuite
	public void afSuite()
	{
		System.out.println("jestem wykonany po zestawie testowym");
	}
	
	
}
