package launchbrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchFirefoxBrowser {

	public static void main(String[] args) 
	
	{
		
		//setting driver path ; indicated testwill be run in firefox browser and the location of exe file for firefox driver
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\geckodriver.exe");
		
		//creating object for interface webdriver ,FirefoxDriver is the implementation class(Runtime polymorphism) 
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement close_icon=driver.findElement(By.xpath("//span[@class='_30XB9F']"));
		close_icon.click();
		
		WebElement searchbar=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		searchbar.sendKeys("iPhone13");
		searchbar.submit();
		
	List<WebElement>Iphone13=driver.findElements(By.xpath("//div[@class='_3pLy-c row']"));
	System.out.println("No of iphone 13 displayed in a page is :" +Iphone13.size());
	
	driver.quit();
		
		

	}

}
