package lib.selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import lib.reports.ReadExcel;
import net.bytebuddy.build.ToStringPlugin.Exclude;

public class PreAndPost extends WebDriverServiceImpl{
	
	
	public String excelFileName;
	public String testCaseName, testDesc, nodeName, author, category;


	//@Parameters({"URL","userName"})
	@BeforeMethod
	public void beforeMethod() {
		//for reports
		startTestModule(nodeName);
		test.assignAuthor(author);
		test.assignCategory(category);
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		webdriver = new ChromeDriver();
		driver = new EventFiringWebDriver(webdriver);
		driver.register(this);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		type(locateElement("id", "username"), "DemoSalesManager");	
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("link", "CRM/SFA"));
	}
	
	@DataProvider(name = "fetch"/*, indices= {2,4,6,8}*/)
	public String[][] data() throws IOException {
		ReadExcel excel = new  ReadExcel();
		return excel.readExcel(excelFileName);
	}

	@AfterMethod
	public void afterMethod() {
		closeActiveBrowser();
	}

	@BeforeClass
	public void beforeClass() {
		startTestCase(testCaseName, testDesc);		
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
		
	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		startReport();
	}


	@AfterSuite
	public void afterSuite() {
		endResult();
	}

	
	
	
	
	
	
	
}
