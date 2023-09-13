package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementMethodAssign {

	public static void main(String[] args)

	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();

		WebElement cb = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		WebElement cb1 = driver.findElement(By.xpath("//input[@id='check-box-one']"));
		WebElement cb2 = driver.findElement(By.xpath("//input[@id='check-box-two']"));
		WebElement cb3 = driver.findElement(By.xpath("//input[@id='check-box-three']"));
		WebElement cb4 = driver.findElement(By.xpath("//input[@id='check-box-four']"));
		cb4.click();

		System.out.println("Main checkbox is displayed?" + cb.isDisplayed());
		System.out.println("Main checkbox is selected ?" + cb.isSelected());
		System.out.println("Main checkbox is Enabled?" + cb.isEnabled());
		System.out.println("-----------------------------------------------");
		System.out.println();

		System.out.println("Checkbox1 is displayed?" + cb1.isDisplayed());
		System.out.println("Checkbox1 is selected ?" + cb1.isSelected());
		System.out.println("Checkbox1 is Enabled?" + cb1.isEnabled());
		System.out.println("-----------------------------------------------");
		System.out.println();

		System.out.println("Checkbox2 is displayed?" + cb2.isDisplayed());
		System.out.println("Checkbox2 is selected ?" + cb2.isSelected());
		System.out.println("Checkbox2 is Enabled?" + cb2.isEnabled());
		System.out.println("-----------------------------------------------");
		System.out.println();

		System.out.println("Checkbox3 is displayed?" + cb3.isDisplayed());
		System.out.println("Checkbox3 is selected ?" + cb3.isSelected());
		System.out.println("Checkbox3 is Enabled?" + cb3.isEnabled());
		System.out.println("-----------------------------------------------");
		System.out.println();

		System.out.println("Checkbox4 is displayed?" + cb4.isDisplayed());
		System.out.println("Checkbox4 is selected ?" + cb4.isSelected());
		System.out.println("Checkbox4 is Enabled?" + cb4.isEnabled());

		driver.quit();

	}

}
