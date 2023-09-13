package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssList {

	public static void main(String[] args)
	
	
	{
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/bootstrap-alert.php");
		driver.manage().window().maximize();
		
		
		List<WebElement>alerts= driver.findElements(By.xpath("//div[@class='col-md-6']/button"));
		
		
		for(WebElement item: alerts)
		{
			
			
			System.out.println( item.getText()+ " Background color is : " +item.getCssValue("background-color"));
		}
		
		driver.quit();

	}

}
