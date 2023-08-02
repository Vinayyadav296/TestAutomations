package automationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); // checking the compitablity of WebDriver and browser
		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.get("https://www.saucedemo.com/v1/");

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.xpath("//input[@id=\"user-name\"]"));

		// Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(userName));

		userName.sendKeys("standard_user"); // send keys method is used for typing automatically
		WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));// find element return web
																						// element
		password.sendKeys("secret_sauce");
		WebElement loginButton = driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
		
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();

	}

}
