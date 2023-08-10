package Registration;

import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.CallUser;
import Generic_Utilities.File_Utility;
import Generic_Utilities.WebDriver_Utility;
import POM_Admin.LoginAsSuperAdmin;
import POM_Admin.SuperAdminDashBoard;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClientDropDownTest extends BaseClass
{
     @Test(retryAnalyzer=Generic_Utilities.RetryAnalyser.class)
     public void selectClient() throws Throwable
     {
   
         CallUser userCall=new CallUser();
			userCall.callSuperAdmin();
         SuperAdminDashBoard dash=new SuperAdminDashBoard(driver);
         dash.UserDropDown();
         dash.userApprovalPage();
         try {
         Thread.sleep(4000);
         WebElement element = driver.findElement(By.xpath("//span[text()='Pending Users']/../.."));
         Actions a=new Actions(driver);
         a.moveToElement(element).perform();
         element.click();
         }
     catch(ElementClickInterceptedException e)
     {
    	    Thread.sleep(4000);
            WebElement element = driver.findElement(By.xpath("//span[text()='Pending Users']/../.."));
            Actions a=new Actions(driver);
            a.moveToElement(element).perform();
            element.click();	 
     }
         Thread.sleep(3000);
         WebElement approveUser = driver.findElement(By.xpath("//div[text()='Approved Users']"));
         approveUser.click();
         Thread.sleep(4000);
         WebElement selectClient = driver.findElement(By.xpath("(//div[text()='Select Client'])[1]"));
         selectClient.click();
        
         List<WebElement> ParentclientName = driver.findElements(By.xpath("//ul[contains(@class,'ant-dropdown-menu ant-dropdown-menu-root')]/li"));
        System.out.println(ParentclientName.size());
        
     // WebElement spanElement = driver.findElement(By.xpath("//span[@class=\"projectdetail_tickedIcon__ONfWT\"]"));
     
        int var=1;
        for(WebElement client:ParentclientName)
         {
        	
            	try {
                  driver.findElement(By.xpath("//div[contains(@class,'ant-dropdown filterListWithCheck ')]/ul/li["+var+"]/descendant::span[@class=\"projectdetail_tickedIcon__ONfWT\"]"));
            	  var++;
                  continue;
            	}       
            	catch(NoSuchElementException n)
            	{
            		client.click();
            		break;
            	}
         }
 
       driver.findElement(By.xpath("//button[text()='Continue']")).click();
         
     }
}
