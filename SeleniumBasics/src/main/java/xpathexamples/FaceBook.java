package xpathexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//text()=''
		WebElement tag_line=driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		System.out.println(tag_line.getText());
		driver.quit();

		
	}

}
