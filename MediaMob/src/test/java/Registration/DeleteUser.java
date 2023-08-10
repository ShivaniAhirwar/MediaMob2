package Registration;

import org.openqa.selenium.ElementClickInterceptedException;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.CallUser;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.File_Utility;
import Generic_Utilities.WebDriver_Utility;
import POM_Admin.AddUserButton;
import POM_Admin.LoginAsSuperAdmin;
import POM_Admin.SuperAdminDashBoard;

public class DeleteUser extends BaseClass
{
     @Test()
     public void deleteUser() throws Throwable
     {
       WebDriver_Utility webLib=new WebDriver_Utility();
  	   CallUser userCall=new CallUser();
  	userCall.callSuperAdmin();
  	   
  	   SuperAdminDashBoard dash=new SuperAdminDashBoard(driver);
  	   dash.UserDropDown();
  	   dash.userListPage();
  	 AddUserButton button=new AddUserButton(driver);
  	 Thread.sleep(10000);
    	  try {
			   button.deleteUser();
		   }
	       catch(ElementClickInterceptedException e)
		   {
		   button.deleteUser();
	  	   }	
     }
}
