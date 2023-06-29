package Practice_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
        WebDriverManager.chromedriver().setup();
		
		 WebDriver driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
		
		 driver.get("https://demo.guru99.com/test/newtours/register.php");	
		 
		 WebElement list=driver.findElement(By.xpath("//select[@name='country']"));
		 
		 System.out.println("No of element"+ list.getSize());
		 System.out.println(list);
		 
		 Select s1=new Select(list);
		 
//	//	 s1.selectByVisibleText("JORDAN");
//		// s1.selectByValue("LEBANON");
//		// s1.deselectByVisibleText("JORDAN");
// 
		 
		 List<WebElement> opt=s1.getOptions();
		 
		System.out.println("List of country:" + opt);
		
		for(WebElement e1:opt) 
		{
			if(e1.getText().equals("PANAMA"))
			{
				e1.click();
			}
			
		}
		 
	}

}
