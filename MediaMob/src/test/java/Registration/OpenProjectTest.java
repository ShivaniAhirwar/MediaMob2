package Registration;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.CallUser;
import Generic_Utilities.File_Utility;
import Generic_Utilities.WebDriver_Utility;
import POM_Admin.EditButton;
import POM_Admin.LoginAsSuperAdmin;
import POM_Admin.SuperAdminDashBoard;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(Generic_Utilities.ItestListner.class)
public class OpenProjectTest extends BaseClass
{
	@Test
     public void openProject() throws Throwable
     {
    	 WebDriver_Utility webLib=new WebDriver_Utility();
    	 
    	  CallUser userCall=new CallUser();
			userCall.callSuperAdmin();
         driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).click();
         Thread.sleep(3000);
         
       SuperAdminDashBoard dash=new SuperAdminDashBoard(driver);
       dash.logoOut();
       webLib.assertMethod();
       driver.quit();
	}
}