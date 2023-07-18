package POM_Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientCompanyButton 
{
    public ClientCompanyButton(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//button[text()='Client Company']")
    private WebElement clientCompanyButton;

	public WebElement getClientCompanyButton() {
		return clientCompanyButton;
	}
    
    public void openClientCompanyPOpup()
    {
    	clientCompanyButton.click();
    }
}
