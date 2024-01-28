package com.Pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;

import com.Utils.TopSpeed;

public class LandingPage {
	
  private WebDriver driver;
  TopSpeed topSpeedExcel = new TopSpeed();
  private By Model = By.className("ds2-label");
  private By SevenSeries = By.linkText("7");
  private By selectModel7 = By.xpath("//img[starts-with(@class,'image-default ds2-model-card--street-lazy-load ds2-model-card--street-background-img loaded')]");
  //private By selectModel7 = By.xpath("//*[@id=\'ds2-model-cars\']/div[5]/div/div[1]/a/picture[1]/img");
  private By tech = By.xpath("/html/body/div[5]/main/div[1]/div[6]/div/div[4]/div/div[3]/div[3]/a");
  private By topSpeed1 = By.xpath("/html/body/div[5]/main/div[1]/div/div[4]/div/div/div[2]/section[1]/div[3]/div/div[2]/div/table/tbody/tr[1]/td[2]/div");

  public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	  this.driver = driver;
	}

public void SevenSeries() throws InterruptedException, IOException {
	
	  driver.findElement(Model).click();
	  driver.findElement(SevenSeries).click();
	  Thread.sleep(3000);
	  driver.findElement(selectModel7).click();
	  driver.findElement(tech).click();
	  topSpeedExcel.TakeScreenShot(driver);
	  String speed = driver.findElement(topSpeed1).getText();
	  int speedLes = Integer.parseInt(speed);
	  System.out.println(speed);
	  if(speedLes< 500)
	  {	
		  topSpeedExcel.f();
		  AssertJUnit.assertFalse("Does not meet my requirements", false);
	  }
	  else 
		  AssertJUnit.assertTrue(true);
	  
  }

}
