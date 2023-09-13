package xpathexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicXpath 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		/*WebElement email_id=driver.findElement(By.xpath("//input[@id='email']"));
		email_id.sendKeys("annmariakunnamkott@gmail.com");
		
		WebElement pwd=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pwd.sendKeys("abcd");
		
		
		WebElement Login_btn=driver.findElement(By.xpath("//button[text()='Log in']"));
		Login_btn.click();
		
		/*WebElement fgt_pwd_link=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		fgt_pwd_link.click();*/
		
		/*WebElement try_another_way= driver.findElement(By.xpath("//a[text()='Try another way']"));
		try_another_way.click();*/
		
		
		/*driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchbar=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbar.sendKeys("iPhone");
		
		WebElement searchicon=driver.findElement(By.xpath("//span[@id='nav-search-submit-text']//input[@class='nav-input nav-progressive-attribute']"));
		searchicon.click();*/
		
		
		//facebook 
		
		WebElement fgt_pwd_link=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		fgt_pwd_link.click();
		
		WebElement try_another_way=driver.findElement(By.xpath("//a[text()='Try another way']"));
		try_another_way.click();
		
		
		
		
		

	}

}
