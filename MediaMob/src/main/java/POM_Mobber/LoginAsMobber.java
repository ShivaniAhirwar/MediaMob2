package POM_Mobber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAsMobber 
{
	public LoginAsMobber(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@id=\"email\"]")
	private WebElement emailTextField;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	private WebElement passwordTextField;
    
	@FindBy(xpath="//button[text()='Login']")
	private WebElement loginButton;

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void loginasMobber(String email, String Password)
	{
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(Password);
		loginButton.click();
	}
   
}
