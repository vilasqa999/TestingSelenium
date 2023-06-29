package Practice_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker {

	public static void main(String[] args)
	{

    

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		
		
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String expdate="22";
		String expmonth="June";
		String expyear="2022";
		
		while(true)
		{
			String actMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String actyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(actMonth.equals(expmonth) && actyear.equals(expyear))
			{
				List<WebElement> dates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
				for(WebElement e:dates)
				{
					String calenderdates=e.getText();
					if(calenderdates.equals(expdate))
					{
						e.click();
						break;
					}
							
				}
				break;
			}
			
			else
			{
				//click for next month
				
				//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				
				//click for previous month
				
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			}
		
		}
		
		
		
		
		

	}

}
