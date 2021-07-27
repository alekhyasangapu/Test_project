package mv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hyperlink {
  @Test
  public void test3() {
  System.setProperty("webdriver.chrome.driver","C:\\Users\\RK\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver;
	  driver=new ChromeDriver();
	  
	  driver.get("http://www.leafground.com/pages/Link.html"); 
	  
	  driver.findElement(By.linkText("Go to Home Page")).click();
	  
	  
	  driver.get("http://www.leafground.com/pages/Link.html");
	  driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
	  
	  
	  driver.get("http://www.leafground.com/pages/Link.html"); 
	  driver.findElement(By.linkText("Verify am I broken?")).click();
	  
	  
	  driver.get("http://www.leafground.com/pages/Link.html");
	  driver.findElement(By.linkText("Go to Home Page")).click();
	  
	  driver.quit();
  }
}

