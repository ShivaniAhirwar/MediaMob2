package Generic_Utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer
{

	
	 private int maxRetryCount = 2;
	    private int retryCount = 0;

	    public boolean retry(ITestResult result) {
	        if (retryCount < maxRetryCount) {
	            retryCount++;
	            return true; // Retry the test
	        }
	        return false; // Do not retry the test
   
	    } 
}
