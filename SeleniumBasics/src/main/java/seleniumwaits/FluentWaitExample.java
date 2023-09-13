package seleniumwaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample {

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://selenium.obsqurazone.com/jquery-progress-bar.php");
		driver.manage().window().maximize();
		
		Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
	
		
		WebElement strt_dwnld_btn=driver.findElement(By.xpath("//button[@id='downloadButton']"));
		strt_dwnld_btn.click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[text()='Close' and @class='ui-button ui-corner-all ui-widget']")));
		WebElement text=driver.findElement(By.xpath("//div[text()='Complete!']"));
		System.out.println(text.getText());
		
		driver.quit();
	}

}
