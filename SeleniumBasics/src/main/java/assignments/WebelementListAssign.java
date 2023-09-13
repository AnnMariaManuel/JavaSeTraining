package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementListAssign {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
		
	   List<WebElement> cb=driver.findElements(By.xpath("//div[@class='form-group']//input"));
	   for(WebElement item:cb)
	   {
		   
		  item.click();
		   
	   }
	   System.out.println("Action completed");
	   //driver.quit();

	}

}
