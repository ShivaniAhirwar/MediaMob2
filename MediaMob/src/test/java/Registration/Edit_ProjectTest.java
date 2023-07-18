package Registration;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.File_Utility;
import Generic_Utilities.WebDriver_Utility;
import POM_Admin.EditProjectPage;
import POM_Admin.LoginAsSuperAdmin;
import POM_Admin.SuperAdminDashBoard;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(Generic_Utilities.ItestListner.class)
public class Edit_ProjectTest extends BaseClass
{	
	@Test
     public void edit() throws Throwable
     {
		 WebDriver_Utility webLib=new WebDriver_Utility();
    	 
		   File_Utility filLib=new File_Utility();
	  	    String email = filLib.getCommonData("SuperAdminEmail");
	  	    String Password = filLib.getCommonData("SuperAdminPassword");
   
	  	  webLib.implicitlywait(driver);
	  	webLib.maximizeScreen(driver);
       
       LoginAsSuperAdmin login=new LoginAsSuperAdmin(driver);
       login.loginSuperAdmin(email,Password );
	     
	    SuperAdminDashBoard dashboard=new SuperAdminDashBoard(driver);
	    dashboard.ClickEditIcon();
	    
	    EditProjectPage edit=new EditProjectPage(driver);
	   try
	   {
	 edit.updateProjectButton();
	   }
	   catch(ElementClickInterceptedException e)
	   {
		   edit.updateProjectButton();
	   }
	   Thread.sleep(5000);
	   webLib.assertMethod();
	  try
	  {
	   dashboard.logoOut();
	  }
	  catch(ElementClickInterceptedException e)
	  {
		  dashboard.logoOut();
	  }
	   driver.quit();
	}
}
