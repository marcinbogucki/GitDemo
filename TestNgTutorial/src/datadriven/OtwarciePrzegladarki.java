package datadriven;

import java.io.IOException;

import org.testng.annotations.Test;

public class OtwarciePrzegladarki extends TestBase{
	
	@Test
	public void OpeningBrowser() throws IOException
	{
		//Test otwiera przegladarke i dziedziczy metode TestBase  do Logowania
		Login();
	}
	
	}