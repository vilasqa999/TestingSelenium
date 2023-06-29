package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorMethods 
{

	public static void main(String[] args) throws InterruptedException 
	{


		  WebDriverManager.chromedriver().setup();
		
		  ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		
		  driver.get("https://visualstories.com/info/pricing");
		 
		  //get title of page
		// JavascriptExecutor js= (JavascriptExecutor) driver;
		 // Object title1=js.executeScript("return document.title;"); //.toString();
		 //System.out.println("title is:" + title1);
 
		  
		  // click on element 
		// // JavascriptExecutor js= (JavascriptExecutor) driver;
		//  WebElement button=driver.findElement(By.xpath("//a[@href='https://visualstories.com/siteconfig' and @role='button']"));
		//  js.executeScript("arguments[0].click();",button);
		  
		  //refresh webpage
		  // JavascriptExecutor js= (JavascriptExecutor) driver;
		  /// js.executeScript("history.go(0)");
		  
		  
		 //scrolldown the page
		  JavascriptExecutor js= (JavascriptExecutor) driver;
		
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		  
		  //scrollup webpage
	     
		  Thread.sleep(3000);
		  
		  JavascriptExecutor js1= (JavascriptExecutor) driver;
		  Thread.sleep(3000);
		  js1.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
	
	}

}
