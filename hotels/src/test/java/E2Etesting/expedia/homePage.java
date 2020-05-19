package E2Etesting.expedia;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.homePageOjects;
import resources.Base;

public class homePage extends Base {
	
	public WebDriver driver;

	
@BeforeTest
	
	public void initialize() throws IOException
	{
		driver=InitializeDriver();
		driver.get(prop.getProperty("url"));
	}


	@Test
	
	public void homePageNavigation() throws IOException
	{
		
		
		homePageOjects s= new homePageOjects(driver);
		s.clicksignin().click();
		
	}
	
@AfterTest
	
	public void teardown()
	{
		driver.close();
	}
	
	
}
