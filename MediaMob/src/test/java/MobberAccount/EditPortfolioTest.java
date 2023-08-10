package MobberAccount;

import org.openqa.selenium.By;
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
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPortfolioTest extends BaseClass
{
   @Test()
   public void portfolio() throws Throwable
   {

	   CallUser userCall=new CallUser();
		userCall.callMobber();
		   WebElement ele = driver.findElement(By.xpath("//div[@class=\"NavDropdown_nav-item__ZXtMO NavDropdown_hide__8Zpuv\"]/a[@id=\"Dropdown\"]"));

		      JavascriptExecutor js=(JavascriptExecutor) driver;
		      js.executeScript("arguments[0].click()", ele);
		      Thread.sleep(4000);
		    driver.findElement(By.xpath("//a[text()='My Profile']")).click();
		    Thread.sleep(4000);
		    WebElement editButton = driver.findElement(By.xpath("//div[@class=\"myProfile_portfolioHeadRow__0sQZX\"]/button[text()='Edit Portfolio']"));
		    js.executeScript("arguments[0].click()", editButton);

		     WebElement updateButton = driver.findElement(By.xpath("//div[@class=\"UserButton\"]/button[text()='Update']"));
		     js.executeScript("arguments[0].click()", updateButton);   
		     driver.quit();
   }
}
