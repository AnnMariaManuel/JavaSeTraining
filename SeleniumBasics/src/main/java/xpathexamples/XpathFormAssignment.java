package xpathexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFormAssignment {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		driver.manage().window().maximize();
		
		WebElement Firstname= driver.findElement(By.xpath("//input[@id=\"validationCustom01\"]"));
		Firstname.sendKeys("Ann");
		
		WebElement Lastname=driver.findElement(By.xpath("//input[@id=\"validationCustom02\"]"));
		Lastname.sendKeys("Tony");
		
		WebElement username=driver.findElement(By.xpath("//div[@class='input-group']//input[@placeholder='Username']"));
		username.sendKeys("Antony");
		
		WebElement City=driver.findElement(By.xpath("//div[@class='form-row']//div[@class='col-md-6 mb-3']//input[@id='validationCustom03']"));
		City.sendKeys("Kottayam");
		
		WebElement State=driver.findElement(By.xpath("//input[@id='validationCustom04']"));
		State.sendKeys("Kerala");
		
		WebElement zip=driver.findElement(By.xpath("//input[@id='validationCustom05']"));
		zip.sendKeys("686635");
		
		WebElement checkbox=driver.findElement(By.xpath("//div[@class='form-check']//input[@id='invalidCheck']"));
		checkbox.click();
		
		WebElement submitbtn=driver.findElement(By.xpath("//button[text()='Submit form']"));
		submitbtn.click();
		
		System.out.println("Form submitted successfully");
		
		
		
		
		
		
		
		
		
		
		

	}

}
