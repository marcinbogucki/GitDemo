import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.Eclipse.jetty.http.Http1FieldPreEncoder;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;

public class TestZdalny {

	public static void main(String[] args) throws MalformedURLException {
		//Cross browser testing ( testowanie na roznych przegladarkach)

		//klasa DesiredCapabilites okresla na jakiej przegladarce i na jakim systemie operacyjnym test powinien zostac wykonany
		//ponizszy kod uruchomi test na Nodzie z przegladarka chrome i systemem windows
		DesiredCapabilities dc=new DesiredCapabilities();
		
		dc.setBrowserName("chrome");// ustalam nazwe przegladarki dla testu
		dc.setPlatform(Platform.WINDOWS);// ustalam system operacjyjny

		//tworze obiekt zdalnego drivera, jako parametr podaje adres Hub(localhost) i obiekt dc (nazwe przegladarki i platforme )
		WebDriver driver= new RemoteWebDriver(new URL("http://192.168.178.36:4444/wd/hub"),dc);
		driver.get("http://google.pl");
		// wywala blad prawdopodobnie wymagana java 1.8
		
		
		// tu piszemy dalszy kod testowy
	}

	
}

