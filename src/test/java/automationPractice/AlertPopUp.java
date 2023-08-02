package automationPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
//                WebElement clickAlertButton = driver.findElement(By.cssSelector("button#alertBox"));
		// WebElement clickAlertButton =
		// driver.findElement(By.cssSelector("button#confirmBox"));
		WebElement clickAlertButton = driver.findElement(By.cssSelector("button#promptBox"));
		clickAlertButton.click();

		Alert a = driver.switchTo().alert();
		a.sendKeys("Hii there ");
		String value =   a.getText();
		   System.out.println(value);
		a.accept();   // it is to click on ok
		// a.dismiss();     // it is to click on cancel button
	}

}
