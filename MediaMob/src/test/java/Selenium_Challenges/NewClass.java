package Selenium_Challenges;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewClass {

	 public static void main(String[] args)
     {

		WebDriverManager.chromedriver().setup();
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.olx.in/en-in");
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   driver.findElement(By.xpath("//div[@class=\"_2AOcM\"]/div[@class=\"P9UDC _1HxMQ\"]/descendant::span[text()='For Rent: Houses & Apartments']")).click();
		   List<WebElement> priceList = driver.findElements(By.xpath("//span[@data-aut-id=\"itemPrice\"]"));
		    int [] newArray= new int[priceList.size()];
	       int m=0;
		    for(WebElement p:priceList)
	        {
		    	
		    	 newArray[m] = Integer.parseInt(p.getText().replace(' ',','));
		    	m++;
	        }
	      for(int i=0;i<newArray.length;i++)
	      {
	    	  for(int j=i+1;j<newArray.length;j++)
	    	  {
	    		  if(newArray[i]>newArray[j])
	    		  {
	    			  int w=newArray[i];
	    			  newArray[i]=newArray[j];
	    			  newArray[j]=w;
	    		  }
	    	  }
	      }
	      for(int i=0;i<newArray.length;i++)
	      {
	    	  System.out.print(newArray[i]+" ");
	      }

	}
}