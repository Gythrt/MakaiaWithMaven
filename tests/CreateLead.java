package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class CreateLead extends PreAndPost{

	@Test
	public void createLead() {
		
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");
		
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		
		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);
		
		WebElement elecl = locateElement("link", "Create Lead");
		click(elecl);
		
		WebElement elecn = locateElement("id", "createLeadForm_companyName");
		type(elecn, "Amazon");
		
		WebElement elefn = locateElement("id", "createLeadForm_firstName");
		type(elefn, "Gayathri");
		
		WebElement eleln = locateElement("id", "createLeadForm_lastName");
		type(eleln, "Thiyagarajan");
		
		
		
	}
	
	
}




