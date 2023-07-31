package POM_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuperAdminDashBoard 
{
	public SuperAdminDashBoard(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//button[text()='Create New Project']")
	  private WebElement createProjectButton;
	
	@FindBy(xpath="//table/tbody/tr[1]/td[3]")
    private WebElement statusDropDown;
    
    @FindBy(xpath="//span[@class=\"ant-dropdown-menu-title-content\"]/span[text()='In Review']")
    public WebElement ReviewStatusOption;

    @FindBy(xpath="//span[@class=\"ant-dropdown-menu-title-content\"]/span[text()='In Progress']")
    public WebElement CompleteStatusOption;
    
    @FindBy(xpath="//span[@class=\"ant-dropdown-menu-title-content\"]/span[text()='Completed']")
    public WebElement ProgressStatusOption;

    @FindBy(xpath="//table/tbody/tr[1]/td[5]/descendant::span[@class=\"undefined icon-tableediticon\"]")
    private WebElement editIcon;
    
    @FindBy(xpath="//p[text()='Users']")
    private WebElement userDropdown;
    
    @FindBy(xpath="//span[@class=\"ant-menu-title-content\"]/child::a[text()='User Approvals']")
    private WebElement userApproval;
    
    @FindBy(xpath="//a[text()='User List']")
    private WebElement userList;
    
    @FindBy(xpath="//a[@id=\"Dropdown\"]")
    private WebElement dropdown;
    
    @FindBy(xpath="//a[text()='Logout']")
    private WebElement logoutLink;
    
    @FindBy(xpath="//a[text()='Clients']")
    private WebElement clientCompanyLink;
    
   
	public WebElement getClientCompanyLink() {
		return clientCompanyLink;
	}
	public WebElement getDropdown() {
		return dropdown;
	}
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	public WebElement getCreateProjectButton() {
		return createProjectButton;
	  }
		public WebElement getStatusDropDown() {
			return statusDropDown;
		}

		public WebElement getStatusOption() {
			return ReviewStatusOption;
		}
		
		public WebElement getReviewStatusOption() {
			return ReviewStatusOption;
		}
		public WebElement getCompleteStatusOption() {
			return CompleteStatusOption;
		}
		public WebElement getProgressStatusOption() {
			return ProgressStatusOption;
		}
		public WebElement getEditIcon() {
			return editIcon;
		}

	 	public WebElement getUserDropdown() {
	 		return userDropdown;
	 	}

	 	public WebElement getUserApproval() {
	 		return userApproval;
	 	}
	 	
	     public WebElement getUserList() {
	 		return userList;
	 	}

	 	public void UserDropDown()
	     {
	     	userDropdown.click();
	     }
	     public void userApprovalPage()
	     {
	     	userApproval.click();
	     }
	    
	     public void userListPage()
	     {
	     	userList.click();
	     }
	     public void changeStatus()
		    {
	    	 
	    	  statusDropDown.click();
		    
		    }	 
   public void ClickEditIcon()
   {
 	 editIcon.click();
   }
   
	  public void createProjectButton()
	  {
		  createProjectButton.click();  
	  }
	  public void logoOut()
	  {
		  dropdown.click();
		  logoutLink.click();
	  }
	  public void clickClientCompanyLink()
	  {
		  clientCompanyLink.click();
	  }
		     
}
