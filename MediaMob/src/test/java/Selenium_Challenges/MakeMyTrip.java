package Selenium_Challenges;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip
{
    public static void main(String[] args) throws InterruptedException
    {
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.makemytrip.com/");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//div[@class=\"makeFlex hrtlCenter\"]/descendant::li[text()='Round Trip']")).click();
	    driver.findElement(By.xpath("//label[@for=\"return\"]/descendant::span[text()='Return']")).click();
	    driver.findElement(By.xpath("//div[@class=\"DayPicker-Day\"]/descendant::p[text()='9']")).click();
	   
	    driver.findElement(By.xpath("//a[text()='Search']")).click();
	    driver.findElement(By.xpath("//span[@class=\"bgProperties icon20 overlayCrossIcon\"]")).click();
	    WebElement checkBox = driver.findElement(By.xpath("(//span[@class=\"commonCheckbox sizeSm primaryCheckbox\"])[1]"));
	    checkBox.click();
	    Thread.sleep(5000);
	    	checkBox.click();
	     JavascriptExecutor js=(JavascriptExecutor) driver;
	     for(int i=0;i<10;i++)
	     {
	     js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	     }
	     for (int i = 0; i < 10; i++) {

				js.executeScript("window.scrollTo(document.body.scrollHeight,0);");

			}
	     Thread.sleep(5000);
	   List<WebElement> flightPrices = driver.findElements(By.xpath("//div[@class=\"makeFlex priceInfo gap-x-10 \"]"));
	//   Thread.sleep(3000);
	    System.out.println("Departure filgth no.="+flightPrices.size());
	     List<WebElement> retunFlight = driver.findElements(By.xpath("//p[@class=\"blackText fontSize16 blackFont\"]"));
	    System.out.println("return flight no.="+retunFlight.size());
	     
    }
}
