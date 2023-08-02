package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatingWebElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); // checking the compitablity of WebDriver and browser
		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.get("https://www.newlook.com/row/register"); // URL Launch
		driver.manage().window().maximize();

		// Handling Cookies
		WebElement cookies = driver
				.findElement(By.xpath("//a[@class='cookiebanner-btns--btn cookiebanner-btns--btn__accept']"));
		     cookies.click();
		// Locating through xpath
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("yadvvinay@gmail.com");

		// Locating through css selectors
		// css selector in case of id
		WebElement password = driver.findElement(By.cssSelector("input#pwd"));
		password.sendKeys("Vinay@321");

		// Handling dropdown if it is of select type

		WebElement dropdown = driver.findElement(By.cssSelector(
				"select#titleCode"));
		dropdown.click();
		Select s = new Select(dropdown);
		s.selectByVisibleText("Mr.");
//		s.selectByIndex(0);
//		s.selectByValue("mr");

		WebElement firstName = driver
				.findElement(By.cssSelector("input#firstName"));
		firstName.sendKeys("Vinay");

		WebElement lastName = driver.findElement(By.cssSelector("[name='lastName']"));
		lastName.sendKeys("Yadav");

		WebElement label = driver.findElement(By.cssSelector("label.checkbox__label"));
		label.click();
		WebElement button = driver.findElement(
				By.cssSelector("[type='submit']"));
		        // button.click();
		         
		   //JavaExecutor to click on something particular with 100% confirmation
		         
		         JavascriptExecutor js = (JavascriptExecutor) driver;
		              js.executeScript("arguments[0].click();", button);

	}

}
