package Registration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic_Utilities.File_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickOnForgetPasswordTest 
{
     public static void main(String[] args) throws Throwable 
     {
    	 WebDriverManager.chromedriver().setup();	
         WebDriver driver=new ChromeDriver();
         
         File_Utility fileLib=new File_Utility();
         String url=fileLib.getCommonData("URL");
         String email=fileLib.getCommonData("Email");
         String password=fileLib.getCommonData("Password");
         
         driver.get(url);
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.findElement(By.xpath("//a[text()='Forgot Password']")).click();
	
	}
}
