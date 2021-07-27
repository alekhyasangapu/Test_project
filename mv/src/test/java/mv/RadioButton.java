package mv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RadioButton {
  @Test
  public void test5() {
 System.setProperty("webdriver.chrome.driver","C:\\Users\\RK\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver;
	  driver=new ChromeDriver();
	  driver.get("http://www.leafground.com/pages/radio.html");

	  WebDriverWait var_wait=new WebDriverWait(driver,20);
	  var_wait.until(ExpectedConditions.elementToBeClickable(By.id("yes")));
	  driver.findElement(By.id("yes")).click();
	  driver.findElement(By.name("news")).click();
	  driver.findElement(By.xpath("//input[@value='2']")).click();
	  //driver.close();
	  
  }
}
