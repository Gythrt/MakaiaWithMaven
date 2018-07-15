
package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;

public class DataProvider extends PreAndPost{
	
    @Test(dataProvider="Testing")//(groups= {"smoke"})	//@Test(invocationCount=2,timeOut=30000)
	public void createLead(String cname,String fname,String lname,String email,int phone) {
		
		/*WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");
		*/
		/*WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		
		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);*/
		
		WebElement elecreate = locateElement("link","Create Lead1");
		click(elecreate);
		
		WebElement elecomp = locateElement("id","createLeadForm_companyName");
		type(elecomp,cname);
		
		WebElement elefname = locateElement("id","createLeadForm_firstName");
		type(elefname,fname);
		
		WebElement elelname = locateElement("id","createLeadForm_lastName");
		type(elelname,lname);
		
		/*WebElement elelmail = locateElement("id","createLeadForm_primaryEmail");
		type(elelmail,email);
		
		WebElement elephone = locateElement("id","createLeadForm_primaryPhoneNumber");
		type(elephone,""+phone);//""+phone converting integer to string
*/		
		WebElement elesubmit = locateElement("name","submitButton");
		click(elesubmit);
		
			
	}
    
    @DataProvider(name="CreateLead")
    public Object[][] getData()
    {
    	Object[][] data=new Object[2][5];
    	data[0][0]="Amazon";
    	data[0][1]="Gayu";
    	data[0][2]="T";
    	/*data[0][3]="PK@gmail.com";
    	data[0][4]=989487534;*/
    	
    	data[1][0]="Amazon";
    	data[1][1]="Madhu";
    	data[1][2]="P";
    	/*data[1][3]="vino@gmail.com";
    	data[1][4]=765843533;
    	*/
    	return data;
    }
	
	
}