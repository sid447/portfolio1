package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePageOjects {
	
	public WebDriver driver;
	
	By signin= By.id("header-sign-in");
	
	By createAcc= By.id("hdr-create");
	
	public homePageOjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver= driver;
	}

	public WebElement clicksignin()
	{
		return driver.findElement(signin);
	}
	
	public WebElement clickCreateAcc()
	{
		return driver.findElement(createAcc);
	}

}
