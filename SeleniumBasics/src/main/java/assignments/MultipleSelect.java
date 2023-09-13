package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {

	public static void main(String[] args)

	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();

		WebElement two_input_field = driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select s1 = new Select(two_input_field);
		s1.selectByVisibleText("Green");

		WebElement get_firstslctd_btn = driver.findElement(By.xpath("//button[@id='button-first']"));
		get_firstslctd_btn.click();

	}

}
