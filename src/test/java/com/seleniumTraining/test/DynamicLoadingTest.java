package com.seleniumTraining.test;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.DynamicLoadingPage;
import pageObjects.LoginPage;


public class DynamicLoadingTest extends BaseTest{

	//private WebDriver driver;
	DynamicLoadingPage loading;

	@BeforeClass
	public void Setup() {
		loading = new DynamicLoadingPage(driver);
	}

	@Test
	public void testDyanamicLoadingOne()
	{
		loading.loadExample(1);
		assertTrue(loading.finishTextPresent(), "Check of finish text present");
	}

	@Test
	public void testDyanamicLoadingTwo()
	{
		loading.loadExample(2);
		assertTrue(loading.finishTextPresent(), "Check of finish text present");
	}

}
