import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends base { //dziedzicze metode capabilites od klasy base

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver=Capabilities(); //wywoluje metode Capabilities() aby otrzymac obiekt driver
		
	}

}
