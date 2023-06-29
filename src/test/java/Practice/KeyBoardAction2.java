package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardAction2 
{

	public static void main(String[] args)
	{


         WebDriverManager.chromedriver().setup();
		
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
		 driver.get("https://text-compare.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement text1=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		 WebElement text2=driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		 
		 
		 text1.sendKeys("Welcome Vikas");
		 
		 Actions act=new Actions(driver);
		 
		 
		 //act.sendKeys(Keys.CONTROL);
		 act.keyDown(Keys.CONTROL);
		 act.sendKeys("a");
		 act.keyUp(Keys.CONTROL);
		 act.perform();
		
		 act.keyDown(Keys.CONTROL);
		 act.sendKeys("c");
		 act.keyUp(Keys.CONTROL);
		 act.perform();
		 
		 act.keyDown(Keys.TAB);
		
		 act.keyUp(Keys.TAB);
		 act.perform();
		 
		 act.keyDown(Keys.CONTROL);
		 act.sendKeys("v");
		 act.keyUp(Keys.CONTROL);
		 act.perform();
		 
		 driver.findElement(By.xpath("//button[@id='compareButton']")).click();
		 
		 
		 WebElement msg=driver.findElement(By.xpath("//span[@class='messageForUser']"));
		 
		 System.out.println("Message is= " + msg.getText());
		 

		 
	}

}
