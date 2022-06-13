package com.PageFactory;

import org.openqa.selenium.By;

import com.Base.BaseClass;

public class HomePage extends BaseClass{
	
	By txtPortfolioProducts = By.xpath("//div[text()='Portfolio Products']");
	By icnDashboardReports = By.xpath("//a[@id='executivedashBoard']");
	By tabWorkQueue = By.xpath("(//a[@href='#workQueueTab'])[1]");
	By tabWatchList = By.xpath("(//a[@href='#watchListTab'])[1]");
	By btnNextModulesArrow = By.xpath("(//span[@class='glyphicon glyphicon-chevron-right icons-rightarrow'])[1]");
	
	
	public void clickOnPortfolioProducts() {
		driver.findElement(txtPortfolioProducts).click();
	}
	
	public String getCurrentUrl() {
		String strUrl = driver.getCurrentUrl();
		return strUrl;
	}
	
	public void clickOnDashboardReports() {
		driver.findElement(icnDashboardReports).click();
	}
	
	public void clickOnNextModulesArrow() {
		driver.findElement(btnNextModulesArrow).click();
	}

}
