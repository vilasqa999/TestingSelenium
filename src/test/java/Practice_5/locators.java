package Practice_5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators
{

	public static void main(String[] args)
	{


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		
		List<WebElement> element=driver.findElements(By.xpath("//*"));
		
		int total=element.size();
		System.out.println("total element " + element);

	}

}
