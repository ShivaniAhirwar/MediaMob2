package Registration;

import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.File_Utility;
import POM_Admin.LoginAsSuperAdmin;
import POM_Admin.SuperAdminDashBoard;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClientDropDownTest extends BaseClass
{
     @Test(retryAnalyzer=Generic_Utilities.RetryAnalyser.class)
     public void selectClient() throws Throwable
     {

         File_Utility filLib=new File_Utility();
  	    String email = filLib.getCommonData("SuperAdminEmail");
  	    String Password = filLib.getCommonData("SuperAdminPassword");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
         LoginAsSuperAdmin login=new LoginAsSuperAdmin(driver);
         login.loginSuperAdmin(email, Password);
         SuperAdminDashBoard dash=new SuperAdminDashBoard(driver);
         dash.UserDropDown();
         dash.userApprovalPage();
         Thread.sleep(4000);
         WebElement element = driver.findElement(By.xpath("//span[text()='Pending Users']/../.."));
         Actions a=new Actions(driver);
         a.moveToElement(element).perform();
         Thread.sleep(4000);
         element.click();
         driver.findElement(By.xpath("//div[text()='Approved Users']")).click();
         driver.findElement(By.xpath("(//div[text()='Select Client'])[1]")).click();
         List<WebElement> ParentclientName = driver.findElements(By.xpath("//ul[contains(@class,'ant-dropdown-menu ant-dropdown-menu-root')]/li"));
        System.out.println(ParentclientName.size());
        
     // WebElement spanElement = driver.findElement(By.xpath("//span[@class=\"projectdetail_tickedIcon__ONfWT\"]"));
        boolean spanChildIsPresent=false;
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
