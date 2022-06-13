package com.PageFactory;

import org.openqa.selenium.By;

import com.Base.BaseClass;

public class PortfolioPage extends BaseClass {
	
	By tabPackageBuild = By.xpath("//a[text()='Package Build']");
	By tabProductBuild = By.xpath("//li[@class='active ui-state-default ui-corner-top ui-tabs-active ui-state-active']");
	By drpSwitchView = By.xpath("(//select[@id='drpViewModeLoad'])[1]");
	By btnProductSearch = By.xpath("//button[@id='switchToadvanceSearch']");
	By btnAddPortfolio = By.xpath("//button[@class='btn-fill-blue pull-right ml10 btn-add-portfolio']");
	By btnPortfolioUpArrow = By.xpath("(//div[@class='fa fa-long-arrow-up'])[3]");
	By btnPortfolioDownArrow = By.xpath("(//div[@class='fa fa-long-arrow-down'])[3]");
	By btnReloadGrid = By.xpath("//span[@id='refresh_pdg']");
	
	public void clickOnPackageBuildTab() {
		driver.findElement(tabPackageBuild).click();
	}

}
