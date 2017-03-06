package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class SetCapabilities extends BasePage{
	
	public SetCapabilities(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public WebDriver driver; 
	public LoginPage login;
	
	@BeforeClass
	public void Setup() {

		System.setProperty("webdriver.chrome.driver", "/Users/nachiketdeshpande/chromedriver");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("chrome", true);
		driver = new ChromeDriver(capabilities);
		login = new LoginPage(driver);
	}
	

	@AfterTest
	public void tearDown()
	{
		driver.quit(); 
	}
	
}
