package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider1
{

	@DataProvider (name= "searchinputdata")
	
	public Object[][] searchdata()
	{
		
		Object[][] inputdata=new Object[3][2];
		inputdata[0][0]="up";
		inputdata[0][1]="varanasi";
		
		
		inputdata[1][0]="mp";
		inputdata[1][1]="mahakal";
		
		inputdata[2][0]="Parali";
		inputdata[2][1]="vaijenath";
		
		return inputdata;
		
	}
	
	@Test(dataProvider="searchinputdata")
	public void search(String city, String temple) throws InterruptedException
	    {
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement input=driver.findElement(By.name("q"));
		
		input.sendKeys(city + temple);
		
		driver.findElement(By.name("btnK")).submit();
		
		Thread.sleep(3000);
		
		driver.close();
	}
	
}
