package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod2 {

	public static void main(String[] args)

	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.manage().window().maximize();

		WebElement mrbtn = driver.findElement(By.xpath("//input[@name='inlineRadioOptions' and @id='inlineRadio1']"));
		mrbtn.click();

		WebElement showselectbtn = driver.findElement(By.xpath("//button[@type='button' and @id='button-one']"));
		showselectbtn.click();

		WebElement msg = driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println("Result message after radio button selection is :" + msg.getText());
		
		
	System.out.println(driver.getPageSource());//to get html code 
	int x=msg.getLocation().x;
	int y=msg.getLocation().y;
	System.out.println("X and Y coordinates are"+x +" "+y);
	driver.quit();

	}

}
