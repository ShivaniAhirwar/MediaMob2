package POM_Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectDelete 
{
	public ProjectDelete(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[@class=\"undefined icon-tabledelicon \"])[1]")
	private WebElement deleteButtonIcon;

	@FindBy(xpath="//button[text()='Delete']")
	private WebElement deleteButton;
	
	public WebElement getDeleteButtonIcon() {
		return deleteButtonIcon;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}
	
	public void deleteProject() throws Throwable
	{
		deleteButtonIcon.click();
		Thread.sleep(3000);
		deleteButton.click();
		
	}
}
