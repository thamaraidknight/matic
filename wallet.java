package matic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class wallet {



	public static  AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	//public static void main ( String[] args) throws MalformedURLException
	{
		// TODO Auto-generated method stub
		DesiredCapabilities C1 = new DesiredCapabilities();
	
		C1.setCapability(MobileCapabilityType.DEVICE_NAME, "d24311ba");
		C1.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		C1.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		//C1.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		C1.setCapability(MobileCapabilityType.APPLICATION_NAME, "Matic Wallet");
		
		C1.setCapability("appPackage", "network.matic.wallet");
		C1.setCapability("appActivity", "network.matic.wallet.MainActivity");

		
		
		
	
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/WD/hub"),C1);
		
		return driver;
		
		
	}

}
