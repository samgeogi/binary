import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;



//import com.relevantcodes.extentreports.LogStatus;

//import com.relevantcodes.extentreports.LogStatus;

//import com.relevantcodes.extentreports.LogStatus;

//import userdefinedlibraries.DriverSetup;

public class Urbanladder_Bookshelves {
    static WebDriver driver;
    @Parameters("browser")
	@BeforeClass
	public void driverconfig(String browser) {
		driver = Urbanladder_SetupDriver.driverInstantiate(browser);
	}
    
    @Test( priority=1)
	void operationSearch() throws Exception
	{
    	Thread.sleep(5000);
    	try{
    		driver.findElement(By.xpath("//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]")).click();
    	}catch(Exception e)
    	{
    		System.out.println("");
    	}
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='search']"));
		ele1.sendKeys("study chair");
		driver.findElement(By.xpath("//button[@id='search_button']//span")).submit();
		
	}
    @Test(priority=2)
	void operationCategory() throws InterruptedException
	{
		
       Actions action = new Actions(driver);
			 WebElement hover1 = driver.findElement(By.xpath("//div[contains(text(),'Category')]"));
			 action.moveToElement(hover1).click().build().perform();
		
			 WebElement w1 = driver.findElement(By.xpath("//label[contains(text(),'Study Chair')]"));
			//status for extent report
		       Actions action1 = new Actions(driver);

			 action1.moveToElement(w1).pause(900).click().build().perform();
			 		
	}
    @Test(priority=3)
	void operationPrice() throws InterruptedException
	{
    	if(Urbanladder_SetupDriver.isAlertPresent(driver))
		 {
			 driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		 }
			 Thread.sleep(1500);
			 WebElement hover3 = driver.findElement(By.xpath("//div[contains(text(),'Price')]"));
		       Actions action = new Actions(driver);

			 action.moveToElement(hover3).click().build().perform();
			
			 WebElement slider = driver.findElement(By.xpath("//div[contains(@class,'noUi-handle noUi-handle-upper')]"));
			 Actions move = new Actions(driver);
		     //Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   
			 Action action1 = (Action) move.dragAndDropBy(slider, -207, 0).build();
		     action1.perform();
		     
		    // WebElement exPrice= driver.findElement(By.xpath("//span[contains(@class,'range-max')]"));
		     
		     //status foe Extent report
		    
		     
		     
	}	 
    @Test( enabled=false)
	void operationStorage() throws InterruptedException
	{
    	if(Urbanladder_SetupDriver.isAlertPresent(driver))
		 {
			 driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		 }
			 WebElement hover2 = driver.findElement(By.xpath("//div[contains(text(),'Storage Type')]"));
			 Actions action=new Actions(driver);
			 action.moveToElement(hover2).pause(300).click().build().perform();
			 //Thread.sleep(2000);
			 WebElement w2 = driver.findElement(By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li[3]/div[2]/div/div/div/ul/li[1]/label"));
					//status for Extent Report		 
			 Actions action1 = new Actions(driver);

			 action1.moveToElement(w2).pause(500).click().build().perform();
	}		
    @Test(priority=4)
	void closePopUp() throws InterruptedException
	{
		Thread.sleep(5000);
		try{
	    driver.findElement(By.xpath("//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]")).click();
		}
		catch(Exception e)
		{
			System.out.println("");
		}
		
		
		
		//Actions a=new Actions(driver);
			 //a.moveToElement(ele).click().build().perform();
			 
		 }
	}
	
	
	
	
	
	
	

