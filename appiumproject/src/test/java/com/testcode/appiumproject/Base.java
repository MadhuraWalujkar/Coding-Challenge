package com.testcode.appiumproject;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
//import java.time.Duration;
import java.util.Map;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Base {
	
	public AppiumDriverLocalService service;
	public AndroidDriver driver;
	
	@BeforeClass
	public void configureAppium() throws MalformedURLException {
		
		Map<String , String> env = new HashMap<String , String>(System.getenv());
		env.put("ANDROID_HOME","C:\\Users\\shrey\\AppData\\Local\\Android\\Sdk");
		env.put("JAVA_HOME","C:\\Program Files\\Java\\jdk-11");
		
		//Run appium server automatically
		service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\shrey\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
		.withIPAddress("127.0.0.1").usingPort(4723).build();
		
		service.start();
		
		//Create capabilities
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Demo1");
		//C:\Users\shrey\Scala Workspace\appiumproject\src\test\java\Resources\\ApiDemos-debug.apk
		options.setApp(System.getProperty("user.dir")+"\\src\\test\\java\\Resources\\ApiDemos-debug.apk");
		
		//create object for android driver
		driver= new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Object locators : xpath, id, className, accessibilityId, androidUIautomator
				//driver.findElement(By.xpath(null))
				//driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		
//		driver.quit();
//		service.stop();
		
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
		service.stop();
		
	}

}
