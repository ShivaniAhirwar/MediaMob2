package POM_Mobber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobberDashboard
{
    public MobberDashboard(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
		
    @FindBy(xpath="//a[@id=\"Dropdown\"]")
    private WebElement dropdown;
    
    @FindBy(xpath="//a[text()='Logout']")
    private WebElement logoutLink;
    
    @FindBy(xpath="//span[@class=\"NavDropdown_userdropdownIcon__6x_V1\"]/span[@class=\" icon-setting-profile\"]")
    private WebElement myProfileLink;
    
    public WebElement getMyProfileLink() {
		return myProfileLink;
	}
	public WebElement getDropdown() {
		return dropdown;
	}
	public WebElement getLogoutLink() {
		return logoutLink;
	}
   public void logOut()
   {
	   dropdown.click();
	   logoutLink.click();
   }
   public void myProfile()
   {
	   dropdown.click();   
	   myProfileLink.click();
   }
}
