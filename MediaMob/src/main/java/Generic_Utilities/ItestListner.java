package Generic_Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ItestListner implements ITestListener
{
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test finished: "+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test finished: "+result.getName());
	}

	public void onTestFailure(ITestResult result) {
	  		
		String testname = result.getMethod().getMethodName();
		EventFiringWebDriver ts=new EventFiringWebDriver(BaseClass.sDriver);
		//TakesScreenshot ts= (TakesScreenshot) driver;
		File ram = ts.getScreenshotAs(OutputType.FILE);
		File file = new File("./Screenshots/"+testname+"photo2.png");
		try {
			FileUtils.copyFile(ram, file);
		} catch (IOException e) {
		
			e.printStackTrace();
		}

	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test finished: "+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test finished: "+result.getName());
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Test finished****"+context.getName());
	}
  
}
