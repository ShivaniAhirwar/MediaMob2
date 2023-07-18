package POM_Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApproveOrDenyPopup
{
    
	@FindBy(xpath="//button[text()='Continue']")
	private WebElement continueButton;
	
	@FindBy(xpath="//button[text()='Cancel']")
	private WebElement cancelButton;
	
	public ApproveOrDenyPopup(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	public void ClickOnContinueForDenyOrApprove()
	{
		continueButton.click();
	}
	public void ClickOnCancelForDenyOrApprove()
	{
		
	}
}
