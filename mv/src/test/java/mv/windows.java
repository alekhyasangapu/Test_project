package mv;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class windows {
  @Test
  public void win() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RK\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver;
	  driver=new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
 
	  driver.get("http://www.leafground.com/pages/Window.html");
	  WebDriverWait var_wait=new WebDriverWait(driver,20);
	  var_wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	  driver.findElement(By.id("home")).click();
	  /*Set<String> window_value=driver.getWindowHandles();
	  Iterator<String> iter=window_value.iterator();
	  String w1=iter.next();
	  String w2=iter.next();
      driver.switchTo().window(w2);
      System.out.println(w1);
      System.out.println(w2);
      String title_child=driver.getTitle();
      System.out.println(title_child);
      
      String url=driver.getCurrentUrl();
      String page=driver.getPageSource();
      System.out.println(url);
      System.out.println(page);
      
      
      driver.navigate().back();
      driver.navigate().refresh();
      driver.navigate().forward(); 
      driver.navigate().to(url);
      driver.manage().window().maximize();
      Dimension dim=new Dimension(250,350);
      driver.manage().window().setSize(dim);*/
	  
  }
}
