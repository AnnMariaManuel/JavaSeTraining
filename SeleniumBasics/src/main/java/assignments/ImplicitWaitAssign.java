package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitAssign {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/jquery-progress-bar.php");
		driver.manage().window().maximize();
		
		
		WebElement dwnld_btn=driver.findElement(By.xpath("//button[@id='downloadButton']"));
		dwnld_btn.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		WebElement text=driver.findElement(By.xpath("//div[contains(text(),'Complete!')]"));
		System.out.println("The text is : "+text.getText());
		
		driver.quit();
		

	}

}
