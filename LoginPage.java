package com.PageFactory;

import org.openqa.selenium.By;

import com.Base.BaseClass;

public class LoginPage extends BaseClass{
	
	By txtEBSLogo = By.xpath("//div[@class='text-center client-logo']/a/img");
	By inpUsername = By.xpath("//input[@id='UserName']");
	By inpPassword = By.xpath("//input[@id='Password']");
	By btnGetStarted = By.xpath("//button[@class='btn btn-lg btn-primary btn-block btn-signin']");
	By drpStartIN = By.xpath("//select[@id='StartIN']");
	
	
	public void setUsername(String strUsername) {
		driver.findElement(inpUsername).sendKeys(strUsername);
	}
	
	public void setPassword(String strPassword) {
		driver.findElement(inpPassword).sendKeys(strPassword);
	}
	
	public void clickOnGetStarted() {
		driver.findElement(btnGetStarted).click();
	}

}
