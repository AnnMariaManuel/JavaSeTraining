package keyboardmouseinteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseBasics {

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://selenium.obsqurazone.com/window-popup.php");
		driver.manage().window().maximize();
		
		WebElement LikeBtn=driver.findElement(By.xpath("//a[contains(text(),'  Like us On Facebook ')]"));
		Actions a=new Actions(driver); 
		a.moveToElement(LikeBtn).build().perform();
		a.moveToElement(LikeBtn, 0, 0).build().perform(); //method overloading example 
		
		/*int x=LikeBtn.getLocation().getX();
		int y=LikeBtn.getLocation().getY();
		
		a.moveByOffset(x, y).build().perform();*/

	}

}
