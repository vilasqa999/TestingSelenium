package TestingSelenium.TestingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngDataProviders 
{
	
	
	@DataProvider(name="searchdatainput")
	public Object[][] searchdata()
	{
		Object data[][]=new Object[3][2];
		
		data[0][0]="Pune";
		data[0][1]="Shanivarwada";
		data[0][1]= "Latur";
		data[1][0]= "Ganjgolai";
		data[0][2]="Mumbai";
		data[2][0]= "CST";
		
		
		return data;
	}
	
    @Test (dataProvider="searchdatainput")
	public void googlesearchdata(String location, String famous)
	
	{
	 
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.google.com/");
	     
	 WebElement keyword=    driver.findElement(By.name("q"));
	 keyword.sendKeys(location + " " + famous);
	 
	 driver.findElement(By.name("btnK")).click();
	}
}
