package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		
		WebElement msgbox=driver.findElement(By.id("single-input-field"));
		msgbox.sendKeys("Hi This is Ann Tony !!");
		
		WebElement shwmsgbtn=driver.findElement(By.id("button-one"));
		shwmsgbtn.click();
		
		WebElement msg=driver.findElement(By.id("message-one"));
		System.out.println("The message is :"+msg.getText());
		
		driver.quit();
		
	}

}
