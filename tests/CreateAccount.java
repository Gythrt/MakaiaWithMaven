package tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/"); 
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Accounts").click();
		driver.findElementByLinkText("Create Account").click();
		driver.findElementByLinkText("Create Account").click();
		driver.findElementById("accountName").sendKeys("Hello");
		
		WebElement industry = driver.findElementByXPath("//select[@name='industryEnumId']");
		Select obj = new Select(industry);
		List<WebElement> ob = obj.getOptions();
		int size = ob.size();
		System.out.println(size);
		obj.selectByIndex(size-1);
		
	
		WebElement currency = driver.findElementByXPath("//select[@id='currencyUomId']");
		Select obj1 = new Select(currency);
		obj1.selectByValue("BMD - Bermudan Dollar");
		
	}

}
