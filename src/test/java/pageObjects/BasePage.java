package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.seleniumTraining.test.config.Config;

public class BasePage implements Config{

	private WebDriver driver;

	public BasePage(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebDriver getDriver()
	{
		return this.driver;
	}
	
	public void visit(String URL)
	{
		if(URL.contains("http"))
		{
			driver.get(URL);
		}
		else
		{
			driver.get(baseUrl+URL);
		}
	}

	public void type(String inputString, By locator)
	{
		driver.findElement(locator).sendKeys(inputString);
	}

	public WebElement fine(By locator)
	{
		return driver.findElement(locator);
	}

	public void click(By locator)
	{
		driver.findElement(locator).click();
	}

	public void submit(By locator)
	{
		driver.findElement(locator).submit();
	}

	public boolean isDisplayed(By locator)
	{
		try
		{
			return driver.findElement(locator).isDisplayed();
		}
		catch(ElementNotFoundException e)
		{
			return false;
		}
	}

	public boolean waitForDisplayed(By locator,Integer...timeout)
	{
		try {
			waitFor(ExpectedConditions.visibilityOfElementLocated(locator),(timeout.length > 0 ? timeout[0]:null));
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	private void waitFor(ExpectedCondition<WebElement> condition, Integer timeout) {
		timeout = timeout != null ? timeout : 5;
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(condition);
	}


}
