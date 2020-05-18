package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public WebDriver driver;
	
public WebDriver InitializeDriver() throws IOException
	{
		
	Properties prop=new Properties();
	FileInputStream fis= new FileInputStream("//Users//siddhi//mysandbox//STS//portfolio1//expedia//src//main//java//resources//data.properties");
	prop.load(fis);
	
	String browserName=prop.getProperty("browser");
	
	
	
	if (browserName.equals("chrome"))
			{
		    System.setProperty("webdriver.chrome.driver", "//Users//siddhi//Downloads//chromedriver");
		     driver=new ChromeDriver();
		
			}
	
	else if (browserName.equals("firefox"))
	{
		 System.setProperty("webdriver.gecko.driver", "//Users//siddhi//Downloads//geckodriver");
		    driver=new FirefoxDriver();
	}
	
	else if (browserName.equals("ie"))
	{
		 System.setProperty("webdriver.ie.driver", "tests");
		     driver=new ChromeDriver();
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.close();
	
	return driver;
}
	
}
