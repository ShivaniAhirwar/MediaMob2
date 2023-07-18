package ValidationSCenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import ClientCompany.CreateClientCompanyTest;
import Generic_Utilities.BaseClass;
import Generic_Utilities.File_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_Utility;
import POM_Admin.CreateProjectPage;
import POM_Admin.LoginAsSuperAdmin;
import POM_Admin.SuperAdminDashBoard;

class SharedTestData {
    public static String clientCompany;
   
}
public class TestCase extends BaseClass
{
	
	@Test(priority=2, dependsOnMethods="testCompanyScenario")
     public void ProjectCreationscenario() throws Throwable
     {
	   	 WebDriver_Utility webLib=new WebDriver_Utility();
    	 
			   File_Utility filLib=new File_Utility();
		  	    String email = filLib.getCommonData("SuperAdminEmail");
		  	    String Password = filLib.getCommonData("SuperAdminPassword");
		  	  Java_Utility javaLib=new Java_Utility();
		       
		  	  webLib.implicitlywait(driver);
		  	webLib.maximizeScreen(driver);
	       
	       LoginAsSuperAdmin login=new LoginAsSuperAdmin(driver);
	       login.loginSuperAdmin(email,Password );  
		      SuperAdminDashBoard dash=new SuperAdminDashBoard(driver);
		      dash.createProjectButton();
		      
		      CreateProjectPage projectPage=new CreateProjectPage(driver);
		      projectPage.projectName("Sample Project");
			  Thread.sleep(5000);
    driver.findElement(By.xpath("//label[text()='Client Name']/..")).click();
    Thread.sleep(3000);	
     WebElement clientOption = driver.findElement(By.xpath("//div[@class=\"projectdetail_createNewProjectFeild__ET_n0\"]//input[@type=\"search\"]"));
     clientOption.sendKeys(SharedTestData.clientCompany);
     WebElement actualClientName = driver.findElement(By.xpath("//div[@class=\"ant-select-item-option-content\"]"));	      
     actualClientName.click();
     String ActualCLient = actualClientName.getText();
     String expectedClient=SharedTestData.clientCompany;
     
     Assert.assertEquals(expectedClient, ActualCLient);
     Reporter.log("ExpectedCLient="+expectedClient);
     System.out.println("ActualData="+ActualCLient);
     if(expectedClient.equalsIgnoreCase(ActualCLient))
     {
      Reporter.log("Pass");
     }
     else
     {
    	 System.out.println("Assertion failed: expected and actual data is not same.");
     }
     }
	
		      
	@Test(priority=1)
	public void testCompanyScenario() throws Throwable 
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
	      
		    SuperAdminDashBoard dashboard=new SuperAdminDashBoard(driver);
		    dashboard.clickClientCompanyLink();
		 
		    WebElement ele = driver.findElement(By.xpath("//button[@class=\"ProjectListing_projectAddbtn__XffKW themeBtn ProjectListing_clientAddNewBtn__D6EBn \"]"));

		    JavascriptExecutor js = (JavascriptExecutor) driver; 
		    js.executeScript("arguments[0].click();", ele);
		    String companyName="Client tru test"+r;
		   
		   driver.findElement(By.xpath("//input[@name=\"companyName\"]")).sendKeys(companyName);
		 
		   driver.findElement(By.xpath("//input[@name=\"phoneNumber\"]")).sendKeys("34559565"+r);
		 
		   WebElement ele1 = driver.findElement(By.xpath("(//div[@class=\"float-label\"])[3]"));
	 
	        Thread.sleep(4000);	  
		   WebDriverWait wait=new WebDriverWait(driver,20);
		   wait.until(ExpectedConditions.elementToBeClickable(ele1)).click();
			  
		   Thread.sleep(3000);
			WebElement userList = driver.findElement(By.xpath("(//label[text()='Users']/../following-sibling::ul[@class=\"CustomSelectTag_selectTagList___jik7\"]/li)[1]"));
		  wait.until(ExpectedConditions.elementToBeClickable(userList)).click();

		 	WebElement clientdrop = driver.findElement(By.xpath("//label[text()='Client Users']/.."));
		 	wait.until(ExpectedConditions.elementToBeClickable(clientdrop)).click();
		 	 Thread.sleep(3000);
		 	WebElement clientList = driver.findElement(By.xpath("(//label[text()='Client Users']/../following-sibling::ul/li)[1]"));
		 	wait.until(ExpectedConditions.elementToBeClickable(clientList)).click();
		 	driver.findElement(By.name("streetAddress")).sendKeys("5twrfdjwysdfwjyefhsdfjhsdf");
		 	driver.findElement(By.xpath("//label[text()='Country']/..")).click();
		 	driver.findElement(By.xpath("//div[text()='Philippines']/..")).click();
		 	driver.findElement(By.xpath("//label[text()='Province']/..")).click();
		 	driver.findElement(By.xpath("//div[text()='Antique']/..")).click();
		 	driver.findElement(By.xpath("//label[text()='City']/..")).click();
		 	driver.findElement(By.xpath("//div[text()='Belison']/..")).click();
		 	driver.findElement(By.xpath("//input[@name=\"postalCode\"]")).sendKeys("54dgyh");
		 	Thread.sleep(3000);
	        WebElement saveButton = driver.findElement(By.xpath("//button[text()='Save']"));
	        js.executeScript("arguments[0].click()", saveButton);
	        WebElement clientCompanyName = driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]/p[text()='"+companyName+"']"));
	        SharedTestData.clientCompany=clientCompanyName.getText();
	       
	}

}
