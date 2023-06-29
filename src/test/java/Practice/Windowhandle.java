package Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandle 
{

	public static void main(String[] args) 
	{


        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        String window1=		driver.getWindowHandle();
        System.out.println("Parent Window handle : " + window1);
        
       driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']")).click();
        
        Set<String> windid=   driver.getWindowHandles();
		
        List<String> win=new ArrayList(windid);
        
        for(String strid:win)
        {
          System.out.println(strid);
          String windowname= driver.switchTo().window(strid).getTitle();
          System.out.println("Window id:"+ windowname);
        }


	}

}
