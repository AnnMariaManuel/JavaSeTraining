package xpathexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathMethodAssignment {

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.manage().window().maximize();
		
		/*WebElement label_m= driver.findElement(By.xpath("//label[text()='Male']"));
		label_m.click();*/
		WebElement label_f=driver.findElement(By.xpath("//label[contains(@for,'Radio21')]"));
		label_f.click();
		WebElement get_result=driver.findElement(By.xpath("//button[contains(@id,'button-two')]"));
		get_result.click();
		
		
	}

}
