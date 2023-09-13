package elementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExamples 

{

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//WebElement searchbar =driver.findElement(By.id("twotabsearchtextbox"));
		//WebElement All_dropdown=driver.findElement(By.name("url"));
		//WebElement All=driver.findElement(By.tagName("select"));
		//All.click();
		//searchbar.sendKeys("iPhone");//to sent text data to webelement 
		//searchbar.clear();//to clear text
		
		//All_dropdown.click();//to perform click operation 
		
		/*WebElement searchbar2=driver.findElement(By.cssSelector("#twotabsearchtextbox"));//to locate via css selector, prefix is # 
		searchbar2.sendKeys("pendrive");*/
		
		WebElement searchicon=driver.findElement(By.cssSelector(".nav-input.nav-progressive-attribute"));//to locate via class:prefix is . , remove spaces in classname with .
		searchicon.sendKeys("iPhone13");
		
		
		
		

	}

}
