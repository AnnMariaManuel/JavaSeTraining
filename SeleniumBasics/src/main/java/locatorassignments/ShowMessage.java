package locatorassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShowMessage

{

	public static void main(String[] args)

	{
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement message_box= driver.findElement(By.id("single-input-field"));
		message_box.sendKeys("Hello");
		
		WebElement showmsg_btn=driver.findElement(By.id("button-one"));
		showmsg_btn.click();
	

	}

}
