package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipCssAssign {

	public static void main(String[] args)

	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/window-popup.php");
		driver.manage().window().maximize();

		WebElement Likeusonfbbtn = driver.findElement(By.xpath("//a[contains(text(),'Facebook ')]"));
		System.out.println("The tooltip of button'like us on Facebook is' is:" + Likeusonfbbtn.getAttribute("title"));

		WebElement FoolowAllbtn = driver.findElement(By.xpath("//a[@id='windowMulti']"));
		System.out
				.println("Background color of button'Follow All' is :" + FoolowAllbtn.getCssValue("background-color"));
		System.out
				.println("Font size of 'Like us on facebook button'text is :" + FoolowAllbtn.getCssValue("font-size"));

		driver.quit();

	}

}
