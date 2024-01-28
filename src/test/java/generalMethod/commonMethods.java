package generalMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Base.BaseSetUp;

import net.bytebuddy.asm.Advice.Argument;

public class commonMethods{
	public WebDriver driver;
//	commonMethods commonmethod;
	
  public commonMethods(WebDriver driver) {
	  this.driver=driver;
  }
	public void url(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//commonmethod.waitTillPageLoad();
	}
	
	public void waitTillPageLoad() {
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	
	public void clickMethod(By locator) {
		//WebDriverWait wait= new WebDriverWait(driver, 15);
		//boolean b=wait.until(driver.findElement(locator).isEnabled());
		System.out.println("In common method");
		driver.findElement(locator).click();
	}
	
	public void clickJSMethod(By locator) {
		WebElement element= driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click;", element);
	}
	
	public void explicitWaitTillElementClickable(By locator) {
		 WebDriverWait wait =new WebDriverWait(driver, 30);
		  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(locator)));
		
	}
	
}
