package automationPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapdropdown {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		          driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		          WebElement button=driver.findElement(By.cssSelector("button#menu1"));
		                     button.click();
		   List<WebElement> dropdownList=  driver.findElements(By.cssSelector("ul.dropdown-menu li a"));
		       int listSize = dropdownList.size();
		       System.out.println(listSize);
		   for(WebElement ele : dropdownList) {
			    String value= ele.getText();
		           if(value.equals("JavaScript")) {
		        	     ele.click();
		        	     break;
		           }
		   }
		     
		  
	}

}
