package testAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	WebDriver driver;
	
	@BeforeTest
	public void setBrowser() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir").replace("\\", "/") + "/src/main/resources/Drivers/" + "chromedriver.exe");
		
		driver = new ChromeDriver();
		System.out.println("Instance is ChromeDriver");
		
	}
	
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void openBrowserAndApplication() {
		String url = "https://www.saucedemo.com/";
		driver.get(url);
		System.out.println("Opening URL - " + url);
	}
	
	@AfterMethod
	public void endTest() {
		driver.close();
		System.out.println("The test is finished");
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
		System.out.println("Instance of ChromeDriver killed");
	}
	
	
	

}
