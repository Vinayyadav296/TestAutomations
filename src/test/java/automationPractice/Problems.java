package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Problems {
	public static void addToCart() {
		System.out.println("entering into addToCart Method");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		   driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.cssSelector("input#user-name"));
		           username.sendKeys("standard_user");
		           
		       	WebElement password=driver.findElement(By.cssSelector("input#password"));
		           password.sendKeys("secret_sauce");
		        WebElement loginButton=driver.findElement(By.cssSelector("input#login-button"));
		                   loginButton.click();
		       	WebElement addToCart=driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[1]"));
		                   addToCart.click();
	}
   public static void main(String[] args) {
	      addToCart();
   }
}
