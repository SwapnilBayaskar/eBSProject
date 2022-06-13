package com.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.Base.BaseClass;
import com.PageFactory.HomePage;
import com.PageFactory.LoginPage;

public class LoginTest extends BaseClass{
	
	private LoginPage objLoginPage;
	private HomePage objHomePage;
	
	public void initializeWebPage() {
		objLoginPage = new LoginPage();
		objHomePage = new HomePage();
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
	
	@Test
	public void TCID_101_VerifyLoginWithValidCredentials() throws InterruptedException {
		objLoginPage.setUsername("v-khushbut");
		objLoginPage.setPassword("Summer@2018#");
		objLoginPage.clickOnGetStarted();
		
		objLoginPage.setPause(10);
		
		String strExpectedUrl = "https://ebs4-qa2.simplifyhealthcare.com/DashBoard/Index";
		String strActualUrl = objLoginPage.getCurrentUrl();
		
		Assert.assertEquals(strActualUrl,strExpectedUrl);
	}
	
//	@Test
//	public void TCID_101_VerifyPortfolioPageIsDisplayed() {
//		objLoginPage.setUsername("v-khushbut");
//		objLoginPage.setPassword("Summer@2018#");
//		objLoginPage.clickOnGetStarted();
//		
//		objLoginPage.setPause(10);
//		//Thread.sleep(15000);
//		objHomePage.clickOnPortfolioProducts();
//		
//		String strExpectedUrl = "https://ebs4-qa2.simplifyhealthcare.com/ConsumerAccount/PortfolioSearch";
//		String strActualUrl = objHomePage.getCurrentUrl();
//		
//		Assert.assertEquals(strActualUrl, strExpectedUrl);
//	}

}
