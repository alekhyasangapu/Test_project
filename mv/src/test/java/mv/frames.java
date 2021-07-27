package mv;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class frames {
  @Test
  public void testframe()  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\RK\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver driver;
		  driver=new ChromeDriver();
		  
		 // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
	 
		  driver.get("http://www.leafground.com/pages/frame.html");
		  
		  //WebDriverWait var_wait=new WebDriverWait(driver,20);
		  //var_wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		  driver.switchTo().frame(0);
		  driver.findElement(By.id("Click")).click();
		  driver.switchTo().defaultContent();
		  
		 
	      int size1=driver.findElements(By.xpath("//iframe[@src='page.html']")).size();
		  System.out.println(size1);
		  driver.switchTo().frame(1);
		  driver.switchTo().frame("frame2");

			
		  driver.findElement(By.id("Click1")).click();
		  driver.switchTo().defaultContent();
		    
		  
  }
}
