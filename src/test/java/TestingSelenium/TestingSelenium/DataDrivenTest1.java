package TestingSelenium.TestingSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTest1 {

	public static void main(String[] args) throws IOException
	{
		
		XSSFWorkbook workbook=null;
		XSSFSheet sheet;
		XSSFRow row;
		XSSFCell cell;
		
		File file1=new File("C:\\Users\\vilas\\OneDrive\\Desktop\\Test.xlsx");
		
        
		FileInputStream fis=new FileInputStream(file1);
		
		workbook=new XSSFWorkbook(fis);
		
		
		sheet=workbook.getSheetAt(0);
		
		int totalrow=sheet.getLastRowNum()+1;
		int totalcell=sheet.getRow(0).getLastCellNum()+1;
		
		for(int currentrow=1; currentrow<totalrow; currentrow++)
		{
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.saucedemo.com/");
			
			driver.findElement(By.id("user-name")).sendKeys(sheet.getRow(currentrow).getCell(0).toString());
			
			driver.findElement(By.id("password")).sendKeys(sheet.getRow(currentrow).getCell(1).toString());
			
			driver.findElement(By.id("login-button")).click();
			
		}
		
		
	}
	

}
