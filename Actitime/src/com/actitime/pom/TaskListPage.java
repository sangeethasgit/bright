package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath = "//div[text()='Add New']")
private WebElement addNewBtn;
	@FindBy(xpath = "//div[text()='+ New Customer']")
private WebElement newCustomerBtn;
	@FindBy(id="customerLightBox_nameField")
private WebElement customerNameTbx;	
	@FindBy(id="customerLightBox_descriptionField")
private WebElement customerDescTbx;
	@FindBy(xpath = "//button[contains(text(),'Select an active customer')]")
private WebElement companyDropdown;
	@FindBy(linkText = "Our Company")
private WebElement ourCompanyBtn;
	@FindBy(id="customerLightBox_commitBtn")
private WebElement createButton;
	@FindBy(xpath = "//div[@id='taskListBlock']//div[@class='header']/div[@class='title ellipsis']")
private WebElement customerNameField;
	@FindBy(xpath = "//div[@class='node customerNode selected']//div[@class='editButton available']")
private WebElement settingsBtn;
	@FindBy(xpath = "//div[@class='customerNamePlaceHolder']/..//div[text()='ACTIONS']")
private WebElement actionsBtn;
	@FindBy(xpath = "//div[text()='Delete']")
private WebElement deleteBtn;
	@FindBy(id="customerPanel_deleteConfirm_submitTitle")
private WebElement permanentlyDeleteBtn;
	
public TaskListPage(WebDriver driver) {
PageFactory.initElements(driver, this);		
}
public WebElement getAddNewBtn() {
	return addNewBtn;
}
public WebElement getNewCustomerBtn() {
	return newCustomerBtn;
}
public WebElement getCustomerNameTbx() {
	return customerNameTbx;
}
public WebElement getCustomerDescTbx() {
	return customerDescTbx;
}
public WebElement getCompanyDropdown() {
	return companyDropdown;
}
public WebElement getOurCompanyBtn() {
	return ourCompanyBtn;
}
public WebElement getCreateButton() {
	return createButton;
}
public WebElement getCustomerNameField() {
	return customerNameField;
}
public WebElement getSettingsBtn() {
	return settingsBtn;
}
public WebElement getActionsBtn() {
	return actionsBtn;
}
public WebElement getDeleteBtn() {
	return deleteBtn;
}
public WebElement getPermanentlyDeleteBtn() {
	return permanentlyDeleteBtn;
}
}
