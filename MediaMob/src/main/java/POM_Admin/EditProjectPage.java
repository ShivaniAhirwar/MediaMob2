package POM_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProjectPage
{
	WebDriver driver;
	public EditProjectPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[contains(@class,'projectdetail_windowbtninner__tSF7a')]/child::button[text()='Update Project']")
	private WebElement updateProjectButton;

	public WebElement getUpdateProjectButton() {
		return updateProjectButton;
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void setUpdateProjectButton(WebElement updateProjectButton) {
		this.updateProjectButton = updateProjectButton;
	}

	public void updateProjectButton()
	{
		updateProjectButton.click();
		
	}
}
