package Selenium_Challenges;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UICoding 
{
    public static void main(String[] args) 
    {
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://petdiseasealerts.org/forecast#/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    List<WebElement> states = driver.findElements(By.xpath("//*[@class=\"state\"]"));
	    for(WebElement s: states)
	    {
	    	System.out.println(s.getText());
	    }
	    driver.findElement(By.xpath("//*[@id=\"california\"]")).click();
	    
	}
}
