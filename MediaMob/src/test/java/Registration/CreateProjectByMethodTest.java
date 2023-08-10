package Registration;

import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic_Utilities.BaseClass;
import Generic_Utilities.CallUser;
import Generic_Utilities.File_Utility;
import Generic_Utilities.RetryAnalyser;
import Generic_Utilities.WebDriver_Utility;
import POM_Admin.CreateProjectPage;
import POM_Admin.LoginAsSuperAdmin;
import POM_Admin.SuperAdminDashBoard;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(Generic_Utilities.ItestListner.class)
public class CreateProjectByMethodTest extends BaseClass
{
     @Test()
     public void projectCreation() throws Throwable
     {
    	 WebDriver_Utility webLib=new WebDriver_Utility();
    	 
    	  CallUser userCall=new CallUser();
			userCall.callSuperAdmin();  
	      SuperAdminDashBoard dash=new SuperAdminDashBoard(driver);
	      dash.createProjectButton();
	      
	      CreateProjectPage projectPage=new CreateProjectPage(driver);
	      projectPage.projectName("Sample Project");
		  Thread.sleep(5000);
	      try {
	      projectPage.clientNameDropDown();
		   
	      }
	      catch(ElementClickInterceptedException e)
	      {
	    	    projectPage.clientNameDropDown();
	      }
	      
	      projectPage.mobberBrief();
        Thread.sleep(5000);
        
        try {

        	projectPage.SelectlocationType();
        }
        catch(ElementClickInterceptedException e)
        {

        	projectPage.SelectlocationType();
       }   
        Thread.sleep(5000);
       try {
    	   projectPage.sevices();
       }
       catch(ElementClickInterceptedException e)
       {
    	   projectPage.sevices();
    	   
       }
       Thread.sleep(3000);
       try {
    	   projectPage.serviceList.click();
       }
       catch(ElementClickInterceptedException e)
       {

    	   projectPage.serviceList.click();
       }  
       
       JavascriptExecutor js= (JavascriptExecutor) driver;
       js.executeScript("arguments[0].click()", projectPage.clickDatePicker);
       Thread.sleep(3000);
       projectPage.calender();
    
       Thread.sleep(3000);    
       js.executeScript("arguments[0].click()", projectPage.clickProjectDatePicker);
       Thread.sleep(3000);
       projectPage.projectCalender();
  
       projectPage.ProjectBudget("676");
       try {
    	   projectPage.managerDropDOwn();
      
       }
       catch(ElementClickInterceptedException e)
       {
    	   projectPage.managerDropDOwn();
       }
      Thread.sleep(3000);
      js.executeScript("arguments[0].click()",projectPage.saveButton );
      System.out.println("Created_Project_Name="+projectPage.createdProjectName.getText());
      Assert.assertEquals("Sample Project", projectPage.createdProjectName.getText());
      driver.quit();
      
	}
}
