package com.seleniumTraining.test;

import org.testng.annotations.*;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import pageObjects.*;

public class TestLogin {

	public WebDriver driver; 
	public loginPage login;



	@BeforeClass
	public void Setup() {

		//WebDriver driver = new RemoteWebDriver(capabilities);
		//if you didn't update the Path system variable to add the full directory path to the executable as above mentioned then doing this directly through code
		//System.setProperty("webdriver.gecko.driver", "/Users/nachiketdeshpande/geckodriver.exe");

		System.setProperty("webdriver.chrome.driver", "/Users/nachiketdeshpande/chromedriver");

		//System.out.println("*******/n/n/n/nPrint set property "+System.getProperty("webdriver.chrome.driver"));

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("chrome", true);
		driver = new ChromeDriver(capabilities);
		login = new loginPage(driver);
	}


	@Test
	public void successTest()
	{
		login.loginWith("tomsmith", "SuperSecretPassword!");
		assertTrue(login.isSuccessMessagePresent(),"Unable to reach to login page");
	}

	@Test
	public void failedTest()
	{
		login.loginWith("dasdasd", "asdasdasd");
		assertTrue(login.isFailedMessagePresent(),"Unable to find failre message");

	}



	@AfterTest
	public void tearDown()
	{
		driver.quit(); 
	}


}
