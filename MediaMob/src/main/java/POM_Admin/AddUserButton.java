package POM_Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserButton
{
	public AddUserButton(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()=' Add New User']")
	private WebElement addNewUserButton;
	
	public WebElement getAddNewUserButton() {
		return addNewUserButton;
	}
	public void clickAddNewUserButton()
	{
		addNewUserButton.click();
	}
	
	@FindBy(xpath="//button[text()='Delete']")
	private WebElement deleteButton;
	
	@FindBy(xpath="//button[text()='Continue']")
	private WebElement contineuButton;

	public WebElement getDeleteButton() {
		return deleteButton;
	}
	public WebElement getContineuButton() {
		return contineuButton;
	}
	
	public void deleteUser()
	{
		deleteButton.click();
		contineuButton.click();
	}
	
}
