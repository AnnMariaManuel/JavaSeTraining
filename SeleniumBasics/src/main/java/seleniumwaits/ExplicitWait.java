package seleniumwaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().window().maximize();
		
		//declaring obj of WebDriverWait class
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		WebElement start_btn=driver.findElement(By.xpath("//div[@id='start']//button"));
		wait.until(ExpectedConditions.elementToBeClickable(start_btn));
		start_btn.click();
		
		//here as the webelement itself was not loaded , we declare a wait until that webelemnt is visible 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Hello World!')]")));
		WebElement text=driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]"));
		System.out.println(text.getText());
		
		driver.quit();

	}

}
