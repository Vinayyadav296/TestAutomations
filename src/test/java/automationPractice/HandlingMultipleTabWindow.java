package automationPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleTabWindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); // checking the compitablity of WebDriver and browser
		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html"); // URL Launch
		driver.manage().window().maximize();
		String parentId = driver.getWindowHandle(); // this method will return parent window id in the form of string
		WebElement Btn = driver.findElement(By.cssSelector("button#newTabsBtn"));
		Btn.click();
		Set<String> allWindows = driver.getWindowHandles();// this method will return set of strings which contains of
															// list of ids of all open window
		for (String s : allWindows) {
			if (!parentId.equals(s)) {
				driver.switchTo().window(s);
				String title = driver.getTitle(); // this method will return the current page title
				if (title.contains("AlertsDemo")) {
					WebElement firstName = driver.findElement(By.cssSelector("button#alertBox"));
					     firstName.click();
					     Alert a= driver.switchTo().alert();
					     a.accept();
					    break;
				}

			}

		}

	}

}
