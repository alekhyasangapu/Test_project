package mv;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class unorder {
  @Test
  public void f() throws InterruptedException, IOException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RK\\Downloads\\chromedriver_win32\\chromedriver.exe");
  	  
  	  WebDriver driver;
  	  driver=new ChromeDriver();
  	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

  	 
  	  
  	  driver.get("http://www.leafground.com/pages/autoComplete.html");
  	  driver.findElement(By.id("tags")).sendKeys("A");
  	  Thread.sleep(5000);
  	 List<WebElement> ele2=driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));  
  	 int size1=ele2.size();
  	 System.out.println(size1);
  	 for(WebElement element_value :ele2) {
  		 if(element_value.getText().equalsIgnoreCase("SOAP")) {
  			 element_value.click();
  			 break;
  			 
  			 
  		 }
  	 }
  	TakesScreenshot s1=(TakesScreenshot)driver;
  	
  	File source=s1.getScreenshotAs(OutputType.FILE);
  	File destination=new File("C:\\Users\\RK\\Desktop\\screenshot\\shot1.jpg");
  	FileHandler.copy(source,destination);
  	
  }
}
