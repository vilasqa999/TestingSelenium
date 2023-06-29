package Practice_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker2 {

	public static void main(String[] args)
	{


		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		
		driver.findElement(By.id("dob")).click();
		
		WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		
		Select s1=new Select(month);
		s1.selectByVisibleText("Mar");
		
		Select year1=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
       
		year1.selectByVisibleText("1990");
		
		
		
		List<WebElement> days= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		
		for(WebElement e:days)
		{
			
			System.out.println("data printed");
			String actdays=e.getText();
			if(actdays.equals("15"))
			{
			e.click();
				
			}
		}

	}

}
