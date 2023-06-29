package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropdown {

	public static void main(String[] args)
	{
		
		 WebDriverManager.chromedriver().setup();
			
		 ChromeDriver driver =new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.hdfcbank.com/");
		 
		 driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		 
		List<WebElement> list1= driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
	
	
        		System.out.println("List of element:" + list1.size());
        		
        		for(WebElement list2:list1)
        		{
        			if(list2.getText().equals("Accounts"))
        			{
        				list2.click();
        				break;
        			}
        		}
	}

}
