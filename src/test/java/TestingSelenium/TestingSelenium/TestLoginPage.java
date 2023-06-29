package TestingSelenium.TestingSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLoginPage {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		
	//	LoginPage lp=new LoginPage(driver);
		
		LOginWithPageFactory lp=new LOginWithPageFactory(driver);
		
		driver.manage().window().maximize();
		
		driver.get("https://visualstories.com/login");
		
		
		
		lp.enterusername("testingvsbuilder@gmail.com");
		lp.enterPassword("testing123");
		lp.clickLogin();
	}

}
