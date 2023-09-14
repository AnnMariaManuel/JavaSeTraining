package keyboardmouseinteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardExample {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		
		
		/*WebElement searchbar=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//searchbar.sendKeys("louis vuitton bags for women" +Keys.ENTER); //to replicate enter in keyboard 
		searchbar.sendKeys("iPhone");
		searchbar.sendKeys(Keys.BACK_SPACE);*/
		
	 WebElement msgbox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	 msgbox.sendKeys("Ann");
	 msgbox.sendKeys(Keys.BACK_SPACE);//clears only 1 letter .not full world
	 
	 msgbox.sendKeys(Keys.chord(Keys.CONTROL,"A") +Keys.BACK_SPACE);//to select whole text and then clears 
		
		

	}

}
