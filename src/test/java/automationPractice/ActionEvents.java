package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionEvents {

	public static void main(String[] args) {
//		  WebDriverManager.chromedriver().setup();  // checking the compitablity of WebDriver and browser
//		  WebDriver driver = new ChromeDriver();  //Browser Launch
		  WebDriverManager.edgedriver().setup();
		  WebDriver driver=new EdgeDriver();
		  driver.get("https://www.browserstack.com/");  //URL Launch
		  driver.manage().window().maximize();
		  
		  WebElement productMenu=driver.findElement(By.cssSelector("button#products-dd-toggle"));
		  
		  Actions a=new Actions(driver);
		          a.moveToElement(productMenu).build().perform();  // this will hover like mouse on the product menu
		          
		   WebElement liveMenu=driver.findElement(By.cssSelector("[aria-label='Live']"));
		               liveMenu.click(); 
		   WebElement  search=driver.findElement(By.cssSelector("[aria-label='Search']"));
		               search.click();
		   WebElement searchInput=driver.findElement(By.cssSelector("input#doc-search-box-input"));
		              searchInput.sendKeys("Test");
		              a.sendKeys(Keys.ENTER).build().perform();   // this sendkeys method is of action class which is used for clicking on keyboard or mouse keys
            

	}

}
