package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssExample {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://selenium.obsqurazone.com/bootstrap-alert.php");
		driver.manage().window().maximize();
		
		
		WebElement Autoclosable_success=driver.findElement(By.xpath("//button[@id='autoclosable-btn-success']\r\n"
				+ ""));
		System.out.println("Color of text in btn is:"+Autoclosable_success.getCssValue("color"));
		
		System.out.println("Background color of button is :"+Autoclosable_success.getCssValue("background-color"));
		System.out.println("Font size"+ Autoclosable_success.getCssValue("font-size"));
		System.out.println("Font style :" +Autoclosable_success.getCssValue("font-style"));
		driver.quit();
	}

}
