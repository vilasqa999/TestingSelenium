package TestingSelenium.TestingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrameDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summery.html");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		
		//String nseindex=driver.findElement(By.id("nseindex")).getText();
		
	//	System.out.println(nseindex);
		
		
		
		
		driver.switchTo().defaultContent();
		

		driver.switchTo().frame(1);
		

		driver.findElement(By.linkText("Alert")).click();
		

		
		driver.switchTo().defaultContent();
		
		int total=driver.findElements(By.tagName("iframe")).size();
		
		System.out.println("total frames-"+ total);
		
		System.out.println("====================success========================");
		
		Thread.sleep(4000);
		
		driver.close();
	}

}
