package lib.selenium;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import lib.listeners.WebDriverListener;

public class WebDriverServiceImpl extends WebDriverListener implements WebDriverService{

	public WebElement locateElement(String locator, String locValue) {

		try {
			switch (locator) {
			case "id": return driver.findElement(By.id(locValue));

			case "class": return driver.findElement(By.className(locValue));

			case "link" : return driver.findElement(By.linkText(locValue));

			case "name" : return driver.findElement(By.name(locValue));

			case "xpath" : return driver.findElement(By.xpath(locValue));

			default:
				break;
			}
		} catch (NoSuchElementException e) {
			System.err.println("Element with Locator "+locator+" and Locator Value "+locValue+" is not found");
			throw new RuntimeException("NoSuchElementException");
		}
		return null;
	}

	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
		} catch (NoSuchElementException | InvalidElementStateException e) {
			System.err.println("Element "+ele+" is not found or not editable");
			throw new RuntimeException("NoSuchElementException");
		}		
	}


	public void click(WebElement ele) {
		try {
			ele.click();
		} catch (NoSuchElementException | InvalidElementStateException e) {
			System.err.println("Element "+ele+" is not found or not editable");
			throw new RuntimeException("NoSuchElementException");
		}		
	}

	public String getText(WebElement ele) {
		try {
			String eleText = ele.getText();
			return eleText;
		} catch (NoSuchElementException | InvalidElementStateException e) {
			System.err.println("Element "+ele+" is not found or not editable");
			throw new RuntimeException("NoSuchElementException");
		}	
	}

	public void selectDropDownUsingVisibleText(WebElement ele, String value) {
		try {
			Select selectObject=new Select(ele);
			selectObject.selectByVisibleText(value);
		} catch (NoSuchElementException | InvalidElementStateException e) {
			System.err.println("Element "+ele+" is not found or not editable");
			throw new RuntimeException("NoSuchElementException");
		}	
	}


	public void selectDropDownUsingValue(WebElement ele, String value) {
		// TODO Auto-generated method stub
		try {
			Select selectObject=new Select(ele);
			selectObject.selectByValue(value);
		}catch (NoSuchElementException | InvalidElementStateException e) {
			System.err.println("Element "+ele+" is not found or not editable");
			throw new RuntimeException("NoSuchElementException");
		}

	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		try {
			Select selectObject = new Select(ele);
			selectObject.selectByIndex(index);
		} catch (NoSuchElementException | InvalidElementStateException | IndexOutOfBoundsException e) {
			System.err.println("Element "+ele+" is not found or not editable or the specified index is invalid");
			throw new RuntimeException("NoSuchElementException");
		}	
	}

	public boolean verifyExactTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verifyPartialTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void switchToWindow(int index) {
		// TODO Auto-generated method stub

	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			System.err.println("No Alert present to accept");
			throw new RuntimeException("NoAlertPresentException");
		}

	}

	public void dismissAlert() {
		// TODO Auto-generated method stub

	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	public void closeActiveBrowser() {
		// TODO Auto-generated method stub

	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub

	}
	public void mouseOver(WebElement ele) {
		Actions builder = new Actions(driver);
		builder.moveToElement(ele).perform();

	}

	public void getOptions(WebElement ele) {
		Select selectObject = new Select(ele);
		List<WebElement> options = selectObject.getOptions();
		int size = options.size();
		System.out.println(size);

	}	public void clear(WebElement ele) {
		ele.clear();
		ele.sendKeys(Keys.BACK_SPACE);

	}
}