package Registration;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import DynamicXpathResource.DynamicXpathResource;
import Generic_Utilities.BaseClass;
import Generic_Utilities.CallUser;
import Generic_Utilities.File_Utility;
import Generic_Utilities.WebDriver_Utility;
import POM_Admin.LoginAsSuperAdmin;
import POM_Admin.ProjectDelete;
import POM_Mobber.LoginAsMobber;
import POM_Mobber.MobberDashboard;

class ToOpenProject extends BaseClass
{
	WebDriver_Utility webLib=new WebDriver_Utility();
	public static void OpenProject() throws Throwable
	{
		WebDriver_Utility webLib=new WebDriver_Utility();
		 boolean flag=true;
			Thread.sleep(4000);
			  while(flag) {
					List<WebElement> str = driver.findElements(By.xpath("//table/tbody/tr/td/p[@data-att=\"Project Name\"]"));
			   for(WebElement pro:str)
			   {
				  String project = pro.getText();
				  if(project.equalsIgnoreCase(DynamicXpathResource.SubmitProject))
				  {
					 WebElement projectToDelete = driver.findElement(By.xpath("//table/tbody/tr/td/p[normalize-space()='"+DynamicXpathResource.SubmitProject+"']"));
					 webLib.scrollByJavaScript(driver, projectToDelete);
					Thread.sleep(3000);
					 projectToDelete.click();
					 Thread.sleep(3000);
			    
					  flag=false;
					  break;
				  }	   
			      }
			    
			   if(flag)
			   {
				   try {
		      driver.findElement(By.xpath("(//button[@class=\"ant-pagination-item-link\"])[2]")).click();
				   }
				   catch(ElementClickInterceptedException e)
				   {
					   WebElement scroll = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
					   webLib.scrollByJavaScript(driver, scroll);
					   Thread.sleep(3000); 
					   WebElement button = driver.findElement(By.xpath("(//button[@class=\"ant-pagination-item-link\"])[2]"));   
					  button.click();
				   	  Thread.sleep(2000);
					   if(button.isEnabled()==false)
					  {
						   System.out.println("Project is not present in project list.");
						  break;
					  }
				   }
				}
			  }	
	}
}
@Listeners(Generic_Utilities.ItestListner.class)
public class Accept_MobberProposalTest extends BaseClass
{
	@Test(priority=2)
    public void acceptProposal() throws Throwable
    {
		CallUser.callSuperAdmin();
		ToOpenProject.OpenProject();
		WebDriver_Utility webLib=new WebDriver_Utility();	
  Thread.sleep(3000);
   WebElement proposalTab = driver.findElement(By.xpath("//a[text()='Proposals']"));
   webLib.scrollByJavaScript(driver, proposalTab);
   Thread.sleep(3000);
   proposalTab.click();
   String offer="Submitted Offer";
   
  driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]/button")).click();
  driver.findElement(By.xpath("(//table/tbody/tr/td/button)[2]")).click();
  Thread.sleep(3000);
  List<WebElement> proposalStatus = driver.findElements(By.xpath("//td/p[@data-att=\"status\"]"));
 for(WebElement s:proposalStatus)
 {
	 System.out.println(s.getText());
  if(offer.equalsIgnoreCase(s.getText()))
  {
	  s.click();
  }
   Thread.sleep(3000);
 }
   WebElement acceptButton = driver.findElement(By.xpath("//button[text()='Accept']"));
   JavascriptExecutor js=(JavascriptExecutor) driver;
   js.executeScript("arguments[0].click()", acceptButton);
   Thread.sleep(3000);
    }
	
	@Test(priority=1)
    public void proposalSubmit() throws Throwable 
    {   	
		CallUser.callMobber();
		ToOpenProject.OpenProject();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[text()='Submit Proposal']")).click();
	    driver.findElement(By.xpath("//input[@name=\"hours\"]")).sendKeys("3");
	    driver.findElement(By.xpath("//textarea[@name=\"supportingInfo\"]")).sendKeys("teyfshgdytjdsfghcjsyhdffsjhdjfvdfuydfuyf");
	    driver.findElement(By.xpath("//input[@type=\"checkbox\"]/..")).click();
	    driver.findElement(By.xpath("//button[text()='Submit']")).click();
	    driver.findElement(By.xpath("//button[text()='Close']")).click();
	    Thread.sleep(3000);

	    MobberDashboard logout=new MobberDashboard(driver);
	    try {
	      logout.logOut();
	    }
	    catch(ElementClickInterceptedException e)
	    {
	    	logout.logOut();
	    }
    }
	@Test(priority=1)
	public void removeMobberFromTeam() throws Throwable
	{
		CallUser.callSuperAdmin();
		ToOpenProject.OpenProject();	
		WebDriver_Utility webLib=new WebDriver_Utility();
		Thread.sleep(2000);
		  WebElement proposalTab = driver.findElement(By.xpath("//a[text()='Team']"));
		   webLib.scrollByJavaScript(driver, proposalTab);
		   Thread.sleep(3000);
		   proposalTab.click();   
   
	}
}
