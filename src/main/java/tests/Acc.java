package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class Acc extends PreAndPost{

	@Test
	public void create() throws InterruptedException {

		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");

		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");

		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);	

		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);

		WebElement eleCreateLead = locateElement("link", "Create Account");
		click(eleCreateLead);

		WebElement eleAccName= locateElement("id", "accountName");
		type(eleAccName, "Gayathri");

		WebElement eleIndustry = locateElement("name", "industryEnumId");
		selectDropDownUsingValue(eleIndustry, "IND_SOFTWARE");

		WebElement eleCurrency = locateElement("id","currencyUomId");
		selectDropDownUsingVisibleText(eleCurrency,"INR - Indian Rupee");

		WebElement eleSource = locateElement("id","dataSourceId");
		selectDropDownUsingIndex(eleSource,2);

		WebElement eleMarketingCamp = locateElement("id","marketingCampaignId");
		selectDropDownUsingIndex(eleMarketingCamp,3);

		WebElement phonenum = locateElement("id", "primaryPhoneNumber");
		type(phonenum, "1234567798");

		WebElement city = locateElement("id", "generalCity");
		type(city, "Chennai");

		WebElement primaryEmail = locateElement("id", "primaryEmail");
		type(primaryEmail, "gayu@gmail.com");

		WebElement country = locateElement("id","generalCountryGeoId");
		selectDropDownUsingVisibleText(country,"India");

		WebElement eleState = locateElement("id","generalStateProvinceGeoId");
		selectDropDownUsingIndex(eleState,3);

		WebElement eleSubmit = locateElement("class","smallSubmit");
		click(eleSubmit);
		
		WebElement CapAccount = locateElement("Xpath", "(//*[@class='tabletext'])[3]");
		String text=CapAccount.getText();
		String replaceAll = text.replaceAll("[^0-9]","");
		System.out.println("output of create accountid:" +replaceAll);

		WebElement findAccount = locateElement("link", "Find Accounts");
		click(findAccount);

		WebElement accName = locateElement("Xpath", "(//input[@name='accountName'])[2]");
		type(accName, "Gayathri");

		WebElement accID = locateElement("Xpath", "//input[@name='id']");
		type(accID, replaceAll);

		WebElement findLead = locateElement("Xpath", "//button[text()='Find Accounts']");
		click(findLead);

		WebElement result = locateElement("Xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		click(result);

		WebElement verify = locateElement("Xpath", "(//span[@class='tabletext'])[3]");
		verifyPartialText(verify, replaceAll);
		
		

		driver.close();


		
}

}
