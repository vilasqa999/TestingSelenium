package Practice_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args)
	{


		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");	
		
		//driver.findElement(By.xpath("//input[@id='wednesday']")).click();
		
		List <WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		
		System.out.println("no of checkbox:" + checkbox.size());
		
//		for (int i=0; i<checkbox.size();i++)
//		{
//			checkbox.get(i).click();
//		}
//			
	
		
		for(WebElement c1:checkbox)
		{
			String checkname= c1.getAttribute("id");
			if(checkname.equals("saturday") || checkname.equals("monday"))
			{
			c1.click();
		}
	}

}
}
