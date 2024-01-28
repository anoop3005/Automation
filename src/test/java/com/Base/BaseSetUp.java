package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseSetUp {
public WebDriver driver;
	
	@Parameters({"browserType", "platform"})
	@BeforeTest
	public void setUp(String browserType, String paltform) {
		System.out.println("Hi In base");
		switch(browserType.toLowerCase()) {
		case "chrome": openChrome();
					break;
		
		case "firefox": opnFirefox();
						break;
		
		default:
			System.out.println("opening chrome as default browser");
			openChrome();
			break;
		}
		if(paltform.equalsIgnoreCase("local")) {
			System.out.println("Platform is loca");
		}
		
	}

	private void opnFirefox() {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		//System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		driver = new FirefoxDriver();
		//driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	private void openChrome() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	public WebDriver getDriver() {
		return driver;
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
