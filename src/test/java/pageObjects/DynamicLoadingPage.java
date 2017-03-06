package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage extends BasePage{

	public DynamicLoadingPage(WebDriver driver) {
		super(driver);
		
	}

	By startButton = By.cssSelector("#start button");
	By finish = By.id("finish");
	
	public void loadExample(Integer exampleNumber)
	{
		visit("/dynamic_loading/"+exampleNumber);
		click(startButton);
	}
	
	
	public boolean finishTextPresent()
	{
		return waitForDisplayed(finish, 10);
	}
	
	
}
