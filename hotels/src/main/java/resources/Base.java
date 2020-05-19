package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public WebDriver driver;
	
	public Properties prop;

	
public WebDriver InitializeDriver() throws IOException
	{
		
	 prop=new Properties();
	FileInputStream fis= new FileInputStream("//Users//siddhi//mysandbox//STS//portfolio1//hotels//src//main//java//resources//data.properties");
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
	
	// driver.close();
	
	return driver;
}

public void getScreenShotPath(String TestCaseName, WebDriver driver) throws IOException
{
	TakesScreenshot ts= (TakesScreenshot) driver;
	
	File source= ts.getScreenshotAs(OutputType.FILE);
	
	String destinationFile=System.getProperty("user.dir")+"\\reports\\"+"TestCaseName"+".png";
	
	FileUtils.copyFile(source, new File(destinationFile));

}
	
}
