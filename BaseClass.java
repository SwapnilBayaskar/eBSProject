package com.Base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public void initializeBrowser(String strURL) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		driver.get(strURL);
		
	}
	
	public void setPause(int intWait) throws InterruptedException{
		Thread.sleep(TimeUnit.MILLISECONDS.convert(intWait,TimeUnit.SECONDS));
	}
	
	public void tearDownMethod() {
		driver.close();
	}
	
	public String getCurrentUrl() {
		String strUrl = driver.getCurrentUrl();
		return strUrl;
	}

}
