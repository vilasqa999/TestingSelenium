package Practice;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Newtab {

	public static void main(String[] args) throws InterruptedException
	{


		
		WebDriverManager.chromedriver().setup();
		
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
		 driver.get("https://visualstories.com/info/pricing");
		 driver.switchTo().newWindow(WindowType.WINDOW);
		 
		 driver.get("https://jqueryui.com/tooltip/");
		 
		 
		 System.out.println("success..........");
		 Thread.sleep(3000);
		// driver.close();
		 driver.quit();
		 
	}

}
