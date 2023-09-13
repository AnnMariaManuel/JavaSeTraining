package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();
		
		
		WebElement colordd=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		
		Select s1=new Select(colordd);
		s1.selectByValue("Yellow");
		Thread.sleep(5000);
		
		driver.quit();

	}

}
