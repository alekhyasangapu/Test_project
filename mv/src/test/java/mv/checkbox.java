package mv;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class checkbox {
  @Test
  public void test6() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\RK\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver;
	  driver=new ChromeDriver();
	  
	  driver.get("http://www.leafground.com/pages/checkbox.html");
	  
	  
	  driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	  driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	  driver.findElement(By.id("wrapper")).click();
	  Dimension dim=new Dimension(250,350);
      driver.manage().window().setSize(dim);
  }
}
