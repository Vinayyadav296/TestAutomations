package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		    
		  WebDriverManager.chromedriver().setup();  // checking the compitablity of WebDriver and browser
		  WebDriver driver = new ChromeDriver();  //Browser Launch
		  driver.get("https://www.newlook.com/row/register");  //URL Launch
		  driver.manage().window().maximize();
		  
	

	}

}
