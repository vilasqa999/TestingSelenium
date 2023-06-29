package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextandAttribute {

	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/register");
		
        WebElement email1=	driver.findElement(By.xpath("//input[@id='Email']"));
		
        System.out.println("Email Get attribute:- "+ email1.getAttribute("id"));
		
        WebElement button=driver.findElement(By.xpath("//button[@name='register-button']"));
        
        System.out.println("Button getText(): " + button.getText());
	}

}
