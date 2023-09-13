package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitAssign {

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/dynamic-load.php");
		driver.manage().window().maximize();
		
		WebElement Get_new_user_btn=driver.findElement(By.xpath("//button[@id='save']"));
		Get_new_user_btn.click();
		
		
		//Explicit wait 
		
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(20));
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='card text-center']/img")));
		
		System.out.println("Name is :" +driver.findElement(By.xpath("//div[@class='card-body']/h5")).getText());
		System.out.println("Email is " +driver.findElement(By.xpath("//div[@class='card-body']//p")).getText());
		
		driver.quit();

	}

}
