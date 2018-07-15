package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.WebDriverServiceImpl;

public class CreateLead extends WebDriverServiceImpl {
	@Test
	public void createLead() {
		WebElement eleUserName = locateElement("id","username");
		type(eleUserName, "DemoSalesManager");
		
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");
		
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		
		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);
		
		WebElement elecl = locateElement("link", "Create Lead");
		click(elecl);
		
		WebElement eleCN = locateElement("id","createLeadForm_companyName");
		type(eleCN,"Amazon");
		
		WebElement eleFN = locateElement("id","createLeadForm_firstName");
		type(eleFN,"Gayu");
		
		WebElement eleLN = locateElement("id","createLeadForm_lastName");
		type(eleLN,"Thiyagu");
		
		WebElement eleSou = locateElement ("id","createLeadForm_dataSourceId");
		selectDropDownUsingValue(eleSou,"LEAD_EMPLOYEE");
		
		WebElement eleMC = locateElement ("id", "createLeadForm_marketingCampaignId");
		selectDropDownUsingVisibleText(eleMC,"Automobile");
		
		WebElement eleCur = locateElement ("id","createLeadForm_currencyUomId");
		//getOptions(eleCur); doubt (to print all the options from drop down with count)
		selectDropDownUsingIndex (eleCur,8 );
		
		WebElement eleCal = locateElement ("id","createLeadForm_birthDate-button");
		click(eleCal);
		// how to select DOB
		
		WebElement eleSub = locateElement("class","smallSubmit");
		click(eleSub);
		
	}


}
