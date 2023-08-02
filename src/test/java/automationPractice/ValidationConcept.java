package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidationConcept {
           public static void main(String[] args) {
	          
	        
            	  WebDriverManager.chromedriver().setup();  // checking the compitablity of WebDriver and browser
        		  WebDriver driver = new ChromeDriver();  //Browser Launch
        		  driver.get("https://www.saucedemo.com/v1/");  //URL Launch
        		  driver.manage().window().maximize();
        		  
        		  
        	      // validating that homepage swag labs heading is correct or not
      	        
//       	       WebElement swagLogo= driver.findElement(By.cssSelector("div.login_logo"));
//       	                String value= swagLogo.getText();
//       	                Assert.assertEquals(value,"Swag Labs");
//       	                
       	                
        		  WebElement userName=driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
	              userName.sendKeys("standard_user");  // send keys method is used for typing automatically
	    WebElement password=driver.findElement(By.xpath("//input[@id=\"password\"]"));//find element return web element
                   password.sendKeys("secret_sauce");        	   
	    WebElement loginButton = driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
	               loginButton.click();
	           
	     // Selenium do not have any predefined validation inside it that's why we need a third party libray for validation 
	     // Here TestNg is a third party library for validation puropse
	    
	     //Assert is a predefined class of testng which has a assertTrue method which will return a boolenan value
	        Assert.assertTrue(driver.findElement(By.cssSelector("div.product_label")).isDisplayed());
	        
	  
	        
			}
           }

