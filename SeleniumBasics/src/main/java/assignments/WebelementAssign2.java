package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementAssign2 {

	public static void main(String[] args)
	
	
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		driver.manage().window().maximize();
		
		WebElement dd=driver.findElement(By.xpath("//span[contains(text(),'Alaska')]"));
		dd.click();
		List<WebElement>dropdown=driver.findElements(By.xpath("//span[@class='select2-results']//li"));
		System.out.println("No of states is : " +dropdown.size());
		
		System.out.println("Names of States is :");
		System.out.println("---------------------------");
		int i=1;
		for(WebElement item:dropdown)
		{
			
			System.out.println(i + ". " +item.getText());
			i++;
		}
		
	driver.quit();

	}

}
