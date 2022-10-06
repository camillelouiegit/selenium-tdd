package testAutomation;

import org.testng.annotations.Test;

import testAutomation.pageobjects.LoginPage;
import testAutomation.pageobjects.ProductsPage;

public class SauceDemoTest extends BaseTest{

	@Test
	public void sauceDemoTesting() throws Exception{
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername("standard_user");
		loginPage.enterPassword("secret_sauce");
		loginPage.clickLogin();
		ProductsPage productsPage = new ProductsPage(driver);
		productsPage.waitProductsPageHeader();
		
	}
	
}
