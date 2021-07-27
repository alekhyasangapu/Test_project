package mv;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RK\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 // System.setProperty("webdriver.chrome.driver","install()");
	  WebDriver driver;
	  driver=new ChromeDriver();
	  
 
	  driver.get("http://www.leafground.com/pages/Alert.html");
  
	  driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
	 
	  Alert alert=driver.switchTo().alert();
	  alert.sendKeys("alekhyasangapu");
	 	
	  alert.accept();
    


	  
  }
}
