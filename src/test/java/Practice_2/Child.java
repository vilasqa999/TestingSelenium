package Practice_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		String name=driver.findElement(By.xpath("//a[contains(text(), 'Arvind Ltd.')]//self::a")).getText();
		System.out.println("print name:"+ name);
		
		int no=driver.findElements(By.xpath("//a[contains(text(), 'Arvind Ltd.')]//ancestor::tr/child::td")).size();
		
				System.out.println("no:"+ no);
		// TODO Auto-generated method stub
				
				

			int no1=driver.findElements(By.xpath("//a[contains(text(),'Birlasoft')]//ancestor::tr/preceding-sibling::tr")).size();
				
			System.out.println("no of preceding sibling:"+ no1);	
						
	      	int no2=driver.findElements(By.xpath("//a[contains(text(),'Birlasoft')]//ancestor::tr/following-sibling::tr")).size();
						
			System.out.println("no of follwing sibling:"+ no2	);		


	}

}
