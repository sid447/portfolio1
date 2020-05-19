package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreatAccPageObjects {
	
	public WebDriver driver;
	
	By createAcctext= By.tagName("h1");
	
	
	
	public CreatAccPageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	


	public WebElement getCreateAccText()
	{
		return driver.findElement(createAcctext);
	}

	

}
