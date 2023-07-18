package MobberAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.File_Utility;
import Generic_Utilities.WebDriver_Utility;
import POM_Admin.LoginAsSuperAdmin;
import POM_Mobber.LoginAsMobber;

public class TestPractice extends BaseClass
{
	@Test
    public void testPractice() throws Throwable {
		
    	
		WebDriver_Utility webLib=new WebDriver_Utility();
	   	 
		   File_Utility filLib=new File_Utility();
	  	    String email = filLib.getCommonData("SuperAdminEmail");
	  	    String Password = filLib.getCommonData("SuperAdminPassword");

	  	  webLib.implicitlywait(driver);
	  	webLib.maximizeScreen(driver);
   
   LoginAsSuperAdmin login=new LoginAsSuperAdmin(driver);
   login.loginSuperAdmin(email,Password );
WebElement ProjectName = driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]"));
webLib.javaScriptCLick(driver, ProjectName);
Thread.sleep(3000);
driver.findElement(By.xpath("//a[text()='Proposals']")).click();
driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]/button")).click();
//driver.findElement(By.xpath("(//div[@class=\"projectdetail_userContent__5QMph\"]/h3[@title=\"Second Mobber\"])[1]")).click();
//driver.findElement(By.xpath("//button[@aria-label=\"Close\"]/descendant::span[@aria-label=\"close\"]")).click();
Thread.sleep(3000);

   WebElement Proposal = driver.findElement(By.xpath("(//td[1]//button[@type=\"button\"])[2]"));
   webLib.scrollByJavaScript(driver, Proposal);
   webLib.javaScriptCLick(driver, Proposal);
   Thread.sleep(3000);
   WebElement mobberTwo = driver.findElement(By.xpath("(//div[@class=\"projectdetail_userContent__5QMph\"]/h3[@title=\"Second Mobber\"])[2]"));
   webLib.javaScriptCLick(driver, mobberTwo);
	
	}
}
