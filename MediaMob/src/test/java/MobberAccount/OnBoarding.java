package MobberAccount;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DynamicXpathResource.DynamicXpathResource;
import Generic_Utilities.File_Utility;
import Generic_Utilities.WebDriver_Utility;
import POM_Mobber.LoginAsMobber;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OnBoarding 
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
	   WebElement startButton = driver.findElement(By.xpath("//button[text()='Start']"));
	   webLib.scrollByJavaScript(driver, startButton);
	   webLib.javaScriptCLick(driver, startButton);
	   driver.findElement(By.xpath("//label[text()='Country']/..")).click();
	   String requiredCountry="Philippines";
	   driver.findElement(By.xpath("//div[text()='"+requiredCountry+"']")).click();
	    
	   driver.findElement(By.xpath("//div[@name=\"province\"]")).click();
	   String selectProvience="Aklan";
	   driver.findElement(By.xpath("//div[text()='"+selectProvience+"']")).click();
	   driver.findElement(By.xpath("//div[@name=\"city\"]")).click();  
	   driver.findElement(By.xpath("//div[text()='Banga']")).click();
	   driver.findElement(By.xpath("//input[@name=\"postalCode\"]")).sendKeys("7tygytf");
	   driver.findElement(By.xpath("//input[@name=\"streetAddress\"]")).sendKeys("374rygfgsfasfdca efsd");
	   WebElement locationType = driver.findElement(By.xpath("//div[@class=\"logedin_locationWorkcheck__Q23Eg\"]/descendant::label[text()='Remote']"));
	   try {
	   locationType.click();
	   }
	   catch(ElementClickInterceptedException e)
	   {
		   locationType.click();
	   }
	   Thread.sleep(3000);
	   WebElement nextButton = driver.findElement(By.xpath("//button[text()='Next']"));
	   webLib.scrollByJavaScript(driver, nextButton);
	   try {
		   nextButton.click();
		   }
		   catch(ElementClickInterceptedException e)
		   {
			   nextButton.click();
		   }
	   WebElement serviceDropDown = driver.findElement(By.xpath("//label[text()='Select Services']/.."));
	   String[] services= {"Architecture & Interior Design","Art & Craft"};
	   serviceDropDown.click();
	     List<WebElement> serviceList = driver.findElements(By.xpath("//label[text()='Select Services']/../following-sibling::ul[@class=\"CustomSelectTag_selectTagList___jik7\"]/li"));
	     for(int i=0;i<=1;i++)
		   {
			   for(WebElement s:serviceList)
			   {
				   String serviceOne = s.getText();
				   if(serviceOne.equalsIgnoreCase(services[i]))
				   { 
					 s.click();
					 break;
				   }
			   }
			   serviceDropDown.click();
		   }   
     serviceDropDown.click();
     String[] skills= {"Architectural design", "3D rendering", "Space planning"};
  
	 WebElement skillDropDown = driver.findElement(By.xpath("//label[text()='Select Skill']/.."));
	 webLib.scrollByJavaScript(driver, skillDropDown); 
	 try {
	 skillDropDown.click();
	 }
	 catch(ElementClickInterceptedException e)
	 {
		 skillDropDown.click();
	 }
	 Thread.sleep(3000);
	 List<WebElement> skillList = driver.findElements(By.xpath("//label[text()='Select Skill']/../following-sibling::ul/li"));
	 for(int i=0;i<=2;i++)
	   {
		   for(WebElement skill:skillList)
		   {
			   String skillOne = skill.getText();
			   if(skillOne.equalsIgnoreCase(skills[i]))
			   { 
				   webLib.javaScriptCLick(driver, skill);
				 
				 break;
			   }
		   }
		   skillDropDown.click();
	   }    
	 skillDropDown.click();
	 Thread.sleep(3000);
	   WebElement yearDropDown = driver.findElement(By.xpath("//label[text()='Select Years']/.."));
	   webLib.scrollByJavaScript(driver, yearDropDown);
	   Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(yearDropDown)).click();
	   driver.findElement(By.xpath("//div[@class=\"rc-virtual-list-holder-inner\"]/div[@title=\"0-2 years\"]")).click();
	driver.findElement(By.xpath("//label[text()='Yes']/input[@name=\"commercialExperience\"]")).click();
	driver.findElement(By.xpath("//label[text()='Yes']/input[@name=\"technicalTraining\"]")).click();
	nextButton.click();
	driver.findElement(By.xpath("//input[@name=\"hourlyRate\"]")).sendKeys("45.54");
	driver.findElement(By.xpath("//input[@name=\"halfDayRate\"]")).sendKeys("46");
	driver.findElement(By.xpath("//input[@name=\"fullDayRate\"]")).sendKeys("234");
	nextButton.click();
	WebElement addNew = driver.findElement(By.xpath("//button[text()='Add New']"));
	webLib.javaScriptCLick(driver, addNew);
	Thread.sleep(3000);
	
	WebElement file = driver.findElement(By.xpath("(//input[@type=\"file\"])[2]"));
	file.sendKeys("/Users/pro/Downloads/ProfilePhoto.png");   
	
	driver.findElement(By.xpath("//button[@class=\"EditPortfolio_imageButton__VteDY\"]")).sendKeys("file:///Users/pro/Downloads/ProfilePhoto.png");
	driver.findElement(By.xpath("//input[@name=\"projectName\"]")).sendKeys("test project");
	driver.findElement(By.xpath("//input[@name=\"clientName\"]")).sendKeys("Brazil associate");
	driver.findElement(By.xpath("//input[@name=\"role\"]")).sendKeys("Automation Test Engineer");
	driver.findElement(By.xpath("//input[@name=\"url\"]")).sendKeys("https://www.google.com");
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
	Thread.sleep(3000);
	try {
	nextButton.click();
	}
	catch(ElementClickInterceptedException n)
	{
		nextButton.click();
	}
     }
     
}
