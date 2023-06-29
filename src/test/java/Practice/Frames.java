package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException 
	{


		    WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summery.html");
			
			driver.switchTo().frame(0);
			
			driver.findElement(By.xpath("//a[@href='org/openqa/selenium/package-frame.html']")).click();
			
			driver.switchTo().defaultContent();
			
			Thread.sleep(3000);
			
			driver.switchTo().frame(1);
			
			driver.findElement(By.xpath("//a[@href='Alert.html']")).click();
			
			driver.switchTo().defaultContent();
			
			Thread.sleep(3000);
			
			driver.switchTo().frame(2);
			
			driver.findElement(By.xpath("//a[@href='../../../index-all.html' and contains(text(), 'Index')]")).click();
			
		
		
	}

}
