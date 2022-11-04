package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {
	
	public WebDriver driver;
	
	By fristname = By.xpath("//input[@name='UserFirstName']");
    By Lastname = By.xpath("//input[@name='UserLastName']");
    By JobTitle = By.xpath("//input[@name='UserTitle']");
    By Email = By.xpath("//input[@name='UserEmail']");
    By phone = By.xpath("//input[@name='UserPhone']");
    By Empolyees = By.xpath("//select[@name='CompanyEmployees']");
    
       
	



	public SignUpPageObjects(WebDriver driver2) {
		
		this.driver = driver2;
	}


	public WebElement enterFristname() {
    	
    	return driver.findElement(fristname);
    	
    }
	
    
    public WebElement enterLastname() {
    	
    	return driver.findElement(Lastname);
    	
    }
  
    
    public WebElement selectEmployees() {
    	
    	return driver.findElement(Empolyees);
    	
    }
    
    public WebElement enterJobTitle() {
    	
    	return driver.findElement(JobTitle);
    	
    }
    
     public WebElement enterEmail() {
    	
    	return driver.findElement(Email);
    	
    }
  public WebElement enterPhone() {
    	
    	return driver.findElement(phone);
    	
    }
	
	

}
