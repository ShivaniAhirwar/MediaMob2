package MobberAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.CallUser;
import Generic_Utilities.File_Utility;
import Generic_Utilities.WebDriver_Utility;
import POM_Mobber.LoginAsMobber;
import POM_Mobber.MobberDashboard;

public class RemoveNUpdateMobberProfilePicTest extends BaseClass 
{
	@Test(priority=1)
     public void UpdateProfilePic() throws Throwable
     {
		CallUser userCall=new CallUser();
		userCall.callMobber();
			    //Thread.sleep(3000);
			    
			   WebElement ele = driver.findElement(By.xpath("//div[@class=\"NavDropdown_nav-item__ZXtMO NavDropdown_hide__8Zpuv\"]/a[@id=\"Dropdown\"]"));

			      JavascriptExecutor js=(JavascriptExecutor) driver;
			      js.executeScript("arguments[0].click()", ele);
			      Thread.sleep(3000);
			    
			     WebElement Myprofile = driver.findElement(By.xpath("//a[text()='My Profile']"));
			     js.executeScript("arguments[0].click()", Myprofile);
			    Thread.sleep(4000);
			    WebElement editButton = driver.findElement(By.xpath("//div[@class=\"myProfile_editUserBtnRow__7pOCX\"]/a[text()='Edit Profile']"));
			    js.executeScript("arguments[0].click()", editButton);
			    
			  //  driver.findElement(By.xpath("//button[text()='Upload Photo']")).click();
				WebElement file = driver.findElement(By.xpath("//input[@type=\"file\"]"));
				file.sendKeys("/Users/pro/Downloads/ProfilePhoto.png");   
				  driver.findElement(By.xpath("//textarea[@name=\"bio\"]")).sendKeys("Testing automation");

				     WebElement updateButton = driver.findElement(By.xpath("//div[@class=\"UserButton\"]/button[text()='Update']"));
				     js.executeScript("arguments[0].click()", updateButton); 
				    MobberDashboard dash=new MobberDashboard(driver);
						try {
							dash.logOut();
						}
						catch(ElementClickInterceptedException e)
						{
						  dash.logOut();
						}
						
						driver.quit();
				     
     }
	@Test(priority=2, dependsOnMethods="UpdateProfilePic")
	public static void removeProfile() throws Throwable
	{
		
		CallUser userCall=new CallUser();
		userCall.callMobber();
	    //Thread.sleep(3000);
	    
	   WebElement ele = driver.findElement(By.xpath("//div[@class=\"NavDropdown_nav-item__ZXtMO NavDropdown_hide__8Zpuv\"]/a[@id=\"Dropdown\"]"));

	      JavascriptExecutor js=(JavascriptExecutor) driver;
	      js.executeScript("arguments[0].click()", ele);
	      Thread.sleep(3000);
	    WebElement Myprofile = driver.findElement(By.xpath("//a[text()='My Profile']"));
	    js.executeScript("arguments[0].click()", Myprofile);
	    Thread.sleep(4000);
	    WebElement editButton = driver.findElement(By.xpath("//div[@class=\"myProfile_editUserBtnRow__7pOCX\"]/a[text()='Edit Profile']"));
	    js.executeScript("arguments[0].click()", editButton);
	    
    	driver.findElement(By.xpath("//button[text()='Remove']")).click();
    	 WebElement updateButton = driver.findElement(By.xpath("//div[@class=\"UserButton\"]/button[text()='Update']"));
	     js.executeScript("arguments[0].click()", updateButton); 
	     Thread.sleep(3000);
		MobberDashboard dash=new MobberDashboard(driver);
		try {
			dash.logOut();
		}
		catch(ElementClickInterceptedException e)
		{
		  dash.logOut();
		}
		
		driver.quit();
		
		
	}
}
