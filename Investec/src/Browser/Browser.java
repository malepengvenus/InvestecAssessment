package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.GlobalVariables;

public class Browser {

	

	public static WebDriver driver;
	
	public static void launch() {
		if(GlobalVariables.AUT_BROWSER.equalsIgnoreCase("Chrome")) {
		System.setProperty(GlobalVariables.DRIVERDATA, GlobalVariables.DATALOCATION);  
        
	       driver = new ChromeDriver(); 
	        
	       driver.navigate().to(GlobalVariables.Actimize_URL);
	       driver.manage().window().maximize();
		}
		
	}
}

