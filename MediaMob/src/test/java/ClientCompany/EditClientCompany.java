package ClientCompany;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.CallUser;
import Generic_Utilities.File_Utility;
import Generic_Utilities.WebDriver_Utility;
import POM_Admin.LoginAsSuperAdmin;
import POM_Admin.SuperAdminDashBoard;

public class EditClientCompany extends BaseClass{

	@Test
	public static void editCompany() throws Throwable
	{
    
	CallUser userCall=new CallUser();
	userCall.callSuperAdmin();
    SuperAdminDashBoard dash=new SuperAdminDashBoard(driver);
    dash.clickClientCompanyLink();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//table/tbody/tr[2]/td[6]//img[@src=\"/pen.svg\"]")).click();
    driver.findElement(By.xpath("//button[text()='Save']")).click();
    driver.quit();
	}
}
