package POM_Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewUserpopup
{
    public AddNewUserpopup(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//input[@name=\"firstName\"]")
    private WebElement firstNameTextField;
    @FindBy(xpath="//input[@name=\"lastName\"]")
    private WebElement lastNameTextField;
    @FindBy(xpath="//input[@name=\"email\"]")
    public WebElement emailTextField;
    @FindBy(xpath="//input[@name=\"phone\"]")
    private WebElement phoneNumTextField;
    @FindBy(xpath="//div[@name=\"role\"]")
    private WebElement userDropDown;
    @FindBy(xpath="//div[text()='Client']")
    private WebElement selectClientOption;
    @FindBy(xpath="//button[text()='Add User']")
    private WebElement addUserButton;
    
	public WebElement getSelectClientOption() {
		return selectClientOption;
	}
	public WebElement getAddUserButton() {
		return addUserButton;
	}
	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}
	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}
	public WebElement getEmailTextField() {
		return emailTextField;
	}
	public WebElement getPhoneNumTextField() {
		return phoneNumTextField;
	}
	public WebElement getUserDropDown() {
		return userDropDown;
	}
    
	public void inputTextField()
	{
		firstNameTextField.sendKeys("client");	
		lastNameTextField.sendKeys("user");
		//emailTextField.sendKeys("clientone@tru.agency");
		phoneNumTextField.sendKeys("2349875678");
	}
	public void dropDown()
	{
		userDropDown.click();
		selectClientOption.click();
	}
	public void clickAddUserButton()
	{
		addUserButton.click();
	}
	public void inputTextFieldForAdmin()
	{
		firstNameTextField.sendKeys("admin");	
		lastNameTextField.sendKeys("user");
		phoneNumTextField.sendKeys("2349875678");
	}
	public void emailForClient(String email)
	{
		emailTextField.sendKeys(email);
	}
}
