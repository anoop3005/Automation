package com.Pages;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Utils.TopSpeed;

import generalMethod.commonMethods;

public class GoogleSearch {
  
	 public WebDriver driver;
	 commonMethods commonmethod; 
	  public By search = By.xpath("//*[@id='APjFqb']");
	  public By firstSearchOption = By.xpath("//*[@id='ERWdKc']/div[1]/span/b");
	  public By  firstSearchOption1= By.xpath("//*[@id='ERWdKc']/div[1]/span/b");
	  
	  public GoogleSearch(WebDriver driver) {
			// TODO Auto-generated constructor stub
		  this.driver = driver;
		  commonmethod=new  commonMethods(driver); 
		}
	  
	  public void searchSomething() throws InterruptedException {
		  System.out.println("In search");
		  driver.findElement(search).sendKeys("Some");
		  Thread.sleep(800);
		  Assert.assertTrue(false); 
		  //commonmethod.clickMethod(firstSearchOption);
		  commonmethod.explicitWaitTillElementClickable(firstSearchOption);
		  commonmethod.clickJSMethod(firstSearchOption1);
		  //driver.findElement(firstSearchOption).click();
		 
	  }
	
}
