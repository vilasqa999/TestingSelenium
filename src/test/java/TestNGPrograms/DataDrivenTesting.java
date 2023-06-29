package TestNGPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTesting {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		// TODO Auto-generated method stub

		XSSFWorkbook ExcelBook;
		XSSFSheet excelsheet;
		XSSFRow Row;
		XSSFCell Cell;
		
		
		File f1=new File("C:\\Users\\vilas\\OneDrive\\Desktop\\Test.xlsx");
		
		FileInputStream fis=new FileInputStream(f1);
		
		ExcelBook=new XSSFWorkbook(fis);
		
		excelsheet=ExcelBook.getSheetAt(0);
		
		int totalrow=excelsheet.getLastRowNum()+1;
		
		int totalcell= excelsheet.getRow(0).getLastCellNum();
		
		for(int currentrow=1; currentrow<totalrow;currentrow++)
		{
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://visualstories.com/login");
			
			driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys(excelsheet.getRow(currentrow).getCell(0).toString());
			
			driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys(excelsheet.getRow(currentrow).getCell(1).toString());
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			Thread.sleep(3000);
			driver.close();
			
			//for(int currentcell=0; currentcell<totalcell; currentcell++)
		//	{
				
		//	}
		}
	}

}
