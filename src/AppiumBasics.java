import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Service;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;



public class AppiumBasics extends ConfigurationSetUp {
	@Test
	public void AppiumTest() throws MalformedURLException, URISyntaxException {
		
	driver.findElement(AppiumBy.accessibilityId("Preference")).click();
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\'3. Preference dependencies\']")).click();
	driver.findElement(By.id("android:id/checkbox")).click();
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ListView[@resource-id='android:id/list\']/android.widget.LinearLayout[2]/android.widget.RelativeLayout")));
	
	driver.findElement(By.xpath("//android.widget.ListView[@resource-id='android:id/list\']/android.widget.LinearLayout[2]/android.widget.RelativeLayout")).click();
	
	String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
	Assert.assertEquals(alertTitle,"WiFi settings");
		
	driver.findElement(By.id("android:id/edit")).sendKeys("Rahul");
	driver.findElement(By.id("android:id/button1")).click();
	}
	}

//C://Users//RakshaBM//eclipse-workspace//SeleniumFramework//src//resources//ApiDemos-debug.apk