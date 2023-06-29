package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectedDisplayed {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		WebElement element=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		
		System.out.println("Search store displayed:" +element.isDisplayed());
		System.out.println("Search store enabled: " +element.isEnabled());
		
		WebElement elementm= driver.findElement(By.id("gender-male"));
		
		System.out.println("Is male selected:" +elementm.isSelected());
		
		elementm.click();
		
		System.out.println("Is male selected:" +elementm.isSelected());
		
		
		// TODO Auto-generated method stub
		
        WebElement elementf= driver.findElement(By.id("gender-female"));
		
		System.out.println("Is female selected:" +elementf.isSelected());
		
		elementf.click();
		
		System.out.println("Is female selected:" +elementf.isSelected());
		
		
		
		Thread.sleep(3000);
		
		
		driver.close();

	}

}
