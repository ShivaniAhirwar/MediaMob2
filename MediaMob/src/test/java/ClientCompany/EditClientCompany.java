package ClientCompany;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.File_Utility;
import Generic_Utilities.WebDriver_Utility;
import POM_Admin.LoginAsSuperAdmin;
import POM_Admin.SuperAdminDashBoard;

public class EditClientCompany extends BaseClass{

	@Test
	public static void editCompany() throws Throwable
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
    dash.clickClientCompanyLink();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//table/tbody/tr[2]/td[6]//img[@src=\"/pen.svg\"]")).click();
    driver.findElement(By.xpath("//button[text()='Save']")).click();
    driver.quit();
	}
}
