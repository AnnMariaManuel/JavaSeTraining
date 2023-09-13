package xpathexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		WebElement searchbar=driver.findElement(By.xpath("//div[@class='a4bIc' and @jsname='gLFyf']//following::textarea[@jsname='yZiJbe']"));
		searchbar.sendKeys("ITC");
		searchbar.submit();
		
		driver.navigate().back();
		searchbar.sendKeys("ITC");
		searchbar.clear();
		
		
		
		
		

	}

}
