package MobberAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic_Utilities.WebDriver_Utility;
import POM_Mobber.RegistrationPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration 
{
	    @Test
        public void moberRegistration() throws Throwable
        {
	    	 WebDriverManager.chromedriver().setup();	
		     WebDriver driver=new ChromeDriver();
		      
		      driver.get("https://dev24.mediamob.io/");
		      WebDriver_Utility webLib=new WebDriver_Utility();
		      webLib.implicitlywait(driver);
		      webLib.maximizeScreen(driver);
		      
		      RegistrationPage registerMobber=new RegistrationPage(driver);
		      registerMobber.newRegistration("tru", "test", "tru_tes1@tru.agency", "Domain@1234", "Domain@1234");
		    
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("//span[@id=\"recaptcha-anchor\"]/div[@class=\"recaptcha-checkbox-checkmark\"]"));
            Thread.sleep(3000);
     WebElement captch = driver.findElement(By.xpath("//span[@id=\"recaptcha-anchor\"]/div[@class=\"recaptcha-checkbox-checkmark\"]"));
            JavascriptExecutor js1=(JavascriptExecutor) driver;
            js1.executeScript("arguments[0].click()", captch);
            try {
            
            	registerMobber.clickActions();
            }
            catch(ElementClickInterceptedException e)
            {
            	
            	registerMobber.clickActions();
            } 
         
            	  WebElement button = driver.findElement(By.xpath("//div[@class=\"Home_loginRegisterBtn__95h0E\"]/button[text()='Sign up']"));
                  JavascriptExecutor js= (JavascriptExecutor) driver;
                  js.executeScript("arguments[0].click()", button);

   }
}
