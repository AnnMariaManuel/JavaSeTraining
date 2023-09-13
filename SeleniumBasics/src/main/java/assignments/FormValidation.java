package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormValidation {

	public static void main(String[] args)

	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		driver.manage().window().maximize();

		WebElement sbmtbtn = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		System.out.println("Submit button text is :: " + sbmtbtn.getText());

		WebElement TCbox = driver.findElement(By.xpath("//input[@id='invalidCheck']"));
		WebElement TCText = driver.findElement(By.xpath("//label[@for='invalidCheck']"));
		System.out.println("T& C text is::" + TCText.getText());

		System.out.println("TC is selected ? " + TCbox.isSelected());
		System.out.println("TC is Enabled ?" + TCbox.isEnabled());
		System.out.println("TC is displayed ?" + TCbox.isDisplayed());

		WebElement Firstname = driver.findElement(By.id("validationCustom01"));
		WebElement Lastname = driver.findElement(By.id("validationCustom02"));
		WebElement username = driver.findElement(By.id("validationCustomUsername"));
		WebElement City = driver.findElement(By.id("validationCustom03"));
		WebElement State = driver.findElement(By.id("validationCustom04"));
		WebElement Zip = driver.findElement(By.id("validationCustom05"));

		System.out.println("Firstname is displayed: " + Firstname.isDisplayed());
		System.out.println("Lastname is displayed: " + Lastname.isDisplayed());
		System.out.println("USername is displayed: " + username.isDisplayed());
		System.out.println("City is displayed: " + City.isDisplayed());
		System.out.println("State is displayed: " + State.isDisplayed());
		System.out.println("Zip is displayed: " + Zip.isDisplayed());

		driver.quit();

	}

}
