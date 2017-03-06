package com.seleniumTraining.test;

import org.testng.annotations.*;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import pageObjects.*;

public class LoginTest extends BaseTest {

	//public WebDriver driver; 
	public LoginPage login;



	@BeforeClass
	public void Setup() {

		login = new LoginPage(driver);

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




}
