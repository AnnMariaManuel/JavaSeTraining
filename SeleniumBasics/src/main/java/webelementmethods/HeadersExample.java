package webelementmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeadersExample {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		
		WebElement progress_bar_header=driver.findElement(By.xpath("//ul[@class='navbar-nav']//li[5]//a"));
		System.out.println("The text in header is :"+progress_bar_header.getText());
		
		//to get a set of weblements 
		
		List<WebElement>headers=driver.findElements(By.xpath("//ul[@class='navbar-nav']//li//a"));
		System.out.println("No of elements in list is: "+headers.size());
		
		for(int i=0;i<headers.size();i++)
		{
			System.out.println("The header text is :"+headers.get(i).getText()); //headers.get(i) will return a webelement , to get the text in that webleemnt , .gettext ()
		}
		
		for(WebElement element:headers)//for-each loop 
		{
			System.out.println(element.getText()); 
			System.out.println();
		}
		
		List<WebElement>tagnames=driver.findElements(By.tagName("a"));
		System.out.println("No of a hyperlinks in the page is :" +tagnames.size());
		for(WebElement hyperlinks:tagnames)
		{
			System.out.println("Hyperlinks are:" +hyperlinks.getAttribute("href"));
			
		}
		
		driver.quit();

	}

}
