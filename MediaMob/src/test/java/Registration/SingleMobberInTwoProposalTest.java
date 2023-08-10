package Registration;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import DynamicXpathResource.DynamicXpathResource;
import Generic_Utilities.BaseClass;
import Generic_Utilities.CallUser;
import Generic_Utilities.File_Utility;
import Generic_Utilities.WebDriver_Utility;
import POM_Admin.CreateProjectPage;
import POM_Admin.LoginAsSuperAdmin;
import POM_Admin.SuperAdminDashBoard;

public class SingleMobberInTwoProposalTest extends BaseClass
{
   @Test(retryAnalyzer=Generic_Utilities.RetryAnalyser.class)
   public void singleMobber() throws Throwable
   {
	 
  	  CallUser userCall=new CallUser();
		userCall.callSuperAdmin();
	      SuperAdminDashBoard dash=new SuperAdminDashBoard(driver);
	      dash.createProjectButton();
	      
	      CreateProjectPage projectPage=new CreateProjectPage(driver);
	      projectPage.projectName("Sample Project ");
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
  
 //2nd MObber Brief------------------------------------------------------
     
     driver.findElement(By.xpath("//button[@class=\"projectdetail_moreProjectBriefBtn__N5sYC themeBtn\"]")).click();
    Thread.sleep(3000);
     projectPage.mobberBrief2();
     Thread.sleep(5000);
     
     try {

     	projectPage.locationType2();
     }
     catch(ElementClickInterceptedException e)
     {

     	projectPage.locationType2();
    }   
     Thread.sleep(5000);
    try {
 	   projectPage.serviceType2();
    }
    catch(ElementClickInterceptedException e)
    {
 	   projectPage.serviceType2();
 	   
    }
    Thread.sleep(3000);
    try {
 	   projectPage.serviceList2.click();
    }
    catch(ElementClickInterceptedException e)
    {

 	   projectPage.serviceList2.click();
    }  
    WebElement calender2 = driver.findElement(By.xpath("(//div[@class=\"ant-picker ant-picker-range projectdetail_datePicker__LgPno \"])[2]"));
    js.executeScript("arguments[0].click()", calender2);
    Thread.sleep(3000);

    try {
    	  projectPage.projectCalender();
     
    }
    catch(ElementNotInteractableException e)
    {
    	  projectPage.projectCalender();
    }
    
    Thread.sleep(3000);    
    js.executeScript("arguments[0].click()", projectPage.clickProjectDatePicker);
    Thread.sleep(3000);

 
driver.findElement(By.xpath("//table/tbody/tr/td[@title='"+DynamicXpathResource.date1+"']")).click();
Thread.sleep(3000);

 driver.findElement(By.xpath("//div/table/tbody/tr/td[@title='"+DynamicXpathResource.date2+"']")).click();

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
  
   }
}
