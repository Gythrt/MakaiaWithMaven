package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MergeLead extends PreAndPost{
	@Test
	public void editlead() throws InterruptedException {
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
		
		WebElement eleMerge = locateElement("link","Merge Leads");
		click(eleMerge);
		
		/*WebElement eleFLead = locateElement("xpath","//input[@name='ComboBox_partyIdFrom']");
		type(eleFLead, "Gayu");
		Thread.sleep(5000);
		selectDropDownUsingValue(eleFLead, "Gayu T (11997)");
		//selectDropDownUsingIndex(eleFLead,0);
		
		WebElement eleTLead = locateElement("xpath", "//input[@name='ComboBox_partyIdTo']");
		type(eleTLead, "Gayu");
		Thread.sleep(5000);
		selectDropDownUsingIndex(eleTLead,1);*/
		
		WebElement eleFLead = locateElement("xpath","(//img[@alt=\"Lookup\"])[1]");
		click(eleFLead);
		switchToWindow(1);
		
		WebElement eleEFLead = locateElement("xpath","//input[@name=\"firstName\"]");
		type(eleEFLead,"Gayu");
		
		WebElement eleFL = locateElement ("xpath","//button[text()='Find Leads']");
		click(eleFL);
		
		WebElement eleselect = locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		click(eleselect);
		
		
		
		
		
				
		
		
		
		

	}
}
