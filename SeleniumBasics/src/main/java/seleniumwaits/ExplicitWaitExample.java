package seleniumwaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) 
	
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://selenium.obsqurazone.com/jquery-progress-bar.php");
		driver.manage().window().maximize();
		
		WebElement strt_dwnld_btn=driver.findElement(By.xpath("//button[@id='downloadButton']"));
		strt_dwnld_btn.click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[contains(text(),'Cancel Download')]")));
		
		WebElement close_button=driver.findElement(By.xpath("//button[text()='Close' and @class='ui-button ui-corner-all ui-widget']"));
		if(close_button.isDisplayed())
		{
			System.out.println(driver.findElement(By.xpath("//div[text()='Complete!']")).getText());
		}
		
		else 
		{
			System.out.println("Operation failed ");
		}
		driver.quit();
		

	}

}
