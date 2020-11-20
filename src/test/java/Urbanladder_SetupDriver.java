import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoAlertPresentException;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

//import userdefinedlibraries.DriverSetup;
public class Urbanladder_SetupDriver {
	public static WebDriver driver;

	public static String exePath;

	public static String url = "https://www.urbanladder.com";

	public static String browsertype;

	public static boolean isAlertPresent(WebDriver driver)
    {
		//check whether alert box displays on the screen
        try
        {
            driver.switchTo().alert();
            return true;
        }   // try
        catch (NoAlertPresentException Ex)
        {
            return false;
        }   // catch
		
    }
	
	
	public static WebDriver driverInstantiate(String browser) {  //this method is used to instantiate the driver

	browsertype= browser;

	if(browsertype.equalsIgnoreCase("chrome")) {

	exePath = "C:\\Users\\sam\\Desktop\\sa\\Drivers\\chromedriver.exe";

	System.setProperty("webdriver.chrome.driver", exePath);

	driver = new ChromeDriver();

	}


	driver.manage().window().maximize();

	driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);

	driver.get(url);

	driver.manage().deleteAllCookies();

	return driver;
	
	}
	public static void driverClose()

	{

	Urbanladder_SetupDriver.driver.close();

	}

}
