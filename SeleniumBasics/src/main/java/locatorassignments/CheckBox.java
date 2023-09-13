package locatorassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox 

{

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		
		WebElement cb=driver.findElement(By.id("gridCheck"));
		cb.click();
		
		WebElement cb1= driver.findElement(By.id("check-box-one"));
		cb1.click();
		
		WebElement	cb2=driver.findElement(By.id("check-box-two"));
		cb2.click();
		
		WebElement cb3=driver.findElement(By.id("check-box-three"));
		cb3.click();
		
		WebElement cb4=driver.findElement(By.id("check-box-four"));
		cb4.click();
		
		
		

	}

}
