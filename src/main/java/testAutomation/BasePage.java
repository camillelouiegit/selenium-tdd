package testAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage{
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void click(String locator){
		WebElement element = driver.findElement(By.xpath(locator));
		element.click();
		System.out.println("The element has been clicked.");
	}
	
	public void enterText(String text, String locator){
		WebElement element = driver.findElement(By.xpath(locator));
		element.sendKeys(text);
		System.out.println("The element has been clicked.");
	}
	
	public void waitForVisibilityOfElement(String locator) {
		wait = new WebDriverWait(driver, 10);
		WebElement element = driver.findElement(By.xpath(locator));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
