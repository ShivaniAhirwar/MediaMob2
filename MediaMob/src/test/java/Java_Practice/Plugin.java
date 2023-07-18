package Java_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Plugin
{
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	      //ChromeOptions object
//	      ChromeOptions opt= new ChromeOptions();
//	      //set path of .crx file of extension
//	      opt.addExtensions(new File("C:\Users\Momentum_v0.92.2.crx"));
//	      //DesiredCapabilities object
//	      DesiredCapabilities c = DesiredCapabilities.chrome();
//	      // set ChromeOptions capability
//	      c.setCapability(ChromeOptions.CAPABILITY, opt);
//	      // pass capability to driver
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.tutorialspoint.com/index.htm");
//	WebDriver driver=new ChromeDriver();
//	driver.get("chrome://extensions/");
}
}
