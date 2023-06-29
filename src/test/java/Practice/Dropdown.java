package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException 
	{

		
		 WebDriverManager.chromedriver().setup();
			
		 ChromeDriver driver =new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
		 driver.get("https://demo.guru99.com/test/newtours/register.php");
		 
         WebElement dropdownlist=  driver.findElement(By.xpath("//select[@name='country']"));
         
         Select s1=new Select(dropdownlist);
         
         //s1.selectByVisibleText("COSTA RICA");
         
     //    s1.selectByValue("GREENLAND");
         
         //s1.selectByIndex(26);
         List<WebElement> list=s1.getOptions();
         
         for(WebElement list1:list)
         {
        	  if(list1.getText().equals("CANADA"))
        	{
        	
        		 list1.click();
        		// break;
        	 }
         }
         
         Thread.sleep(3000);
 		
		 driver.close();


	}

}
