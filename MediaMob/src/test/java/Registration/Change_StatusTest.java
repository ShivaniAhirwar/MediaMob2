package Registration;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
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
    WebElement text = driver.findElement(By.xpath("(//div[@class=\"projectdetail_TableTag__JiY5f\"])[1]"));
   String status = text.getText();  
   System.out.println(status);
dashboard.changeStatus(); 
    	  Thread.sleep(3000);
    	  if(status.equalsIgnoreCase("Completed"))
    	  {
    		driver.findElement(By.xpath("//span[@class=\"ant-dropdown-menu-title-content\"]/span[text()='In Progress']")).click();
    	  }
    	  else if(status.equalsIgnoreCase("In Progress"))
    	  {
    		  driver.findElement(By.xpath("//span[@class=\"ant-dropdown-menu-title-content\"]/span[text()='In Review']")).click();
    	  }
    	  else if(status.equalsIgnoreCase("In Review"))
    	  {
    		  driver.findElement(By.xpath("//span[@class=\"ant-dropdown-menu-title-content\"]/span[text()='Completed']")).click();
    	  }
    	 Thread.sleep(5000);
    	 dashboard.logoOut();
    	 driver.quit();
	  }
}
