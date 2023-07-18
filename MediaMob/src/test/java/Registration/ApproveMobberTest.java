package Registration;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.File_Utility;
import Generic_Utilities.WebDriver_Utility;
import POM_Admin.ApproveOrDenyPopup;
import POM_Admin.LoginAsSuperAdmin;
import POM_Admin.SuperAdminDashBoard;
import POM_Admin.UserApprovalPage;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(Generic_Utilities.ItestListner.class)
public class ApproveMobberTest extends BaseClass
{
       @Test()
       public void approveMobber() throws Throwable
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
	     dashboard.UserDropDown();
	     dashboard.userApprovalPage();
	    
	     UserApprovalPage approval=new UserApprovalPage(driver);
	     approval.approveButton();
	     
	     ApproveOrDenyPopup continuebutton=new ApproveOrDenyPopup(driver);
	     continuebutton.ClickOnContinueForDenyOrApprove();
	     webLib.assertMethod();
	     Thread.sleep(3000);
	     try {
	     dashboard.logoOut();
	     }
	     catch(ElementClickInterceptedException e)
	     {
	    	 dashboard.logoOut();
	     }
	    driver.quit();
	  }
}
