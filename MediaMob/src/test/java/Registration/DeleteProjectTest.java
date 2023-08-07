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
import Generic_Utilities.File_Utility;
import Generic_Utilities.WebDriver_Utility;
import POM_Admin.LoginAsSuperAdmin;
import POM_Admin.ProjectDelete;

@Listeners(Generic_Utilities.ItestListner.class)
public class DeleteProjectTest extends BaseClass
{
	@Test
    public void deleteProject() throws Throwable
    {
		 WebDriver_Utility webLib=new WebDriver_Utility();
    	 
		   File_Utility filLib=new File_Utility();
	  	    String email = filLib.getCommonData("SuperAdminEmail");
	  	    String Password = filLib.getCommonData("SuperAdminPassword");
   
	  	  webLib.implicitlywait(driver);
	  	webLib.maximizeScreen(driver);
       
       LoginAsSuperAdmin login=new LoginAsSuperAdmin(driver);
       login.loginSuperAdmin(email,Password );
 	  webLib.assertMethod();

 	ProjectDelete ProjectDelete=new ProjectDelete(driver);
 	 boolean flag=true;
     
 	  while(flag) {
 	   for(WebElement pro:ProjectDelete.deleteButtonIcon)
 	   {
 		  String project = pro.getText();
 		  if(project.equalsIgnoreCase(DynamicXpathResource.Deleteproject))
 		  {
 			    Thread.sleep(2000);
 			 WebElement projectToDelete = driver.findElement(By.xpath("//table/tbody/tr/td/p[text()='"+DynamicXpathResource.Deleteproject+"']/ancestor::tr/td/descendant::span[@class=\"undefined icon-tabledelicon \"]"));
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
