package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups={"Smoke"})
	public void ploan ()
	{
		System.out.println("naleze do grupy Smoke");
	}
	
	@BeforeTest		// metoda zostanie wykonana jako pierwsza przed wszystkimi innymi testami nalezacymi do tego folderu
	public void prerequiste()
	{
	System.out.println("Zostane wykonany jako pierwszy bo mam annotacje @beforetest ");
	}
	
	}
