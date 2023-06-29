package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker1 {

	public static void main(String[] args) 
	{


		 WebDriverManager.chromedriver().setup();
			
		 ChromeDriver driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		 
		 driver.findElement(By.xpath("//input[@id='dob']")).click();
		 
		 WebElement months= driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		 
	     Select s1=new Select(months);
	    
	     s1.selectByVisibleText("May");
	    
         WebElement year= driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		 
	     Select s2=new Select(year);
	    
	     s2.selectByVisibleText("1993");
	     
	     
	     List<WebElement> days=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
	    
	     String date="27";
	     
	     for(WebElement day:days)
	     {
	    	 String actualday=day.getText();
	    	 if(actualday.equals(date))
	    	 {
	    		 day.click();
	    		 break;
	    	 }
	     }
	    
	     
	     
	     System.out.println("program succss.........");
	}

}
