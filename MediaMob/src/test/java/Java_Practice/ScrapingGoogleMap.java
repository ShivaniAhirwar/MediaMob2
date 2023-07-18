package Java_Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrapingGoogleMap 
{
  
    public static void main(String[] args) throws Throwable 
    {
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.google.com/");
	  //  driver.findElement(By.xpath("//div[text()='Reject all']")).click();
	//    Thread.sleep(3000);
	    try {
	    	driver.findElement(By.xpath("//div[@class=\"RNNXgb\"]")).sendKeys("stores near by me");
	    }
	    catch(ElementNotInteractableException e)
	    {
	    driver.findElement(By.xpath("//textarea[@name=\"q\"]")).sendKeys("stores near by me");
	    }
	    driver.findElement(By.xpath("//ul[@jsname=\"bw4e9b\"]/li[1]")).click();
	    driver.findElement(By.xpath("//span[text()='More places']")).click();
//	    List<WebElement> Storenames = driver.findElements(By.xpath("//a[@jsname=\"kj0dLd\"]"));
//	    
//	    for(WebElement storeName:Storenames)
//	    {
//	    	System.out.println("storeName="+storeName.getText());
//	    }
	    
	    List<WebElement> style = driver.findElements(By.xpath("//span[@style=\"color:rgba(24,128,56,1.0)\"]"));
	    
	    for(WebElement s: style)
	    {
	    	System.out.println(s.getText());
	    }
	}
}
