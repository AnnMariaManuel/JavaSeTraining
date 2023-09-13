package seleniumwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicExample {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().window().maximize();
		
		WebElement start_btn=driver.findElement(By.xpath("//div[@id='start']//button"));
		start_btn.click();
		//System.out.println("button found ");
		
		
		Thread.sleep(8000);
		WebElement text=driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]"));
		System.out.println(text.getText());
		
		driver.quit();

	}

}
