package launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauchBrowser 

{

	public static void main(String[] args)
	
	{   
		
		//to mention the folder path of chromedriver ;setProperty () can be used to set the driver path of the respective browser.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tony joseph\\OneDrive\\Desktop\\Selenium files\\chromedriver.exe");
		
		//creating object for interface webdriver ,Chromedriver is the implementation class(Runtime polymorphism)
		
		WebDriver driver = new ChromeDriver(); //1.this will open chrome browser 
		//ChromeDriver driver=new ChromeDriver(); //2. this will also open chrome browser 
		
		//while using the 2nd one only chrome can be used , in btwn i cannot chnage it , but while using webdriver we canswitch easily to edge or firefox
		
		
		driver.get("https://www.flipkart.com/");//to launch url ,waits until page loads 
		
		driver.manage().window().maximize(); //to maximize the window 
		
		String current_url= driver.getCurrentUrl(); //to get the current URL of the page loaded
		System.out.println(current_url); //prints current url 
		
		String tab_title= driver.getTitle();//to retreive tab title 
		System.out.println(tab_title);
		
		driver.get(current_url);//to refresh the screen ,works like copy pasting the same url again to refresh
		driver.get("https://www.irctc.co.in/nget/");
		driver.quit();//terminate entire browser 
		//driver.close();//terminate the current browser tab 
		

	}

}
