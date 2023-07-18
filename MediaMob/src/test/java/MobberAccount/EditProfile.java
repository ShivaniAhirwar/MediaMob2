package MobberAccount;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic_Utilities.File_Utility;
import Generic_Utilities.WebDriver_Utility;
import POM_Mobber.LoginAsMobber;
import POM_Mobber.MobberDashboard;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditProfile 
{
   @Test
   public void edit() throws Throwable
   {
	   WebDriverManager.chromedriver().setup();
  	 WebDriver driver =new ChromeDriver();
  	 File_Utility filLib=new File_Utility();
	    String url = filLib.getCommonData("URL");
	    String email = filLib.getCommonData("Email");
	    String Password = filLib.getCommonData("Password");
  	 driver.get(url);
	    WebDriver_Utility weblib=new WebDriver_Utility();
	    weblib.implicitlywait(driver);
	    weblib.maximizeScreen(driver);
	   
	    LoginAsMobber mobber=new LoginAsMobber(driver);
	    mobber.loginasMobber(email, Password);
	    //Thread.sleep(3000);
	    
	   WebElement ele = driver.findElement(By.xpath("//div[@class=\"NavDropdown_nav-item__ZXtMO NavDropdown_hide__8Zpuv\"]/a[@id=\"Dropdown\"]"));

	      JavascriptExecutor js=(JavascriptExecutor) driver;
	      js.executeScript("arguments[0].click()", ele);
	      Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[text()='My Profile']")).click();
	    Thread.sleep(4000);
	    WebElement editButton = driver.findElement(By.xpath("//div[@class=\"myProfile_editUserBtnRow__7pOCX\"]/a[text()='Edit Profile']"));
	    js.executeScript("arguments[0].click()", editButton);
	    driver.findElement(By.xpath("//textarea[@name=\"bio\"]")).sendKeys("Testing automation");

	     WebElement updateButton = driver.findElement(By.xpath("//div[@class=\"UserButton\"]/button[text()='Update']"));
	     js.executeScript("arguments[0].click()", updateButton);   
	     driver.quit();
	     
   }
}
