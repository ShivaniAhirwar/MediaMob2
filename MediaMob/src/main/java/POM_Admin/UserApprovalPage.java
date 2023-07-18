package POM_Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserApprovalPage
{
     public UserApprovalPage(WebDriver driver)
     {
    	 PageFactory.initElements(driver,this);
     }
     

     @FindBy(xpath="//tr[1]//button[text()='Approve']")
     private WebElement approveButton;
     
     @FindBy(xpath="//tr[1]//button[text()='Deny']")
     private WebElement denyButton;
     
     public WebElement getApproveButton() {
	 		return approveButton;
	 	}

	 	public WebElement getDenyButton() {
	 		return denyButton;
	 	}
	 	 public void approveButton()
	     {
	     	approveButton.click();	
	     }
	     public void denyButton()
	     {
	     	denyButton.click();
	     }
}
