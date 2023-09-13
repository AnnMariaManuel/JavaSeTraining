package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeAssign {

	public static void main(String[] args)

	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/jquery-progress-bar.php");
		driver.manage().window().maximize();

		WebElement strtdwnldbtn = driver.findElement(By.xpath("//button[@id='downloadButton']"));
		System.out.println("Tage name of button is :" + strtdwnldbtn.getTagName());

		System.out.println("The id attribute value of button is :" + strtdwnldbtn.getAttribute("id"));

		System.out.println("The class attribute value of the button is :" + strtdwnldbtn.getAttribute("class"));

		driver.quit();
	}

}
