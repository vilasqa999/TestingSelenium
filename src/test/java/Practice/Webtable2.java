package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable2 {

	public static void main(String[] args)
	{
		
		
		     WebDriverManager.chromedriver().setup();
			
			 ChromeDriver driver=new ChromeDriver();
			
			 driver.manage().window().maximize();
			 
			 driver.get("file:///C:/Users/vilas/OneDrive/Desktop/webtable.html");
			 
			 WebElement data=driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
			 
			 System.out.println("Data is:" +data.getText());
			 
			 List<WebElement> row=driver.findElements(By.xpath("//table/tbody/tr"));
			 
			 System.out.println("no of row:" +row.size());
			
              List<WebElement> col=driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
			 
			 System.out.println("no of cols:" +col.size());

	}

}
