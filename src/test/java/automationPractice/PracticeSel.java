package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeSel {
    
	public static void main(String[] args) {
		   
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.newlook.com/row/register");
		 // driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		   // driver.manage().window().maximize();
		   // WebElement email=driver.findElement(By.xpath("//input[@id='emailhai']"));
		   // email.sendKeys("yadavhaibhai@gmail.com");
		    WebElement cookies = driver.findElement(By.xpath("//a[@class='cookiebanner-btns--btn cookiebanner-btns--btn__accept']"));
		    //     cookies.click();
		    //   WebElement dropdown = driver.findElement(By.xpath("//select[@id='titleCode']"));
		            // Select s = new Select(dropdown);
		               //s.selectByIndex(3);
		               // s.selectByVisibleText("Mr.");
		               //  s.selectByValue("Miss");
                 
//		  		       WebElement dropdown = driver.findElement(By.xpath("//select[@id='ide']"));
//		  		               Select s = new Select(dropdown);
//		  		                     s.selectByValue("ec");
//		  		                   s.selectByValue("ij");
//		  		                 s.selectByValue("vs");
		
		           // Locators Using css selectors
		
//		        WebElement email=driver.findElement(By.cssSelector("input#email"));  //By using id 
//		                   email.sendKeys("Hii@gmail.com");
//		  		//WebElement password=driver.findElement(By.cssSelector("input ng-pristine ng-empty ng-valid-password-strength ng-invalid ng-invalid-required ng-valid-maxlength ng-touched"));
//		  		     WebElement password=driver.findElement(By.cssSelector("[name='pwd'"));
//		                   password.sendKeys("Vinay");
//		                   
//          //If normal click is not working then use javascriptexecutor
//		                   
//		                   JavascriptExecutor js=(JavascriptExecutor) driver;
//		                   js.executeScript("arguments[0].click();", cookies);
	}
}
