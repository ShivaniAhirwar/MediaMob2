package POM_Mobber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage
{
     public RegistrationPage(WebDriver driver)
     { 
    	  PageFactory.initElements(driver, this);
     }
     
     @FindBy(xpath="//p[text()='Register']")
     private WebElement registerLink;
     
    @FindBy(xpath="//input[@id=\"firstName\"]")
    private WebElement firstNameTextField;
    
    @FindBy(xpath="//input[@id=\"lastName\"]")
    private WebElement lastNameTextField;
    
    @FindBy(xpath="//input[@id=\"email\"]")
    private WebElement emailTextField;
    
    @FindBy(xpath="//input[@id=\"password\"]")
    private WebElement passwordTextField;
    
    @FindBy(xpath="//input[@id=\"retypePassword\"]")
    private WebElement retrypePassword;
    
    @FindBy(xpath="//span[contains(@class,'Home_SignInCheckmar')]")
    private WebElement checkBox;
    
    @FindBy(xpath="//div[@class=\"Home_loginRegisterBtn__95h0E\"]/button[text()='Sign up']")
    private WebElement signUpButton;
    
    public WebElement getRegisterLink() {
		return registerLink;
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

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getRetrypePassword() {
		return retrypePassword;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getSignUpButton() {
		return signUpButton;
	}

	public void newRegistration(String firstName, String lastName, String email, String password, String retryPassword) throws Throwable
    {
		registerLink.click();
    	firstNameTextField.sendKeys(firstName);
    	lastNameTextField.sendKeys(lastName);
    	emailTextField.sendKeys(email);
    	passwordTextField.sendKeys(password);
    	retrypePassword.sendKeys(retryPassword);
    }
	public void clickActions() 
	{
		checkBox.click();
		
	}
	public void signupButton()
	{
		signUpButton.click();
	}
}
