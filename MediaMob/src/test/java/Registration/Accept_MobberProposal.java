package Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.File_Utility;
import Generic_Utilities.WebDriver_Utility;
import POM_Admin.LoginAsSuperAdmin;

@Listeners(Generic_Utilities.ItestListner.class)
public class Accept_MobberProposal extends BaseClass
{
	@Test
    public void acceptProposal() throws Throwable
    {
    	WebDriver_Utility webLib=new WebDriver_Utility();
   	 
		   File_Utility filLib=new File_Utility();
	  	    String email = filLib.getCommonData("SuperAdminEmail");
	  	    String Password = filLib.getCommonData("SuperAdminPassword");
  
	  	  webLib.implicitlywait(driver);
	  	webLib.maximizeScreen(driver);
      
      LoginAsSuperAdmin login=new LoginAsSuperAdmin(driver);
      login.loginSuperAdmin(email,Password );
  WebElement ProjectName = driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]"));
  webLib.javaScriptCLick(driver, ProjectName);
   Thread.sleep(3000);
   driver.findElement(By.xpath("//a[text()='Proposals']")).click();
   driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]/button")).click();
  
   driver.findElement(By.xpath("(//div[@data-att=\"name\"])[2]")).click();
   Thread.sleep(3000);
   WebElement acceptButton = driver.findElement(By.xpath("//button[text()='Accept']"));
   JavascriptExecutor js=(JavascriptExecutor) driver;
   js.executeScript("arguments[0].click()", acceptButton);
   Thread.sleep(3000);
   WebElement Proposal = driver.findElement(By.xpath("(//td[1]//button[@type=\"button\"])[2]"));
   webLib.scrollByJavaScript(driver, Proposal);
   webLib.javaScriptCLick(driver, Proposal);
   Thread.sleep(3000);
   WebElement mobberTwo = driver.findElement(By.xpath("(//div[@class=\"projectdetail_userContent__5QMph\"]/h3[@title=\"test company\"])[2]"));
   webLib.javaScriptCLick(driver, mobberTwo);
   WebElement declineButton = driver.findElement(By.xpath("//button[text()='Decline']"));
   js.executeScript("arguments[0].click()", declineButton);
    }
}
