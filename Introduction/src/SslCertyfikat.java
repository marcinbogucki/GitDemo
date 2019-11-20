import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SslCertyfikat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//certyfikat SSL(Secure Sockets Layer)SSL 
		//profil do akceptacji niezabezpieczonych certyfikatow ssl
		
		DesiredCapabilities ch= DesiredCapabilities.chrome();
		ch.acceptInsecureCerts();// do niezabezbieczonych
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);//akceptuje wszystkie niezabezpieczone certyfikaty
		//ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		// dolaczenie profilu do wlasciwosci przegladarki
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
	}

}
