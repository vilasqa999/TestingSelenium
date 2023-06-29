package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) 
	{
		     WebDriverManager.chromedriver().setup();
			
			 ChromeDriver driver=new ChromeDriver();
			
			 driver.manage().window().maximize();
			
			 driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
			 
			 List<WebElement> rowno=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
			 
			 System.out.println("No of row :"+ rowno.size());
			 
			 List<WebElement> colno=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
			 
			 System.out.println("No of column :"+ colno.size());
			 
			 System.out.println("success..........");
			 
			 WebElement element=driver.findElement(By.xpath("//table[@id='customers']//tr[5]/td[2]"));
			 
			 System.out.println("Specific element:-" + element.getText());
			 
			 
             List<WebElement> rowno1=driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tbody//tr"));
			 
			 System.out.println("No of row of table 2 :"+ rowno.size());
			 
			 List<WebElement> colno1=driver.findElements(By.xpath("//table[@class='tsc_table_s13']//thead//tr//th"));
			 
			 System.out.println("No of column of table 2:"+ colno.size());
			 
			 System.out.println("success..........");
			 
			 WebElement element1=driver.findElement(By.xpath("//table[@class='tsc_table_s13']//tbody//tr[4]//td[2]"));
			 
			 System.out.println("Specific element:-" + element1.getText()); 
			 
			 
			 
			 
			 for(WebElement row:rowno)
			 {
				  for(WebElement col:colno)
				  {
					  String data= driver.findElement(By.xpath("//table[@class='tsc_table_s13']//tbody//tr["+row+"]//td["+col+"]")).getText();
					  System.out.println(data);
				  }
			 }
	}
	
	

}
