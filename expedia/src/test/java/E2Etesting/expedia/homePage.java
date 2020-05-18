package E2Etesting.expedia;

import java.io.IOException;

import org.testng.annotations.Test;

import resources.Base;

public class homePage extends Base {

	@Test
	
	public void homePageNavigation() throws IOException
	{
		driver=InitializeDriver();
		driver.get("https://www.expedia.com/");
	}
}
