package POM_Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientCompanyPopup 
{
   public ClientCompanyPopup(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   @FindBy(xpath="//span[@class=\"ant-input-group-wrapper ant-input-search\"]")
   private WebElement clientNametextField;
   @FindBy(xpath="//input[@name=\"phoneNumber\"]")
   private WebElement phoneNumTextField;
   @FindBy(xpath="//div[@class=\"CustomSelectTag_selectTagInbox__UPH68 \"]//label[text()='Users']")
   private WebElement userDropDown;
   @FindBy(xpath="//ul[@class=\"CustomSelectTag_selectTagList___jik7\"]/li[contains(text(),'adminn adminn')]")
   private WebElement userList;
   @FindBy(xpath="//div[@class=\"CustomSelectTag_selectTagInbox__UPH68 \"]//label[text()='Client Users']")
   private WebElement clientUserDropDown; 
   @FindBy(xpath="//ul[@class=\"CustomSelectTag_selectTagList___jik7\"]/li[contains(text(),'clientone@tru.agency')]")
   private WebElement clientUserList;
   @FindBy(xpath="//input[@name=\"streetAddress\"]")
   private WebElement addressTextField;
   @FindBy(xpath="//div[@name=\"Country\"]")
   private WebElement countryDropDown;
   @FindBy(xpath="//div[@title=\"Philippines\"]")
   private WebElement countryList;
   @FindBy(xpath="//div[@name=\"province\"]")
   private WebElement provinceDropDown;
   @FindBy(xpath="//div[@title=\"Aklan\"]")
   private WebElement provienceList;
   @FindBy(xpath="//div[@name=\"city\"]")
   private WebElement cityDropDown;
   @FindBy(xpath="//div[@title=\"Batan\"]")
   private WebElement cityList;
   @FindBy(xpath="//input[@name=\"postalCode\"]")
   private WebElement postalCodeTextField;
   @FindBy(xpath="//button[text()='Save']")
   private WebElement saveButton;
public WebElement getClientNametextField() {
	return clientNametextField;
}
public WebElement getPhoneNumTextField() {
	return phoneNumTextField;
}
public WebElement getUserDropDown() {
	return userDropDown;
}
public WebElement getClientUserDropDown() {
	return clientUserDropDown;
}
public WebElement getUserList() {
	return userList;
}
public WebElement getClientUserList() {
	return clientUserList;
}
public WebElement getCountryList() {
	return countryList;
}
public WebElement getProvienceList() {
	return provienceList;
}
public WebElement getCityList() {
	return cityList;
}
public WebElement getAddressTextField() {
	return addressTextField;
}
public WebElement getCountryDropDown() {
	return countryDropDown;
}
public WebElement getProvinceDropDown() {
	return provinceDropDown;
}
public WebElement getCityDropDown() {
	return cityDropDown;
}
public WebElement getPostalCodeTextField() {
	return postalCodeTextField;
}
public WebElement getSaveButton() {
	return saveButton;
}
   
public void inputTextField()
{
	clientNametextField.sendKeys("Company1");
	phoneNumTextField.sendKeys("2345678765");
	userDropDown.click();
	userList.click();
	clientUserDropDown.click();
	clientUserList.click();
	addressTextField.sendKeys("56rtfjytejytdtrsdfghjjhgdtdh5etgf");
	countryDropDown.click();
	countryList.click();
	provinceDropDown.click();
	provienceList.click();
	cityDropDown.click();
	cityList.click();
	postalCodeTextField.sendKeys("tawef3");
	saveButton.click();
}

}
