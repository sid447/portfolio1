package E2Etesting.expedia;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;
import pageObjects.homePageOjects;
import resources.Base;

public class LoginPage extends Base {
	
	public WebDriver driver;
	
	public static Logger log =LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	
	public void initialize() throws IOException
	{
		driver=InitializeDriver();
		log.info("driver initialized successfully");
		driver.get(prop.getProperty("url"));
	}
	
	
	
	@Test
	
	public void testLogin() throws IOException, InterruptedException
	
	{
		
		homePageOjects s= new homePageOjects(driver);
		s.clicksignin().click();
		
		LoginPageObjects lp=new LoginPageObjects(driver);
		 lp.getusername().sendKeys("test1");
		 lp.getpassword().sendKeys("test");
		 
		  Thread.sleep(3000);
		 
		 lp.getsubmit().click();
		 
		 AssertJUnit.assertTrue(lp.geterrorMsg().isDisplayed());	
		 log.info("Login with incorrect username and password is validated");
		 
		 
	}
	
	
	
	@AfterTest
	
	public void teardown()
	{
		driver.close();
	}
	
	
	
	
	

}
