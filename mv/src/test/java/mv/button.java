package mv;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class button {
  @Test
  public void test2() {
  System.setProperty("webdriver.chrome.driver","C:\\Users\\RK\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver;
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  driver.get("http://www.leafground.com/pages/Button.html");
	  WebDriverWait var_wait=new WebDriverWait(driver,20);
	  var_wait.until(ExpectedConditions.elementToBeClickable(By.id("home")));
	  


	  
	  driver.findElement(By.id("home")).click();
	  driver.findElement(By.id("wrapper")).click();
	  driver.get("http://www.leafground.com/pages/Button.html");
	  driver.findElement(By.id("color")).click();
	  driver.quit();
  }
}

