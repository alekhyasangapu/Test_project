package mv;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class webele {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RK\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver;
	  driver=new ChromeDriver();
	 // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      
	 driver.get("http://www.leafground.com/pages/Edit.html");
	 
	
	  
	  WebElement ele1 =driver.findElement(By.id("email")); 
	  Actions act1 =new Actions(driver);  
	   
        act1.sendKeys(ele1,"alekhya@gmail.com"); 
	  act1.doubleClick(ele1).build().perform();
	  
  }
}
