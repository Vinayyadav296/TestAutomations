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

public class WindowHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); // checking the compitablity of WebDriver and browser
		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html"); // URL Launch
		driver.manage().window().maximize();
		String parentId = driver.getWindowHandle(); // this method will return parent window id in the form of string
		WebElement Btn = driver.findElement(By.cssSelector("button#newTabBtn"));
		Btn.click();
		Set<String> allWindows = driver.getWindowHandles();// this method will return set of strings which contains of
															// list of ids of all open window
		for (String s : allWindows) {
			if (!parentId.equals(s)) {
				driver.switchTo().window(s);
				WebElement clickBtn = driver.findElement(By.cssSelector("button#confirmBox"));
				clickBtn.click();
				WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
				w.until(ExpectedConditions.alertIsPresent());
				Alert a = driver.switchTo().alert();
				a.accept();
				driver.close(); // it will close the current window and tab
			}

			driver.switchTo().window(parentId);
			WebElement inputBox = driver.findElement(By.cssSelector("input#name"));
			inputBox.sendKeys("Test Automation");
		}

	}

}
