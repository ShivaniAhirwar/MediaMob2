package Registration;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.File_Utility;
import Generic_Utilities.WebDriver_Utility;
import POM_Admin.LoginAsSuperAdmin;
import POM_Admin.SuperAdminDashBoard;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(Generic_Utilities.ItestListner.class)
public class Change_StatusTest extends BaseClass
{
	  @Test()
      public void changeStatus() throws Throwable
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
    	  webLib.assertMethod();
  
    	  dashboard.changeStatus();   	
    	 Thread.sleep(5000);
    	 dashboard.logoOut();
    	 driver.quit();
	  }
}
