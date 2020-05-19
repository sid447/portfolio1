package E2Etesting.expedia;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.CreatAccPageObjects;
import pageObjects.homePageOjects;
import resources.Base;

public class CreateAccPage extends Base {
	
	public WebDriver driver;
	
@BeforeTest
	
	public void initialize() throws IOException
	{
		driver=InitializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	
	@Test
	
	public void createAccPageNav() throws IOException
	{
		
		homePageOjects s= new homePageOjects(driver);
		s.clickCreateAcc().click();
		
		CreatAccPageObjects ca=new CreatAccPageObjects(driver);
		
		System.out.println(ca.getCreateAccText().getText());
	}
	
	
@AfterTest
	
	public void teardown()
	{
		driver.close();
	}

}
