package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Browser.Browser;
import objects.objects;
import utility.GlobalVariables;

public class TestRunner {
  @Test
  public void TestIvestec() throws InterruptedException {
	  try {
	  Browser.launch();
	  
	  
	  
	  Browser.driver.findElement(By.xpath(objects.SEARCH)).click();
	  Thread.sleep(2000);
	  Browser.driver.findElement(By.xpath(objects.SEARCH_BOX)).sendKeys("understanding cash investment rates");
	  
	  Browser.driver.findElement(By.xpath(objects.SEARCH_BUTTON)).click();
	  Browser.driver.findElement(By.xpath(objects.CASH_INVESTMENT)).click();
	  
	  //Browser.driver.findElement(By.xpath(objects.SIGN_UP_BUTTON)).click();
	  //Browser.driver.findElement(By.xpath(objects.COOKIE)).click();
	 Thread.sleep(5000); 
	 WebElement signupButton = Browser.driver.findElement(By.xpath(objects.SIGN_UP_BUTTON));
	
	  
	 objects.click(objects.SIGN_UP_BUTTON, signupButton);
	  
	  
	  WebElement nameTextBox = Browser.driver.findElement(By.xpath(objects.NAME));
	  WebElement surnameTextBox = Browser.driver.findElement(By.xpath(objects.SURNAME));
	  WebElement emailTextBox = Browser.driver.findElement(By.xpath(objects.EMAIL));
	  WebElement mySelfCheck = Browser.driver.findElement(By.xpath(objects.MY_SELF));
	  WebElement submitButton = Browser.driver.findElement(By.xpath(objects.SUBMIT_BUTTON));
	  
	 objects.input(objects.NAME, nameTextBox, "Malekutu Venus");
	 objects.input(objects.SURNAME, surnameTextBox, "Malepeng");
	  objects.input(objects.EMAIL, emailTextBox, "test@investec.co.za");
	objects.click(objects.MY_SELF, mySelfCheck);
	objects.click(objects.SUBMIT_BUTTON, submitButton);
	  
	  
	  }catch (Throwable e) {
		System.out.println("Error occured..."+e.getMessage());
	}finally {
		Browser.driver.close();
	}
  }
}