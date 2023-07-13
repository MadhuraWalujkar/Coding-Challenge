package com.testcode.appiumproject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class scenarios extends Base {
	
	@Test
	public void testScenarios() {
		
		
		//Object locators : xpath, id, className, accessibilityId, androidUIautomator
		//driver.findElement(By.xpath(null))
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("//android.widget.LinearLayout[2]")).click();
		String AlertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(AlertTitle,"WiFi settings");//assertion
		
		driver.findElement(By.id("android:id/edit")).sendKeys("no1234");
//		driver.findElement(AppiumBy.className("android.widget.Button")).get(1).click();
		driver.findElement(By.id("android:id/button1")).click();
	}

}
