package Java_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass 
{
	 public POMClass(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	    
	    @FindBy(xpath="//a[text()='Login']")
	    private WebElement loginButton;

		public WebElement getLoginButton() {
			return loginButton;
		}
	    
	    public String loginButton()
	    {
	    	String a="Successfully automate the test script";
	    	loginButton.click();
			return a;
	    }

		
}
