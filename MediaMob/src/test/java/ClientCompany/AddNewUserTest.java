package ClientCompany;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.CallUser;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.File_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_Utility;
import POM_Admin.AddNewUserpopup;
import POM_Admin.AddUserButton;
import POM_Admin.LoginAsSuperAdmin;
import POM_Admin.SuperAdminDashBoard;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(Generic_Utilities.ItestListner.class)
public class AddNewUserTest extends BaseClass
{
	@Test()
   public void addNewUser() throws Throwable 
   {	   
	   WebDriver_Utility webLib=new WebDriver_Utility();
	   webLib.implicitlywait(driver);
	   webLib.maximizeScreen(driver);
  	 Excel_Utility excelLib=new Excel_Utility();
CallUser userCall=new CallUser();
userCall.callSuperAdmin();
	   SuperAdminDashBoard dash=new SuperAdminDashBoard(driver);
	   dash.UserDropDown();
	   dash.userListPage();
	   
	   JavascriptExecutor js=(JavascriptExecutor) driver; 
	  
	   AddUserButton button=new AddUserButton(driver);
	   WebElement ele = driver.findElement(By.xpath("//button[text()=' Add New User']"));
	   js.executeScript("arguments[0].click()", ele);
	  
	   AddNewUserpopup newUser=new AddNewUserpopup(driver);
	   newUser.inputTextField();
	   Java_Utility javaLib=new Java_Utility();
	   int ran = javaLib.random();
	   String value = excelLib.getDataFromExcel("Client Company", 1,0)+ran+"@tru.agency";
	   newUser.emailForClient(value);
	   driver.findElement(By.xpath("//div[@name=\"role\"]")).click();
	   driver.findElement(By.xpath("//div[text()='Client']")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//label[text()='Select Company*']/..")).click();
	   
	   WebElement companyName = driver.findElement(By.xpath("(//label[text()='Select Company*']/../following-sibling::ul[@class=\"CustomSelectTag_selectTagList___jik7\"]/li)[1]"));
	   js.executeScript("arguments[0].scrollIntoView(true)", companyName);
	   companyName.click();
	   Thread.sleep(5000);
	   newUser.clickAddUserButton();
	   Thread.sleep(2000);
	   try {
		   button.deleteUser();
	   }
       catch(ElementClickInterceptedException e)
	   {
	   button.deleteUser();
  	   }	   
	  // driver.findElement(By.xpath("//button[text()='Delete']")).click();
       Thread.sleep(3000);
	   driver.quit();
   }
	@Test
	public void newAdmin() throws Throwable
	{
		WebDriver_Utility webLib=new WebDriver_Utility();
	    webLib.implicitlywait(driver);
		   webLib.maximizeScreen(driver);
		   Java_Utility javaLib=new Java_Utility();
		   int ran = javaLib.random();
		   File_Utility filLib=new File_Utility();
	  	    String email = filLib.getCommonData("SuperAdminEmail");
	  	    String Password = filLib.getCommonData("SuperAdminPassword");
		   LoginAsSuperAdmin login=new LoginAsSuperAdmin(driver);
		   login.loginSuperAdmin(email, Password);
		   
		   SuperAdminDashBoard dash=new SuperAdminDashBoard(driver);
		   dash.UserDropDown();
		   dash.userListPage();
		   
		   JavascriptExecutor js=(JavascriptExecutor) driver; 
	 
		   AddUserButton button=new AddUserButton(driver);
	
		   WebElement ele = driver.findElement(By.xpath("//button[text()=' Add New User']"));
		   js.executeScript("arguments[0].click()", ele);
		  
		   AddNewUserpopup newUser=new AddNewUserpopup(driver);
		   newUser.inputTextFieldForAdmin();
		   newUser.emailTextField.sendKeys("adminone"+ran+"@tru.agency");
		   driver.findElement(By.xpath("//div[@name=\"role\"]")).click();
		   driver.findElement(By.xpath("//div[text()='Admin']")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//label[text()='Select Company*']/..")).click();
		   
		   WebElement companyName = driver.findElement(By.xpath("(//label[text()='Select Company*']/../following-sibling::ul[@class=\"CustomSelectTag_selectTagList___jik7\"]/li)[1]"));
		   js.executeScript("arguments[0].scrollIntoView(true)", companyName);
		   companyName.click();
		   Thread.sleep(5000);
		   newUser.clickAddUserButton();
	Thread.sleep(2000);
		   try {
			   button.deleteUser();
		   }
	       catch(ElementClickInterceptedException e)
		   {
		   button.deleteUser();
	  	   }	
		   
		   driver.quit();
		   
		   
	}

}
