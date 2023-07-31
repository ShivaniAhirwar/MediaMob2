package POM_Admin;

import java.util.List;

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
	
	@FindBy(xpath="//table/tbody/tr/td/p[@data-att=\"Project Name\"]")
	public List<WebElement> deleteButtonIcon;

	@FindBy(xpath="//button[text()='Delete']")
	private WebElement deleteButton;
	
	public List<WebElement> getDeleteButtonIcon() {
		return deleteButtonIcon;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}
	
	public void deleteProject() throws Throwable
	{
		deleteButton.click();
		
	}
}
