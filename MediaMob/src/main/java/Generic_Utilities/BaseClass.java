package Generic_Utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass
{
	 public static WebDriver driver;
	static WebDriver sDriver;
   @BeforeMethod
   public void Bm() throws Throwable
   {
	   WebDriverManager.chromedriver().setup();
	   driver =new ChromeDriver();
	   
	     File_Utility fileLib=new File_Utility();   
	     String url = fileLib.getCommonData("URL");
	     driver.get(url);
        sDriver=driver;
   }
   
}
