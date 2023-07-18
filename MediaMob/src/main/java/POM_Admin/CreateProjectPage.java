package POM_Admin;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Generic_Utilities.WebDriver_Utility;

public class CreateProjectPage
{
	
     public CreateProjectPage(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
     
    @FindBy(xpath="//input[@name=\"projectTitle\"]")
    private WebElement projectNameTextField;
    
    @FindBy(xpath="//label[text()='Client Name']/..")
    private WebElement clientDropDown;
   
    @FindBy(xpath="//div[@class=\"ant-select-item-option-content\"]")
    private List<WebElement> clientListDropDown=new ArrayList<WebElement>();

	@FindBy(xpath="//input[@name=\"brandName\"]")
    private WebElement brandNameTextField;
    
    @FindBy(xpath="//div[@class=\"se-wrapper-inner se-wrapper-wysiwyg sun-editor-editable\"]")
    private WebElement projectdetailTextField;
    
    @FindBy(xpath="//input[@name=\"projectBrief.0.proposalTitle\"]")
    private WebElement mobberBriefTextField;
    
    @FindBy(xpath="//div[@class=\"sun-editor\"]/descendant::span[text()=' Mobber brief details']/../child::div[contains(@class,'se-wrapper-inner')]")
    private WebElement mobberBriefDetails;
    
    @FindBy(xpath="//div[@name=\"projectBrief.0.date\"]")
    public WebElement clickDatePicker;
   
    @FindBy(xpath="//div[@name=\"date\"]")
    public WebElement clickProjectDatePicker;
    
   @FindBy(xpath="(//div[@class=\"ant-picker-body\"]//table/tbody/tr[5]//td[5])[1]")
   private WebElement clickOnCalender;
   
   @FindBy(xpath="(//div[@class=\"ant-picker-body\"]//table/tbody/tr[5]//td[7])[2]")
   private WebElement selectDates;
   
   @FindBy(xpath="(//div[@class=\"ant-picker-body\"]//table/tbody/tr[5]//td[5])[3]")
   private WebElement clickOnProjectCalender;
   
   @FindBy(xpath="(//div[@class=\"ant-picker-body\"]//table/tbody/tr[5]//td[7])[3]")
   private WebElement selectProjectDates;
   
    @FindBy(xpath="//span[@class=\"ant-select-selection-search\"]/ancestor::div[@name=\"projectBrief.0.locationtype\"]")
    private WebElement LocationType;
    
    @FindBy(xpath="(//div[text()='Remote'])[2]")
    private WebElement RemoteLocationType;
    
    @FindBy(xpath="//label[text()='Select Service']/../../..")
    private WebElement selectServiceDropDown;
    
    @FindBy(xpath="//label[text()='Select Service']/../following-sibling::ul[@class=\"CustomSelectTag_selectTagList___jik7\"]/li[text()='Art & Craft']")
    public WebElement serviceList;
    
    @FindBy(xpath="//div[@name=\"project_manager\"]")
    public WebElement prajectManagerDropDown;
    
    @FindBy(xpath="//div[@name=\"project_manager\"]/descendant::div[contains(@class,'ant-select-dropdown')]")
    private WebElement prajectmanagerList;
    
    @FindBy(xpath="//button[text()='Save Project']")
    public WebElement saveButton;
    
    @FindBy(xpath="//h1[@class=\"projectdetail_projectTitle__w01kK\"]")
    public WebElement createdProjectName;
    
    @FindBy(xpath="//input[@id=\"projectBudget\"]")
    private WebElement proejctBudget;
    
	public WebElement getProjectNameTextField() {
		return projectNameTextField;
	}

	public WebElement getBrandNameTextField() {
		return brandNameTextField;
	}

	public WebElement getProjectdetailTextField() {
		return projectdetailTextField;
	}

	public WebElement getMobberBriefTextField() {
		return mobberBriefTextField;
	}

	public WebElement getMobberBriefDetails() {
		return mobberBriefDetails;
	}
	
public WebElement getClickOnCalender() {
		return clickOnCalender;
	}

	public WebElement getSelectDates() {
		return selectDates;
	}

	public WebElement getClickOnProjectCalender() {
		return clickOnProjectCalender;
	}

	public WebElement getSelectProjectDates() {
		return selectProjectDates;
	}

public WebElement getClientDropDown() {
		return clientDropDown;
	}

	public List<WebElement> getClientListDropDown() {
		return clientListDropDown;
	}
	
public WebElement getLocationType() {
		return LocationType;
	}

	public WebElement getRemoteLocationType() {
		return RemoteLocationType;
	}

	public WebElement getSelectServiceDropDown() {
		return selectServiceDropDown;
	}

	public WebElement getServiceList() {
		return serviceList;
	}

public WebElement getClickDatePicker() {
		return clickDatePicker;
	}

	public WebElement getClickProjectDatePicker() {
		return clickProjectDatePicker;
	}

	
public WebElement getProejctBudget() {
		return proejctBudget;
	}

public String projectName(String projectName)
{
	projectNameTextField.sendKeys(projectName);	
	return projectName;
	
}
public WebElement getPrajectManagerDropDown() {
	return prajectManagerDropDown;
}

public WebElement getPrajectmanagerList() {
	return prajectmanagerList;
}

public WebElement getSaveButton() {
	return saveButton;
}

public WebElement getCreatedProjectName() {
	return createdProjectName;
}

public void mobberBrief()
{
	brandNameTextField.sendKeys("1+");
	projectdetailTextField.sendKeys("weyusghdbyeudfsghcbsuydxc uydshgxcb");
	mobberBriefTextField.sendKeys("Mob1");
	mobberBriefDetails.sendKeys("eydsfghcefg ueydgfsj ueyfdg usydgf");
}
public void calender() 
{
	clickOnCalender.click();
	selectDates.click();
}
public void projectCalender() throws Throwable
{
	clickOnProjectCalender.click();
	selectProjectDates.click();
}
public void clientNameDropDown() throws Throwable
{
	String c="test client on dev";
	clientDropDown.click();
	Thread.sleep(3000);
	for(WebElement list:clientListDropDown)
	{
		String clientname=list.getText();
		if(clientname.equalsIgnoreCase(c))
		{
			list.click();
			break;
		}
	}
}

public void SelectlocationType() 
{
	LocationType.click();

	RemoteLocationType.click();
}
public void sevices() throws Throwable
{
	selectServiceDropDown.click();
}
public void managerDropDOwn()
{
	prajectManagerDropDown.click();
	prajectmanagerList.click();
}
public void ProjectBudget(String budget)
{
	proejctBudget.sendKeys(budget);
}

// Mobber brief 2

@FindBy(xpath="//input[@name=\"projectBrief.1.proposalTitle\"]")
private WebElement mobberBriefTextField2;

@FindBy(xpath="(//div[@class=\"sun-editor\"]/descendant::span[text()=' Mobber brief details']/../child::div[contains(@class,'se-wrapper-inner')])[2]")
private WebElement mobberBriefDetails2;

@FindBy(xpath="//div[@name=\"projectBrief.1.date\"]")
public WebElement clickDatePicker2;

@FindBy(xpath="(//div[@class=\"ant-picker-panels\"]//table)[5]/tbody//tr[3]/td[3]")
private WebElement clickOnCalender2;

@FindBy(xpath="(//div[@class=\"ant-picker-panels\"]//table)[6]/tbody//tr[3]/td[3]")
private WebElement selectDates2;

@FindBy(xpath="//span[@class=\"ant-select-selection-search\"]/ancestor::div[@name=\"projectBrief.1.locationtype\"]")
private WebElement LocationType2;

@FindBy(xpath="(//div[@title=\"Remote\"]/div[text()='Remote'])[2]")
private WebElement RemoteLocationType2;

@FindBy(xpath="(//label[text()='Select Service']/../../..)[2]")
private WebElement selectServiceDropDown2;

@FindBy(xpath="(//label[text()='Select Service']/../following-sibling::ul[@class=\"CustomSelectTag_selectTagList___jik7\"]/li[text()='Art & Craft'])[2]")
public WebElement serviceList2;


public WebElement getMobberBriefTextField2() {
	return mobberBriefTextField2;
}

public WebElement getMobberBriefDetails2() {
	return mobberBriefDetails2;
}

public WebElement getClickDatePicker2() {
	return clickDatePicker2;
}

public WebElement getClickOnCalender2() {
	return clickOnCalender2;
}

public WebElement getSelectDates2() {
	return selectDates2;
}

public void mobberBrief2()
{
	mobberBriefTextField2.sendKeys("tywfshc");
	mobberBriefDetails2.sendKeys("ywehgsdxcuydhjscbxedvdsfverfdefd");
}
public void locationType2() throws Throwable
{
	LocationType2.click();
	Thread.sleep(3000);
	RemoteLocationType2.click();
	
}
public void serviceType2()
{
	selectServiceDropDown2.click();
}
public void calender2()
{
	clickOnCalender2.click();
	selectDates2.click();
}
}
