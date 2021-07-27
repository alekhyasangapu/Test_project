package mv;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Dropdown {
  @Test
  public void test4() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\RK\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver;
	  driver=new ChromeDriver();
	  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	 
	  
	  driver.get("http://www.leafground.com/pages/Dropdown.html");
	  
	  //WebDriverWait var_wait=new WebDriverWait(driver,20);
	 // var_wait.until(ExpectedConditions.elementToBeSelected(By.name("dropdown2")));
	  
	  
	  Select select1 = new Select(driver.findElement(By.name("dropdown2")));
	  select1.selectByIndex(1);
	  //select1.deselectByIndex(1);
	  //select1.selectByIndex(3);
	  
	  Select select2 = new Select(driver.findElement(By.id("dropdown1")));
	  select2.selectByVisibleText("UFT/QTP");
	 
	  Select select3 = new Select(driver.findElement(By.name("dropdown3")));
	  select3.selectByValue("2");
	  //select3.deselectByValue("2");
	  
	  
	  select3.selectByValue("1");
	 // select2.deselectByVisibleText("UFT/QTP");
	  select2.selectByVisibleText("Selenium");
	  
	 driver.close();
	  
	  
	  
	  
 
  }
}
