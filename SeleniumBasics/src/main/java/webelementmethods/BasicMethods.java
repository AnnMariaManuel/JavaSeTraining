package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethods {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		/*driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement fb_tagline= driver.findElement(By.xpath("//h2[@class='_8eso']"));
		String taglinetext= fb_tagline.getText();
		
		System.out.println(taglinetext);
		
		WebElement login_text=driver.findElement(By.xpath("//button[@name='login']"));
		System.out.println(login_text.getText());
		driver.quit();*/
		
		//checkbox 
		
		/*driver.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement cb1= driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]"));
		WebElement cb2=driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]"));
		System.out.println(cb1.isSelected());
		System.out.println(cb2.isSelected());
	        if(!cb1.isSelected())
	        {
	        	cb1.click();
	        }
	        
	        if (!cb2.isSelected())
	        {
	        	cb2.click();
	        }*/
		
		//radio button 
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement mrbtn=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		mrbtn.click();
		WebElement frbtn=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		
		System.out.println("Male radio button is selected? " +mrbtn.isSelected());
		System.out.println("Female radio button is selected?"+frbtn.isSelected());
		
		
		System.out.println("Is male radio btn displayed in UI ?"+mrbtn.isDisplayed());
		System.out.println("Is female radio btn is present in UI ?"+frbtn.isDisplayed());

	}

}
