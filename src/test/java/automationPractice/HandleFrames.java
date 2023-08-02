package automationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
       WebDriver driver=new ChromeDriver();
       driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.switchTo().frame(0);
		WebElement ipBox=driver.findElement(By.cssSelector("[name='mytext1']"));
		ipBox.sendKeys("Vinay");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		WebElement ipBox3=driver.findElement(By.cssSelector("[name='mytext3']"));
		ipBox3.sendKeys("Karan");
	}

}
