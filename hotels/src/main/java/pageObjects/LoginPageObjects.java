package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	public WebDriver driver;
	
	By username= By.id("sign-in-email");
	
	By password= By.id("sign-in-password");
	
	By submit= By.cssSelector("button[class='cta']");
	
	By errorMsg= By.cssSelector("div[class='msg-error-icon msg-big mb-spider']");
	
	public LoginPageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement getusername()
	{
		return driver.findElement(username);
	}

	
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getsubmit()
	{
		return driver.findElement(submit);
	}
	
	public WebElement geterrorMsg()
	{
		return driver.findElement(errorMsg);
	}
}
