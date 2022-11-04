package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public WebDriver driver;
	
	public void intializeDriver() throws IOException {
		
		 
		// To read data
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\SelProject1\\src\\main\\java\\Resources\\data.properties");
		
		// access the data.properties file
		
		Properties prop = new  Properties();
		
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\ChromeDriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			
			// firefox code
			
			
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			
			// edge code
		
	}
		
		else {
			
			System.out.println("please enter proper browser value");
		}
		
	
	
	
	
	

	}
	}
