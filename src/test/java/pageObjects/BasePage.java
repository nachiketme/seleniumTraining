package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

public class BasePage {
	
	private WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this .driver = driver;
	}

	public void get(String URL)
	{
		driver.get(URL);
	}
	
	public void type(String inputString, By locator)
	{
		driver.findElement(locator).sendKeys(inputString);
	}
	
	public WebElement fine(By locator)
	{
		return driver.findElement(locator);
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
	
	
	
}
