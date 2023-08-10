package Registration;

import org.testng.annotations.Test;

import DynamicXpathResource.DynamicXpathResource;

import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;

import Generic_Utilities.BaseClass;
import Generic_Utilities.CallUser;
import Generic_Utilities.File_Utility;
import Generic_Utilities.WebDriver_Utility;
import POM_Admin.LoginAsSuperAdmin;
import POM_Admin.ProjectDelete;

@Listeners(Generic_Utilities.ItestListner.class)
public class DeleteProjectTest extends BaseClass
{
	@Test()
    public void deleteProject() throws Throwable
    {
		 WebDriver_Utility webLib=new WebDriver_Utility();
		  CallUser userCall=new CallUser();
			userCall.callSuperAdmin();
 	ProjectDelete ProjectDelete=new ProjectDelete(driver);
 	 boolean flag=true;
 	Thread.sleep(4000);
 	List<WebElement> str = ProjectDelete.deleteButtonIcon;
 	  while(flag) {
 	   for(WebElement pro:str)
 	   {
 		  String project = pro.getText();
 		  System.out.println(project);
 		  System.out.println("Project to delete="+DynamicXpathResource.Deleteproject);
 		  if(project.equalsIgnoreCase(DynamicXpathResource.Deleteproject))
 		  {
 			 WebElement projectToDelete = driver.findElement(By.xpath("//table/tbody/tr/td/p[normalize-space()='"+DynamicXpathResource.Deleteproject+"']/ancestor::tr/td/descendant::span[@class=\"undefined icon-tabledelicon \"]"));
 			 webLib.scrollByJavaScript(driver, projectToDelete);
 			Thread.sleep(3000);
 			 projectToDelete.click();
 			 Thread.sleep(3000);
 	         ProjectDelete.deleteProject();
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
 	  Thread.sleep(3000);
         driver.quit();
    }

}