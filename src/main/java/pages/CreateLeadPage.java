package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class CreateLeadPage extends WebDriverServiceImpl{
	
	public CreateLeadPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver= driver;
		this.test= test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="createLeadForm_companyName")
	WebElement eleCName;
	public CreateLeadPage enterCName(String data) {
		type(eleCName, data);
		return this;
	}
	
	@FindBy(id="createLeadForm_firstName")
	WebElement eleFName;
	public CreateLeadPage enterFName(String data) {
		type(eleFName, data);
		return this;
	}
	
	@FindBy(id="createLeadForm_lastName")
	WebElement eleLName;
	public CreateLeadPage enterLName(String data) {
		type(eleLName, data);
		return this;
	}
	

	@FindBy(className="smallSubmit")
	WebElement eleSubmit;
	public ViewLeadPage clickSubmit() {
		click(eleSubmit);
		return new ViewLeadPage(driver, test);
	}

}
