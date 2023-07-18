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

import Generic_Utilities.BaseClass;
import Generic_Utilities.File_Utility;
import Generic_Utilities.WebDriver_Utility;
import POM_Admin.CreateProjectPage;
import POM_Admin.LoginAsSuperAdmin;
import POM_Admin.SuperAdminDashBoard;

public class SingleMobberInTwoProposal extends BaseClass
{
   @Test
   public void singleMobber() throws Throwable
   {
  	 WebDriver_Utility webLib=new WebDriver_Utility();
	 
		   File_Utility filLib=new File_Utility();
	  	    String email = filLib.getCommonData("SuperAdminEmail");
	  	    String Password = filLib.getCommonData("SuperAdminPassword");
 
	  	  webLib.implicitlywait(driver);
	  	webLib.maximizeScreen(driver);
     
     LoginAsSuperAdmin login=new LoginAsSuperAdmin(driver);
     login.loginSuperAdmin(email,Password );  
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
    js.executeScript("arguments[0].click()", projectPage.clickDatePicker2);
    Thread.sleep(3000);
   // projectPage.calender2();
    WebElement date1 = driver.findElement(By.xpath("(//div[@class=\"ant-picker-panels\"]//table)[5]/tbody//tr[3]/td[3]"));
    WebElement date2 = driver.findElement(By.xpath("(//div[@class=\"ant-picker-panels\"]//table)[6]/tbody//tr[3]/td[3]"));
    try {
      WebDriverWait w=new WebDriverWait(driver, 10);
      w.until(ExpectedConditions.elementToBeClickable(date1));
      w.until(ExpectedConditions.elementToBeClickable(date2));
    }
    catch(NoSuchElementException e)
    {
    	   WebDriverWait w=new WebDriverWait(driver, 10);
    	      w.until(ExpectedConditions.elementToBeClickable(date1));
    	      w.until(ExpectedConditions.elementToBeClickable(date2));
    }
    ///

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
     
   }
}
