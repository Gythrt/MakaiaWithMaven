package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.WebDriverServiceImpl;

public class Create extends WebDriverServiceImpl{
	@Test
	public void create() 
	{

		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");

		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");

		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);	

		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);

		WebElement eleAcc = locateElement("link", "Accounts");
		click(eleAcc);

		WebElement eleName = locateElement("id","accountName");
		type(eleName,"Hello");

		WebElement eleIndu = locateElement("name","industryEnumId");
		selectDropDownUsingVisibleText(eleIndu, "Finance");

		WebElement elecur = locateElement("id","currencyUomID");
		selectDropDownUsingVisibleText(elecur, "AMD - Armenian Dram");

		WebElement elesou = locateElement("id","dataSourceId");
		selectDropDownUsingVisibleText(elesou,"Cold Call");

		WebElement elemar = locateElement("id","marketingCampaignId");
		selectDropDownUsingVisibleText(elemar,"Automobile");

		WebElement eleNo = locateElement("id","primaryPhoneNumber");
		type(eleNo,"1234567890");




	}
}
