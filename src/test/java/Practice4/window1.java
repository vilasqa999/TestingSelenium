package Practice4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class window1 
{

	public static void main(String[] args)
	{


		  WebDriverManager.chromedriver().setup();
	       
	       WebDriver driver=new ChromeDriver();
	       
	      driver.manage().window().maximize();
	      
	      driver.get("https://testautomationpractice.blogspot.com/");
	      
	   String id11=   driver.getWindowHandle();
	 //  System.out.println("single window id: " + id11);
	      
	   //   driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	      
	      Set<String> allwinid=driver.getWindowHandles();
	      
	      List<WebElement> list1=new ArrayList(allwinid);
	//      
	  //.out.println("first window id " +  list1.get(0));
	  // System.out.println("fourth window id " +  list1.get(1));
	   
	   
	   
	//   driver.get("https://testautomationpractice.blogspot.com/");
	   
	   WebElement minvalue=driver.findElement(By.xpath("//div[@id='slider']"));
	   
	   System.out.println("Location is : " + minvalue.getLocation());
	   
	   
	   Actions act=new Actions(driver);
	   
	   act.dragAndDropBy(minvalue, 920, 0).perform();
	   
	   System.out.println("After Location is : " + minvalue.getLocation());
	   
	}

}
