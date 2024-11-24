import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


public class ConfigurationSetUp 
{

	public AndroidDriver driver;
	@BeforeClass
	public void configuration() throws MalformedURLException, URISyntaxException
	{
		String activeDirectoryPath = System.getProperty("user.dir");
		System.out.println(activeDirectoryPath+"//src//resources//ApiDemos-debug.apk");
		//Start appium server
				/*AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("Users//RakshaBM//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
						.withIPAddress("127.0.0.1")
						.usingPort(4723).build();
				
				service.start();
				*/
				//create object of AndroidDriver class
				UiAutomator2Options options = new UiAutomator2Options();
				options.setDeviceName("Medium Phone API 35");
				options.setApp(activeDirectoryPath+"//src//resources//ApiDemos-debug.apk");
				
//				From Java 20 URL class is deprecated. So use URI class and convert it to toURL() as AndroidDriver expects URL
				driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
	}
	@AfterClass
	public void deallocation()
	{
        driver.quit();
		
//		service.stop(); //Stop the server
	}
}
