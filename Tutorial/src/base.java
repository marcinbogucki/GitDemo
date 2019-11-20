import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {
// metoda standardowa dolaczana do kazdego testu
	public static Capabilities () throws MalformedURLException {

/*Desired Capabilities � informacje ktore daje serwerowi
1. Chce Otworzyc emulator o nazwie Moj_Handy
2. jaka aplikacje bede instalowac na emulatorze
3. polaczeni z serwerem
*/
		
		// uzywamy obiektow file zeby uniknac problemow ze sciezka do pliku i zeby program dzialal na innym sprzecie
		File f = new File ("src");// idz do folder zrodlowy
		File fs = new File (f,"ApiDemos-debug.apk");// idz do nazwy aplikacji
		
		// Krok 1 informacje do przekazania dla serwera
		DesiredCapabilities cap = new DesiredCapabilities(); // klasa do wyslania informacji na serwer
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Handy");	// emulator o nazwie Moj_Handy
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());// aplikacja ktora bede testowac
		
		// Krok 2 polaczenie z serwerem, jako parametr dostaje adres serwera Appium(localhost:port/webdriver/hub) oraz obiekt capabilities
		AndroidDriver<AndroidElement> driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);// nazwa serwera 		
		return driver;
	}
}