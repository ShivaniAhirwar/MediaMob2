package Generic_Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class WebDriver_Utility 
{
	
      public void javaScriptCLick(WebDriver driver, WebElement element)
      {
    	  JavascriptExecutor js=(JavascriptExecutor) driver;
    	  js.executeScript("arguments[0].click()", element);  
      }
      public void scrollByJavaScript(WebDriver driver, WebElement element)
      {
    	  JavascriptExecutor js=(JavascriptExecutor) driver;
    	  js.executeScript("arguments[0].scrollIntoView(true)", element);  
      }
      public void implicitlywait(WebDriver driver)
      {
    	
    	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      }
      public void maximizeScreen(WebDriver driver)
      {
    	  driver.manage().window().maximize();
      }
      public void assertMethod()
      {
    	  Assert.assertEquals(true, true);
      }
}
