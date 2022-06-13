package com.Test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.PageFactory.HomePage;
import com.PageFactory.LoginPage;
import com.PageFactory.PortfolioPage;

public class PortfolioTest extends BaseClass{
	
	private LoginPage objLoginPage;
	private HomePage objHomePage;
	private PortfolioPage objPortfolioPage;
	
	public void initializeWebPage() {
		objLoginPage = new LoginPage();
		objHomePage = new HomePage();
		objPortfolioPage = new PortfolioPage();
	}
	
	@BeforeClass
	public void initializeWebEnv() {
		this.initializeWebPage();
		objLoginPage.initializeBrowser("https://ebs4-qa2.simplifyhealthcare.com/");
	}
	
	@AfterClass
	public void tearDown() {
		objLoginPage.tearDownMethod();
	}
	
	@Test(priority = 0)
	public void TCID_101_VerifyPortfolioPageIsDisplayed() throws InterruptedException{
		objLoginPage.setUsername("v-khushbut");
		objLoginPage.setPassword("Summer@2018#");
		objLoginPage.clickOnGetStarted();
		
		objLoginPage.setPause(10);
		//Thread.sleep(15000);
		objHomePage.clickOnPortfolioProducts();
		
		String strExpectedUrl = "https://ebs4-qa2.simplifyhealthcare.com/ConsumerAccount/PortfolioSearch";
		String strActualUrl = objHomePage.getCurrentUrl();
		
		Assert.assertEquals(strActualUrl, strExpectedUrl);
	}
	
	@Test(priority = 1)
	public void TCID_102_VerifyPackageBuildTabFunctionality() throws InterruptedException{
		objPortfolioPage.setPause(10);
		objPortfolioPage.clickOnPackageBuildTab();
	}

}
