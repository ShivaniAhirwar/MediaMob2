package POM_Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAsSuperAdmin
{
	public LoginAsSuperAdmin(WebDriver driver)
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
	
	public void loginSuperAdmin(String email, String password)
	{
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}
}
