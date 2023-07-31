package Generic_Utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass
{
	File_Utility fileLib=new File_Utility();
	 public static WebDriver driver;
	static WebDriver sDriver;
	
   @BeforeMethod
   public void Bm() throws Throwable
   {
	   String Browser = fileLib.getCommonData("Browser");  
	   if(Browser.equalsIgnoreCase("chrome"))
	   {
	     WebDriverManager.chromedriver().setup();
	     driver =new ChromeDriver();
	     File_Utility fileLib=new File_Utility();   
	     String url = fileLib.getCommonData("URL");
	     driver.get(url);
	   }
	   else if(Browser.equalsIgnoreCase("firefox"))
	   {
		   WebDriverManager.firefoxdriver().setup();
		     driver =new FirefoxDriver();
		     File_Utility fileLib=new File_Utility();   
		     String url = fileLib.getCommonData("URL");
		     driver.get(url);
	   }
	   else if(Browser.equalsIgnoreCase("edge"))
	   {
		   WebDriverManager.edgedriver().setup();
		     driver =new EdgeDriver();
		     File_Utility fileLib=new File_Utility();   
		     String url = fileLib.getCommonData("URL");
		     driver.get(url);
	   }
	   
        sDriver=driver;
   }
   
   
}
