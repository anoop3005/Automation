package com.Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class TopSpeed {
 
  public void f() throws IOException {
	  
	  try {
		OutputStream fileOut = new FileOutputStream("./TopSpped/SevenSeries.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet1 = workbook.createSheet("sheet");
		sheet1.createRow(0).createCell(0).setCellValue("Does not meet my requirements");
		workbook.write(fileOut);
		workbook.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
  }
  
  public  void TakeScreenShot(WebDriver driver) {
	  try {
		  TakesScreenshot screenShot = (TakesScreenshot)driver;
		  File src = screenShot.getScreenshotAs(OutputType.FILE);
		  File destination = new File("./screenShots/sevenSeries.png");
		  FileUtils.copyFile(src,destination);
		  
	} catch (WebDriverException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  
  
}
