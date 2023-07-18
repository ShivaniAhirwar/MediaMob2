package ValidationSCenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.File_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_Utility;
import POM_Admin.CreateProjectPage;
import POM_Admin.LoginAsSuperAdmin;
import POM_Admin.SuperAdminDashBoard;

public class ProjectValidation extends BaseClass
{
	@Test
	public void projectCreation() throws Throwable
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
	      Java_Utility javalib=new Java_Utility();
	      int r = javalib.random();
	      String ExceptedprojectName="Project creation"+r;
	      projectPage.projectName(ExceptedprojectName);
		  Thread.sleep(5000);
	      try {
	      driver.findElement(By.xpath("//label[text()='Client Name']/..")).click();
	      Thread.sleep(3000);
	      WebElement clientOption = driver.findElement(By.xpath("//div[@class=\"projectdetail_createNewProjectFeild__ET_n0\"]//input[@type=\"search\"]"));
	      clientOption.sendKeys("check");
	      driver.findElement(By.xpath("//div[@class=\"ant-select-item-option-content\"]")).click();

	      }
	      catch(ElementClickInterceptedException e)
	      {
	    	  driver.findElement(By.xpath("//label[text()='Client Name']/..")).click();
	       driver.findElement(By.xpath("//div[@class=\"projectdetail_createNewProjectFeild__ET_n0\"]//input[@type=\"search\"]")).sendKeys("check");
	       driver.findElement(By.xpath("//div[@class=\"ant-select-item-option-content\"]")).click();
	      }
	      projectPage.mobberBrief();
     Thread.sleep(5000);
     
     try {
	     driver.findElement(By.xpath("//input[@id=\"rc_select_2\"]/../../..")).click();
     driver.findElement(By.xpath("((//div[text()='Remote'])[2]")).click();
    
     }
     catch(ElementClickInterceptedException e)
     {
      driver.findElement(By.xpath("//input[@id=\"rc_select_2\"]/../../..")).click();
      driver.findElement(By.xpath("(//div[text()='Remote'])[2]")).click();	
       
     }   
     Thread.sleep(5000);
    try {
   driver.findElement(By.xpath("//label[text()='Select Service']/../../..")).click();   
    }
    catch(ElementClickInterceptedException e)
    {
    	  driver.findElement(By.xpath("//label[text()='Select Service']/../../..")).click();
    }
    Thread.sleep(3000);
    try {
        WebElement ele = driver.findElement(By.xpath("//label[text()='Select Service']/../following-sibling::ul[@class=\"CustomSelectTag_selectTagList___jik7\"]/li[text()='Art & Craft']"));
               ele.click();
    }
    catch(ElementClickInterceptedException e)
    {
    	WebElement ele = driver.findElement(By.xpath("//label[text()='Select Service']/../following-sibling::ul[@class=\"CustomSelectTag_selectTagList___jik7\"]/li[text()='Art & Craft']"));
      ele.click();
    }
    WebElement ele = driver.findElement(By.xpath("(//div[@class=\"ant-picker-input ant-picker-input-active\"])[1]"));    
    JavascriptExecutor js= (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click()", ele);
    Thread.sleep(3000);
    projectPage.calender();
 
    Thread.sleep(3000);
    WebElement ele1 = driver.findElement(By.xpath("//div[@name=\"date\"]/child::div[@class=\"ant-picker-input ant-picker-input-active\"]"));    
    js.executeScript("arguments[0].click()", ele1);
    Thread.sleep(3000);
    projectPage.projectCalender();

    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@id=\"projectBudget\"]")).sendKeys("633");
    try {
    WebElement projectManagerDropDown = driver.findElement(By.xpath("//div[@name=\"project_manager\"]"));
    projectManagerDropDown.click();
    List<WebElement> list = driver.findElements(By.xpath("//div[@name=\"project_manager\"]/descendant::div[contains(@class,'ant-select-dropdown')]"));
     for(WebElement w:list)
     {
    	 System.out.println(w.getText());
     }
    }
    catch(ElementClickInterceptedException e)
    {
    	  WebElement projectManagerDropDown = driver.findElement(By.xpath("//div[@name=\"project_manager\"]"));
          projectManagerDropDown.click();
          driver.findElement(By.xpath("//div[@name=\"project_manager\"]/descendant::div[contains(@class,'ant-select-dropdown')]")).click();
    }
    
    Thread.sleep(3000);
    WebElement saveButton = driver.findElement(By.xpath("//button[text()='Save Project']"));
    js.executeScript("arguments[0].click()", saveButton);
    
   WebElement projectName = driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]/p[text()='PD Title']"));
   String ActualprojectName = projectName.getText();
   Assert.assertEquals(ExceptedprojectName, ActualprojectName);
   if(ExceptedprojectName.equalsIgnoreCase(ActualprojectName))
   {
	   System.out.println("Project created successfully");
   }
   else
   {
	   System.out.println("Project created successfully");
   }
    driver.quit();	
	}
	
}
