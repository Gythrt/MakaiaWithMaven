package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.WebDriverServiceImpl;

public class DuplicateLead extends WebDriverServiceImpl{
	@Test
	public void duplicatelead() throws InterruptedException {
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

		WebElement eleFL = locateElement("link","Find Leads");
		click(eleFL);

		WebElement eleSfn = locateElement("xpath","(//input[@name='firstName'])[3]");
		type(eleSfn,"Gayu");

		WebElement eleFLe = locateElement("xpath","(//button[@type='button'])[7]");
		click(eleFLe);
		Thread.sleep(3000);

		WebElement eleres = locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a");
		click(eleres);
		
		WebElement eledup = locateElement("link","Duplicate Lead");
		click(eledup);
		
		WebElement eletitle = locateElement("id","createLeadForm_generalProfTitle");
		type(eletitle,"Duplicate Lead");
		
		WebElement elesubmit = locateElement("class","smallSubmit");
		click(elesubmit);

	}
}