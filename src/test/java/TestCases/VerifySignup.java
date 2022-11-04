package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignUpPageObjects;
import Resources.BaseClass;

public class VerifySignup extends BaseClass {
	
	@Test
	
	public void signup() throws IOException, InterruptedException {
		
		intializeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		LoginPageObjects LPO = new LoginPageObjects(driver);
		
		LPO.clickOntryForFree().click();
		
		SignUpPageObjects SPO = new SignUpPageObjects(driver);
		
	 
		Thread.sleep(5000);
		SPO.enterFristname().sendKeys("rutuja");
		SPO.enterLastname().sendKeys("shinde");
		SPO.enterJobTitle().sendKeys("QA Automation Engineer");
		SPO.enterEmail().sendKeys("Rutu20Shinde@gmail.com");
		SPO.enterPhone().sendKeys("9826766725");
		
		WebElement e = SPO.selectEmployees();
		Select s = new Select(e);
		s.selectByIndex(1);
		
		
		
	}

	

}
