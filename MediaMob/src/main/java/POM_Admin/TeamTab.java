package POM_Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeamTab 
{
    public TeamTab(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//span[@class=\"ant-dropdown-trigger projectdetail_actionDots__TQWSB\"]")
    private WebElement threeDots;
    
	public WebElement getThreeDots() {
		return threeDots;
	}
    
	public void openDropdown()
	{
		threeDots.click();
	}
}
