package pageObjects;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage extends BasePage{
	
	
	public loginPage(WebDriver driver) {
		super(driver);
		
		get("http://the-internet.herokuapp.com/login");
		assertTrue(isDisplayed(login),"The login form is not present");
		// TODO Auto-generated constructor stub
	}

	private WebDriver driver;
	By usernameLocator = By.id("username");
	By passwordLocator = By.id("password");
	By login = By.id("login");
	By successMessageLocator = By.cssSelector(".flash.success");
	By failedMessageLocator = By.cssSelector(".flash.error");	
	
	
	
	public void loginWith(String username, String Password)
	{
		type(username, usernameLocator);
		type(Password, passwordLocator);
		submit(login);
		
	}
	
	
	
	public boolean isFailedMessagePresent()
	{
		return isDisplayed(failedMessageLocator);
		
	}
	
	public boolean isSuccessMessagePresent()
	{
		return isDisplayed(successMessageLocator);
		
	}
	
}
