package com.Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Base.BaseSetUp;
import com.Pages.LandingPage;
import com.Utils.RetryAnalyzer;
import com.Utils.TopSpeed;

import generalMethod.commonMethods;

import com.Pages.GoogleSearch;

public class LandingPageTest extends BaseSetUp {
	public WebDriver driver;
	LandingPage landingPage;
	TopSpeed topspeed;
	GoogleSearch googlesearh;
	commonMethods commonMethod;
	
	
  @BeforeTest
  public void GetDriver() {
	  System.out.println("In test before test get driver");
	  driver = getDriver();
	  landingPage = new LandingPage(driver);
	  googlesearh= new GoogleSearch(driver);
	  commonMethod= new commonMethods(driver);
  }
  
//  @Test(enabled = true)
//  public void GetSevenSeries() throws InterruptedException, IOException {
//	  landingPage.SevenSeries();  
//	  //AssertJUnit.assertTrue(true);
//  }
  
 // @Test(retryAnalyzer = RetryAnalyzer.class)
  @Test(retryAnalyzer = RetryAnalyzer.class)
  public void GoogleTest() throws InterruptedException, IOException {
	  commonMethod.url("https://www.google.com/");
	  googlesearh.searchSomething();
	  tearDown();
	  //AssertJUnit.assertTrue(true);
  }

  
}

