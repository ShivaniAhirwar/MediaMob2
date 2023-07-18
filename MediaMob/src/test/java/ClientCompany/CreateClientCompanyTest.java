package ClientCompany;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;

import Generic_Utilities.BaseClass;
import Generic_Utilities.File_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_Utility;

import POM_Admin.LoginAsSuperAdmin;
import POM_Admin.SuperAdminDashBoard;

@Listeners(Generic_Utilities.ItestListner.class)
public class CreateClientCompanyTest extends BaseClass
{
	@Test()
     public void client() throws Throwable
     {	   
	    WebDriver_Utility webLib=new WebDriver_Utility();
	    webLib.implicitlywait(driver);
	    webLib.maximizeScreen(driver);
	    
	    File_Utility filLib=new File_Utility();
  	    String email = filLib.getCommonData("SuperAdminEmail");
  	    String Password = filLib.getCommonData("SuperAdminPassword");
	   LoginAsSuperAdmin login=new LoginAsSuperAdmin(driver);
	   login.loginSuperAdmin(email, Password);
        Java_Utility javaLib=new Java_Utility();
        int r = javaLib.random();
        WebDriverWait wait=new WebDriverWait(driver,20);
	    SuperAdminDashBoard dashboard=new SuperAdminDashBoard(driver);
	    dashboard.clickClientCompanyLink();
	    Thread.sleep(3000);	 
	    WebElement ele = driver.findElement(By.xpath("//button[@class=\"ProjectListing_projectAddbtn__XffKW themeBtn ProjectListing_clientAddNewBtn__D6EBn \"]"));

	    JavascriptExecutor js = (JavascriptExecutor) driver; 
	    js.executeScript("arguments[0].click();", ele);
	    String companyName="Client comes at top"+r;
	   driver.findElement(By.xpath("//input[@name=\"companyName\"]")).sendKeys(companyName);
	 
	   driver.findElement(By.xpath("//input[@name=\"phoneNumber\"]")).sendKeys("6565657"+r); 
	   Thread.sleep(5000);
	   WebElement ele1 = driver.findElement(By.xpath("//label[text()='Users']/../../.."));
	   WebElement userList = driver.findElement(By.xpath("(//label[text()='Users']/../following-sibling::ul[@class=\"CustomSelectTag_selectTagList___jik7\"]/li)[1]"));
	   WebElement clientdrop = driver.findElement(By.xpath("//label[text()='Client Users']/.."));	   
	   WebElement clientList = driver.findElement(By.xpath("(//label[text()='Client Users']/../following-sibling::ul/li)[1]"));	  
	   WebElement mobberdRopDown = driver.findElement(By.xpath("//label[text()='Mobbers']/.."));	  
	   try {
	   wait.until(ExpectedConditions.elementToBeClickable(ele1)).click();
		  
      Thread.sleep(3000);
	   wait.until(ExpectedConditions.elementToBeClickable(userList)).click();
	 	wait.until(ExpectedConditions.elementToBeClickable(clientdrop)).click();
	 	wait.until(ExpectedConditions.elementToBeClickable(clientList)).click();
	 	wait.until(ExpectedConditions.elementToBeClickable(mobberdRopDown)).click();
	   }
	   catch(StaleElementReferenceException s)
	   {
		   wait.until(ExpectedConditions.elementToBeClickable(ele1)).click();
			  
		      Thread.sleep(3000);
			   wait.until(ExpectedConditions.elementToBeClickable(userList)).click();
			 	wait.until(ExpectedConditions.elementToBeClickable(clientdrop)).click();
			 	wait.until(ExpectedConditions.elementToBeClickable(clientList)).click();
			 	wait.until(ExpectedConditions.elementToBeClickable(mobberdRopDown)).click();
	   }
	 	String mobber01="youtube demo";
	 	String mobber02="first mobber";
	 	String mobber03="tru mobber four";
	 	WebElement mobber1 = driver.findElement(By.xpath("(//label[text()='Mobbers']/../following-sibling::ul[@class=\"CustomSelectTag_selectTagList___jik7\"]/li)[1]"));
	 	WebElement mobber2 = driver.findElement(By.xpath("(//label[text()='Mobbers']/../following-sibling::ul[@class=\"CustomSelectTag_selectTagList___jik7\"]/li)[2]"));
	 	WebElement mobber3 = driver.findElement(By.xpath("(//label[text()='Mobbers']/../following-sibling::ul[@class=\"CustomSelectTag_selectTagList___jik7\"]/li)[3]"));
	 	mobber1.click();
	 	mobberdRopDown.click();
	 	mobber2.click();
	 	mobberdRopDown.click();
	 	mobber3.click();
	 	
	 	Thread.sleep(3000);
	 	driver.findElement(By.name("streetAddress")).sendKeys("5twrfdjwysdfwjyefhsdfjhsdf");
	 	driver.findElement(By.xpath("//label[text()='Country']/..")).click();
	 	driver.findElement(By.xpath("//div[text()='Philippines']/..")).click();
	 	driver.findElement(By.xpath("//label[text()='Province']/..")).click();
	 	driver.findElement(By.xpath("//div[text()='Antique']/..")).click();
	 	driver.findElement(By.xpath("//label[text()='City']/..")).click();
	 	driver.findElement(By.xpath("//div[text()='Belison']/..")).click();
	 	driver.findElement(By.xpath("//input[@name=\"postalCode\"]")).sendKeys("54dgyh");
        driver.findElement(By.xpath("//button[text()='Save']")).click();
		
     }
}
