package MobberAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.File_Utility;
import Generic_Utilities.WebDriver_Utility;
import POM_Mobber.LoginAsMobber;
import POM_Mobber.MobberDashboard;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SubmitProposalTest extends BaseClass
{
	
	@Test()
    public void proposalSubmit() throws Throwable 
    {
	    WebDriver_Utility weblib=new WebDriver_Utility();
	    File_Utility filLib=new File_Utility();

	    String email = filLib.getCommonData("Email");
	    String Password = filLib.getCommonData("Password");
	    weblib.implicitlywait(driver);
	    weblib.maximizeScreen(driver);
	   
	    LoginAsMobber mobber=new LoginAsMobber(driver);
	    mobber.loginasMobber(email, Password);
	    
	    Thread.sleep(3000);
 	    try
 	    {
 	    	 WebElement projectTable = driver.findElement(By.xpath("//h2[@class=\"offers_offerhead__AqU3M\"]"));
 	    	 String msg="Please assign projects to mobber";
 	    	 System.out.println("document.msg.style.color = 'red';\"");
 	    }
 	    catch(NoSuchElementException n)
 	    {
	    WebElement projectName = driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]"));
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true)", projectName);
	    Thread.sleep(3000);
	    projectName.click();
	   
	    driver.findElement(By.xpath("//button[text()='Submit Proposal']")).click();
	    driver.findElement(By.xpath("//input[@name=\"hours\"]")).sendKeys("3");
	    driver.findElement(By.xpath("//textarea[@name=\"supportingInfo\"]")).sendKeys("teyfshgdytjdsfghcjsyhdffsjhdjfvdfuydfuyf");
	    driver.findElement(By.xpath("//input[@type=\"checkbox\"]/..")).click();
	    driver.findElement(By.xpath("//button[text()='Submit']")).click();
	    driver.findElement(By.xpath("//button[text()='Close']")).click();
	    
//	    driver.findElement(By.xpath("//a[text()='Projects']")).click();
//	    Thread.sleep(3000);
//	    WebElement projectName1 = driver.findElement(By.xpath("//table/tbody/tr[6]/td[2]"));
//	    js.executeScript("arguments[0].scrollIntoView(true)", projectName1);
//	    Thread.sleep(3000);
//	    projectName.click();
//       
//	    driver.findElement(By.xpath("//button[text()='Submit Proposal']")).click();
//	    driver.findElement(By.xpath("//input[@name=\"hours\"]")).sendKeys("2");
//	    driver.findElement(By.xpath("//textarea[@name=\"supportingInfo\"]")).sendKeys("teyfshgdytj623thcjsyhdffsjhdjfvdfuydfuyf");
//	    driver.findElement(By.xpath("//input[@type=\"checkbox\"]/..")).click();
//	    driver.findElement(By.xpath("//button[text()='Submit']")).click();
//	    driver.findElement(By.xpath("//button[text()='Close']")).click();
	    
	    MobberDashboard logout=new MobberDashboard(driver);
	    logout.logOut();
 	    }
	}
}
