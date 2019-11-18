package matic;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Wait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class newac extends wallet {

	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		AndroidDriver<AndroidElement> driver= capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		System.out.println(driver);
		
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	
		
		driver.findElementByXPath("//android.widget.TextView[@text='New Account']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Next']").click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Next']").click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Next']").click();
		//driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]").click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Next']").click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Accept & Continue']").click();
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:/temp/Screenshot.jpg"));
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Verify Passphrase']").click();
		
		
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='I&apos;m all set!']").click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		System.out.println("element clicked");
		
		
		driver.findElementByXPath("//android.widget.TextView[@text='Get Started']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Next']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Next']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Next']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Next']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Finish']").click();
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


//driver.findElementByXPath("//android.widget.Button[@content-desc="Settings, tab, 4 of 4"]/android.view.ViewGroup").click();

		MobileElement els1 = (MobileElement) driver.findElementsByXPath("//android.widget.Button[@content-desc=\"Settings, tab, 4 of 4\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup\n");
		els1.click();
driver.findElementByXPath("//android.widget.TextView[@text='Switch to Dev Mode']").click();


		
		
}
}