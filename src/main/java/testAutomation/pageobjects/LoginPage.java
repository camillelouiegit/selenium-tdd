package testAutomation.pageobjects;

import org.openqa.selenium.WebDriver;

import testAutomation.BasePage;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	
	public void enterUsername(String text) {
		enterText(text, "//input[@id='user-name']");
		System.out.println("Entered " + text + " in the Username field");
	}
	
	public void enterPassword(String text) {
		enterText(text, "//input[@id='password']");
		System.out.println("Entered ****** in the Password field");
	}
	
	public void clickLogin() {
		click("//input[@id='login-button']");
		System.out.println("Clicked login button");
	}
}
