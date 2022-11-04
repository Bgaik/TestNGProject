package TestCases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import Resources.BaseClass;

public class VerifyLogin extends BaseClass{
	
	@Test
	
		public void login() throws IOException {
		
		intializeDriver();
		
		// this driver has scope
		driver.get("https://login.salesforce.com/");
		
		//driver.findElement(By.xpath("//path")).sendKeys("test");  
		
		LoginPageObjects obj = new LoginPageObjects(driver);
		
		obj.enterUsername().sendKeys("test");
		
		obj.enterPassword().sendKeys("test123");
		
		obj.clickOnLogin().click();
		
		
		ssss
	}

}