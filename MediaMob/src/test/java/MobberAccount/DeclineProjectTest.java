package MobberAccount;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import DynamicXpathResource.DynamicXpathResource;

import java.util.List;

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
 	    List<WebElement> projectName = driver.findElements(By.xpath("//span[@class=\"ant-tag ant-tag-volcano offerTablesecond_offerwaringTagOutter__OyxaI\"]"
 	    		+ "/p[text()='In Progress']/ancestor::tr/td[2]/p[text()='"+DynamicXpathResource.DeclineProjectByMobber+"']"));
// 	    JavascriptExecutor js=(JavascriptExecutor) driver;
// 	    js.executeScript("arguments[0].scrollIntoView(true)", projectName);
 	    
 	    for(WebElement e:projectName)
 	    {
 	    	String project1 = e.getText();
 	    	System.out.println(project1);
 	    	if(project1.equalsIgnoreCase(DynamicXpathResource.DeclineProjectByMobber))
 	    	{
 	    		Thread.sleep(3000);	
 	    		JavascriptExecutor js=(JavascriptExecutor) driver;
 	    	    js.executeScript("arguments[0].scrollIntoView(true)", e);
 	    	    Thread.sleep(3000);
 	    	    e.click();
 	    		break;
 	    	}
 	    }
 	    
 	    Thread.sleep(3000);
 	   

 	    driver.findElement(By.xpath("//button[text()='Decline']")).click();
 	    driver.findElement(By.xpath("//button[text()='Submit']")).click();
 	    }
 	    
     }
}
