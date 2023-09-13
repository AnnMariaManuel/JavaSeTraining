package launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationExample {

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.navigate().to("https://www.facebook.com/"); //it wont wait until page loads 
		driver.navigate().to("https://www.youtube.com/");
		driver.navigate().back(); 
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
	}

}
