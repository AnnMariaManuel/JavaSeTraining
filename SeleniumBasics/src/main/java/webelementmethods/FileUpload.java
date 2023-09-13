package webelementmethods;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		WebElement choose_file=driver.findElement(By.xpath("//input[@id='file-upload' and @type='file']"));
		choose_file.sendKeys("C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\SampleFileUpload.pptx"); //provide filepath with extension

		WebElement upload=driver.findElement(By.xpath("//input[@id='file-submit']"));
		upload.click();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		choose_file=driver.findElement(By.xpath("//input[@id='file-upload' and @type='file']"));
		File f=new File("C:\\\\Users\\\\Tony joseph\\\\OneDrive\\\\Desktop\\\\Selenium files\\SampleText.txt");
		choose_file.sendKeys(f.getAbsolutePath());
	}

}
