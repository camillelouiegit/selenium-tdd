package testAutomation.pageobjects;

import org.openqa.selenium.WebDriver;

import testAutomation.BasePage;

public class ProductsPage extends BasePage{

	public ProductsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void waitProductsPageHeader() {
		waitForVisibilityOfElement("//div[@class='header_secondary_container']//span[text()='Products']");
		System.out.println("Products Page Header is visible");
	}
	

}
