package Practice_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropdown 
{

	public static void main(String[] args)
	{


       WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hdfcbank.com/");	
		
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		
		List<WebElement> list1=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		
		System.out.println("No of elements:"+ list1.size());
		
		for(WebElement list2:list1) 
		{
			
			if(list2.getText().equals("Cards"))
			{
				list2.click();
			}
		}
		
		
		driver.findElement(By.xpath("//div[@class='drp2']//div[contains(@class,'dropdown')]")).click();
		
		List<WebElement> list3 =driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
		
		System.out.println("No of elements:"+ list3.size());
		
		for(WebElement list4:list3) 
		{
			
			if(list4.getText().equals("FASTag"))
			{
				list4.click();
			}
		}

	}

}
