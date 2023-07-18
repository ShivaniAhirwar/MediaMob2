package MobberAccount;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.File_Utility;
import Generic_Utilities.WebDriver_Utility;
import POM_Mobber.LoginAsMobber;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeclineProjectTest  extends BaseClass
{
     @Test
     public void delineProject() throws Throwable
     {
    	File_Utility filLib=new File_Utility();
 	    String url = filLib.getCommonData("URL");
 	    String email = filLib.getCommonData("Email");
 	    String Password = filLib.getCommonData("Password");
   	 driver.get(url);

 	    WebDriver_Utility weblib=new WebDriver_Utility();
 	    weblib.implicitlywait(driver);
 	    weblib.maximizeScreen(driver);
 	    LoginAsMobber mobber=new LoginAsMobber(driver);
 	    mobber.loginasMobber(email, Password);
 	    Thread.sleep(3000);
 	    try
 	    {
 	    	 WebElement projectTable = driver.findElement(By.xpath("//h2[@class=\"offers_offerhead__AqU3M\"]"));
 	    	System.out.println("Please assign projects to mobber");
 	    }
 	    catch(NoSuchElementException n)
 	    {
 	    	System.out.println("Projects are assigned");
 	    WebElement projectName = driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]"));
 	    JavascriptExecutor js=(JavascriptExecutor) driver;
 	    js.executeScript("arguments[0].scrollIntoView(true)", projectName);
 	    
 	    Thread.sleep(3000);
 	    projectName.click();
 
 	    driver.findElement(By.xpath("//button[text()='Decline']")).click();
 	    driver.findElement(By.xpath("//button[text()='Submit']")).click();
 	    }
 	    
     }
}
