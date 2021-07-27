package mv;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class dragabble {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RK\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver;
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      
	  
		 driver.get("http://www.leafground.com/pages/drop.html");
		 
		  //WebDriverWait var_wait=new WebDriverWait(driver,20);
		 //var_wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		 Actions act1=new Actions(driver);
		  
		  WebElement ele1 =driver.findElement(By.id("draggable"));
		  WebElement ele2 =driver.findElement(By.id("droppable"));
		  Thread.sleep(5000);
		
		  act1.dragAndDrop(ele1,ele2).build().perform();
		  
  }
}
