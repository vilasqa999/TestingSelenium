package Practice_2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestiondropdown {

	public static void main(String[] args) 
	{
		
		   WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com/");
			
			driver.findElement(By.name("q")).sendKeys("java");
			
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			
			List<WebElement> list1=driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]"));
			
			System.out.println("No of items:"+ list1.size());
			
			System.out.println("No of items123:"+list1);
			for(WebElement list2:list1)
			{
				
				if(list2.getText().contains("beginners"))
				{
					System.out.println("No of items:");
					list2.click();
					break;
				}
			}
		// TODO Auto-generated method stub

	}

}
