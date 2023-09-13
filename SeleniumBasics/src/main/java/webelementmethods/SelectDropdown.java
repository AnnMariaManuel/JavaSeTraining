package webelementmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement All_dropdown= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		All_dropdown.click();
		
		Select s1=new Select(All_dropdown);
		 //to select by index position 
		//s1.selectByIndex(4);
	    
		//to select by value
		
		//s1.selectByValue("search-alias=amazon-devices");
		
		//to select by visible text 
		//s1.selectByVisibleText("Amazon Fashion");
		
		//to get all options in a dropdown 
		
		List<WebElement> options = s1.getOptions();
		
		for(WebElement item:options)
		{
			System.out.println(item.getText());
		}
		
		driver.quit();

	}

}
