package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		WebElement JSAlert=driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		WebElement JSConfirm=driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		WebElement JSPrompt=driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		
		JSAlert.click();
		driver.switchTo().alert().accept();
		
		JSConfirm.click();
		System.out.println(driver.switchTo().alert().getText());//prints the alert message
		driver.switchTo().alert().dismiss();
		
	
		
		JSPrompt.click();
		driver.switchTo().alert().sendKeys("Ann");
		driver.switchTo().alert().accept();
		
		
		//driver.quit();


	}

}
