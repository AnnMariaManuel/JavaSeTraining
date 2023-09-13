package launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LauchBrowserEdge 

{

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.close();
		System.out.println("Action completed");

	}

}
