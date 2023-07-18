package Java_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.File_Utility;
import Generic_Utilities.WebDriver_Utility;
import POM_Admin.CreateProjectPage;
import POM_Admin.LoginAsSuperAdmin;
import POM_Admin.SuperAdminDashBoard;

public class Program2 extends BaseClass
{
	@Test
      public void program() throws Throwable 
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
  	      projectPage.projectName("Create project");
  		  Thread.sleep(5000);
  	     driver.findElement(By.xpath("//label[text()='Client Name']/..")).click();
  	      Thread.sleep(3000);
    // WebElement lastOption = driver.findElement(By.xpath("(//div[@class=\"ant-select-item-option-content\"])[8]"));
  	// String lastValue = lastOption.getText();
    // WebElement specificOption = driver.findElement(By.xpath("//div[text()='Client comes at top665']"));
  	Actions actions = new Actions(driver);
  
  	for (int i = 0; i < 10; i++) {
  	    actions.sendKeys(Keys.ARROW_DOWN);
  	}
  	actions.sendKeys(Keys.ENTER).perform();
  	    
       
   }
	
	
}
