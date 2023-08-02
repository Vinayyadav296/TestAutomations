package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelenimuDemo {
     
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup(); // checking the compitability of the webdriver browser version and
													// local browser version 
		
		WebDriver driver =new ChromeDriver();   // Browser Launch WebDriver is an interface and ChromeDriver implements it
//	    driver.get("https://www.saucedemo.com/v1/");  //URL Launch
		  driver.get("https://www.newlook.com/row/register");  //URL Launch
		   
	    driver.manage().window().maximize();  // Maximize Window
	    
//	    WebElement userName=driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
//	              userName.sendKeys("standard_user");  // send keys method is used for typing automatically
//	    WebElement password=driver.findElement(By.xpath("//input[@id=\"password\"]"));//find element return web element
//                   password.sendKeys("secret_sauce");        	   
//	    WebElement loginButton = driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
//	               loginButton.click();
//	    WebElement expandButton = driver.findElement(By.xpath("//div[@id=\"menu_button_container\"]"));
//	               expandButton.click();
	              WebElement cookies=driver.findElement(By.xpath("//a[@class=\"cookiebanner-btns--btn cookiebanner-btns--btn__accept\"]")); 
	               cookies.click();
	              WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	              email.sendKeys("yadavhu@gmail.com");
	              WebElement password=driver.findElement(By.xpath("//input[@id='pwd']"));
	              password.sendKeys("yadavHu");
	    		     
	              WebElement dropdown= driver.findElement(By.xpath("//select[@id=\"titleCode\"]"));
	                        Select s = new Select(dropdown);
	                               s.selectByVisibleText("Mr.");
	              WebElement firstName=driver.findElement(By.xpath("//input[@id='firstName']"));
	              firstName.sendKeys("Vinay");
	              WebElement lastName=driver.findElement(By.xpath("//input[@id='lastName']"));
	              lastName.sendKeys("yadav");
	              WebElement checkbox=driver.findElement(By.xpath("//label[@class='label checkbox__label']"));
	              checkbox.click();
	              WebElement createAccountButton = driver.findElement(By.xpath("//button[@type='submit']"));
	                         createAccountButton.click();
	              
	  
	}
}
