package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browser.Browser;

public class objects {

	public static final String SEARCH = "//*[@id=\"search-toggle\"]/a/div";
	public static final String SEARCH_BOX = "//*[@id=\"searchBarInput\"]";
	public static final String SEARCH_BUTTON = "//*[@id=\"searchBarButton\"]/a/button";
	public static final String CASH_INVESTMENT = "//*[@id=\"content\"]/div[2]/div/div[1]/div/div[1]/a/h4";
	
	public static final String COOKIE = "//*[@id=\"Layer_1\"]";
	
	public static final String SIGN_UP_BUTTON = "/html/body/div[2]/div[3]/div[7]/div[2]/div/div/div[2]/div/div/div[1]/button"; 
	public static final String NAME = "//*[@id=\"content\"]/div[7]/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div/div/div/form/div[1]/section/fieldset[2]/div[1]/text-input/div/div[1]/input"; 
	public static final String SURNAME = "//*[@id=\"content\"]/div[7]/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div/div/div/form/div[1]/section/fieldset[2]/div[2]/text-input/div/div[1]/input";
	public static final String EMAIL = "//*[@id=\"content\"]/div[7]/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div/div/div/form/div[1]/section/fieldset[2]/div[3]/text-input/div/div[1]/input";
	public static final String MY_SELF = "//*[@id=\"content\"]/div[7]/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div/div/div/form/div[1]/section/fieldset[2]/div[4]/checkbox-input/div/div/div[1]/button";
	public static final String SUBMIT_BUTTON = "//*[@id=\"content\"]/div[7]/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div/div/div/form/div[1]/section/fieldset[3]/button";
	
    public static final String OBJ_PASSWORD_TEXTBOX = "";
    public static final String OBJ_LOGIN_BUTTON = "";
    public static WebDriverWait wait = new WebDriverWait(Browser.driver, 1);
    private static JavascriptExecutor element = (JavascriptExecutor) Browser.driver;
    
    public static void input(String UIName, WebElement elementName, String data) throws Throwable{
    	
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(UIName)));
  	  element.executeScript("arguments[0].click()", elementName);
  	elementName.sendKeys(data);
  	
  	  Thread.sleep(5000); 
    }
    
 public static void click(String UIName, WebElement elementName) throws Throwable{
    	
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(UIName)));
  	  element.executeScript("arguments[0].click()", elementName);
  	//elementName.click();
  	
  	  Thread.sleep(5000); 
    }

}
