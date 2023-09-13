package elementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementlocator2 {

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email= driver.findElement(By.name("email"));
		email.sendKeys("anntony@gmail.com");
		
		WebElement forgotpassword_link=driver.findElement(By.linkText("Forgotten password?"));//partial link text 
		//forgotpassword_link.click();
		
		WebElement fgtpwdlink=driver.findElement(By.partialLinkText("Forgotten"));
		fgtpwdlink.click();
		
		
		

	}

}
