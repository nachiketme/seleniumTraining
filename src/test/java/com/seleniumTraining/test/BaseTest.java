package com.seleniumTraining.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	public WebDriver driver;


	@BeforeClass
	public void init()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/nachiketdeshpande/chromedriver");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("chrome", true);
		driver = new ChromeDriver(capabilities);
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit(); 
	}

	
	
}
