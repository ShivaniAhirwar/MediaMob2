package POM_Mobber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectDetailPage 
{
      public ProjectDetailPage(WebDriver driver)
      {
    	  PageFactory.initElements(driver, this);
      }
	
	@FindBy(xpath="//button[text()='Submit Proposal']")
	private WebElement submitButton;
	@FindBy(xpath="//button[text()='Decline']")
	private WebElement declineButton;
	public WebElement getSubmitButton() {
		return submitButton;
	}
	public WebElement getDeclineButton() {
		return declineButton;
	}
	
	public void clickSubmitButton()
	{
		submitButton.click();
	}
	public void clickDeclineButton()
	{
		declineButton.click();
	}
}
