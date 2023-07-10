package Practice4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selection {

	public static void main(String[] args)
	{
		
		
		  WebDriverManager.chromedriver().setup();
	       
	       WebDriver driver=new ChromeDriver();
	       
	      driver.manage().window().maximize();
	      
	      driver.get("https://demo.nopcommerce.com/register");

	      
	      WebElement textbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	      
	      
	      System.out.println("textbox is :" + textbox.isDisplayed());
	      System.out.println("Textbox enable ahe ak" + textbox.isEnabled());
	      
	      WebElement maleradio=driver.findElement(By.xpath("//input[@id='gender-male']"));
	      System.out.println("Male radio  before:" + maleradio.isSelected());
	      
	      maleradio.click();
	      
	      System.out.println("Male radio  after:" + maleradio.isSelected());
	      
	      System.out.println("get text: " + maleradio.getText());
	      
	      System.out.println("Attribute value: "+ maleradio.getAttribute("name"));
	      
	      WebElement maleradiotext=driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
	      System.out.println("get male text: " + maleradiotext.getText());
	      
	}

}
