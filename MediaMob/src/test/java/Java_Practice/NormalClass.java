package Java_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NormalClass
{
    public static void main(String[] args)
    {
    	WebDriverManager.chromedriver().setup();
	      
  	  WebDriver driver=new ChromeDriver();
  	  
  	  driver.get("https://www.flipkart.com/");	
  	  
  	  POMClass pom=new POMClass(driver);
  	    String result = pom.loginButton();
  	    System.out.println(result);
  	    driver.quit(); 
	}
}
