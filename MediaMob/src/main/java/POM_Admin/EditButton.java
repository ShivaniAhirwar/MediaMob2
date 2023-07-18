package POM_Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditButton 
{
    public EditButton(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//button[contains(@class,'_adminEditProject__cHj3W themeBtn')]")
    private WebElement editButton;

	public WebElement getEditButton() {
		return editButton;
	}
    
    public void clickEditButton()
    {
    	editButton.click();	
    }
}
