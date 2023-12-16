package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	@Test
public void createAndDeleteCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
		HomePage h=new HomePage(driver);
		int time=2000;
		Thread.sleep(time);
		h.setTask();Thread.sleep(time);
		TaskListPage t=new TaskListPage(driver);Thread.sleep(time);
		t.getAddNewBtn().click();Thread.sleep(time);
		t.getNewCustomerBtn().click();Thread.sleep(time);
		String username = f.readDataFromExcel("createAndDeleteCustomer", 1, 1);
		String desc = f.readDataFromExcel("createAndDeleteCustomer", 1, 2);
		t.getCustomerNameTbx().sendKeys(username);Thread.sleep(time);
		t.getCustomerDescTbx().sendKeys(desc);Thread.sleep(time);
		t.getCompanyDropdown().click();Thread.sleep(time);
		t.getOurCompanyBtn().click();Thread.sleep(time);
		t.getCreateButton().click();Thread.sleep(time);
		String actualText = t.getCustomerNameField().getText();Thread.sleep(time);
		Assert.assertEquals(actualText, username);
		t.getSettingsBtn().click();Thread.sleep(time);
		t.getActionsBtn().click();Thread.sleep(time);
		t.getDeleteBtn().click();Thread.sleep(time);
		t.getPermanentlyDeleteBtn().click();Thread.sleep(time);
	}
	
}
