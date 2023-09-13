package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesExample {

	public static void main(String[] args) 
	
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("iPhone");
	     System.out.println("Tagname is: " +searchbox.getTagName()); //to get tagname 

	     //to get value of an attribute 
	     
	     System.out.println(searchbox.getAttribute("id"));
	     System.out.println(searchbox.getAttribute("class"));
	     System.out.println(searchbox.getAttribute("dir"));
	     System.out.println(searchbox.getAttribute("value"));
	     driver.quit();

	}

}
