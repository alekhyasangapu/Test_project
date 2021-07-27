package mv;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class editTest {
  @Test
  public void test1() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RK\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver;
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      
	  driver.get("http://www.leafground.com/");
	  driver.findElement(By.linkText("Edit")).click();
	  WebDriverWait var_wait=new WebDriverWait(driver,20);
	  var_wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
	  
	  driver.findElement(By.id("email")).sendKeys("alekhya@gmail.com");
	  driver.findElement(By.cssSelector("input[value='Append ']")).clear();
	  driver.findElement(By.cssSelector("input[value='Append ']")).sendKeys("Alekhya");
	  driver.findElement(By.name("username")).clear();
	  driver.findElement(By.name("username")).sendKeys("allu");
	  driver.findElement(By.xpath("//input[@name='username'][1]")).sendKeys("clear");
	  //driver.close();
	  
  }
  
}
