package MobberAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import Generic_Utilities.File_Utility;
import Generic_Utilities.WebDriver_Utility;
import POM_Mobber.LoginAsMobber;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_Onboarding 
{
   public static void main(String[] args) throws Throwable 
   {
	   WebDriverManager.chromedriver().setup();
   	   WebDriver driver =new ChromeDriver();
   	   
   	   WebDriver_Utility webLib=new WebDriver_Utility();
   	 
   	   File_Utility fileLib=new File_Utility();
   	   String url = fileLib.getCommonData("URL");
   	   webLib.implicitlywait(driver);
   	   webLib.maximizeScreen(driver);
   	   String email = fileLib.getCommonData("Email");
   	   String Password = fileLib.getCommonData("Password");
   	   driver.get(url);
   	   LoginAsMobber mobber=new LoginAsMobber(driver);
   	   mobber.loginasMobber(email, Password);
   	   
      	WebElement addNew = driver.findElement(By.xpath("//button[text()='Add New']"));
       	webLib.javaScriptCLick(driver, addNew);
       	Thread.sleep(3000);
       	
       	driver.findElement(By.xpath("//button[@class=\"EditPortfolio_imageButton__VteDY\"]")).click();
    // Click on the pattern object
    Screen screen = new Screen();
    String imagePath = System.getProperty("user.dir")+"/SikuliImages/cancelButtonBlack.png";
    Pattern cancelButton = new Pattern(imagePath);
    screen.wait(cancelButton, 10).click();
  
    //"user.dir")+"SikuliImage/CancleButton.png"
        
     
//       	driver.findElement(By.xpath("//button[@class=\"EditPortfolio_imageButton__VteDY\"]")).sendKeys("file:///Users/pro/Downloads/ProfilePhoto.png");
       	driver.findElement(By.xpath("//input[@name=\"projectName\"]")).sendKeys("test project");
       	driver.findElement(By.xpath("//input[@name=\"clientName\"]")).sendKeys("Brazil associate");
       	driver.findElement(By.xpath("//input[@name=\"role\"]")).sendKeys("Automation Test Engineer");
       	driver.findElement(By.xpath("//input[@name=\"url\"]")).sendKeys("https://www.google.com");
       	driver.findElement(By.xpath("//button[text()='Submit']")).click();
   }
}
