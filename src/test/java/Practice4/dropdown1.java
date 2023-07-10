package Practice4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown1 {

	public static void main(String[] args) 
	{


	       WebDriverManager.chromedriver().setup();
	       
	       WebDriver driver=new ChromeDriver();
	       
	      driver.manage().window().maximize();
	      
	     // driver.get("https://demo.guru99.com/test/newtours/register.php");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.get("https://www.google.com/");
	      
	    //  WebElement element=driver.findElement(By.xpath("//select[@name='country']"));
	      
	   //   Select s1=new Select(element);
	     // s1.selectByVisibleText("BELGIUM");
	      //s1.selectByValue("BHUTAN");
	    //  s1.selectByIndex(5);
	      
	    //  if(s1.isMultiple()==true)
	      {
	    	   System.out.println("multple selection possible");
	    	   
	      }
	   //   else
	      {
	    	   System.out.println("multple selection not possible");
	    	   
	      }
	      
	      
	    // List <WebElement> auto= driver.findElements(By.xpath("//li[@class='sbct']//div[@class='eIPGRd']//div[@role='option']//div[1]//span"));
//	      
//	      List<WebElement> list=s1.getOptions();
//	      
//          for(WebElement l1:list)
//          { 
//    	  System.out.println("list of options: "+  l1.getText());
//	    	  	    	  String countrylist=l1.getText();
//	    	  if(countrylist.equals("INDIA"))
//   		  	    	  {	    		  l1.click();
//	    	  }
//	      }
          
          
          
                  driver.findElement(By.name("q")).sendKeys("seleniumm");
        		  
        		  List <WebElement> auto= driver.findElements(By.xpath("//li[@class='sbct']//div[@class='eIPGRd']//div[@role='option']//div[1]//span"));
 	      
	      
 	   // List<WebElement> list=s1.getOptions();
	      
        for(WebElement l2:auto)
        { 
  	  System.out.println("list of options: "+  l2.getText());
	    	  	    	  String countrylist=l2.getText();
	    	  if(countrylist.equals("selenium"))
 		  	    	  {	    		  l2.click();
	    	  }
	      }
 	     
	}

}
