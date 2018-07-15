package testcaes;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.MyHomePage;

public class CreateLead extends PreAndPost{

	@BeforeTest
	public void setValue() {
		testCaseName = "CreateLead";
		testDesc ="Create a new lead";
		nodeName="Lead";
		author="Gayu";
		category="Sanity";
		excelFileName = "TC001";
	}
	@Test(dataProvider="fetch")
	public void createLead(String cName,String fName,String lName){		
			
		new MyHomePage(driver, test)
		.clickLeads()
		.clickCreateLead()
		.enterCName(cName)
		.enterFName(fName)
		.enterLName(lName)
		.clickSubmit();
		
					
	}
	
}








