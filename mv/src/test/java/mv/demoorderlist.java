package mv;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class demoorderlist {
  @Test
  public void f() throws InterruptedException, IOException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RK\\Downloads\\chromedriver_win32\\chromedriver.exe");
  	  
  	  WebDriver driver;
  	  driver=new ChromeDriver();
  	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

  	 
  	  
  	  driver.get("http://demo.automationtesting.in/Selectable.html");
  	  
  	 driver.findElement(By.linkText("Serialize")).click();
  	 List<WebElement> ele1=driver.findElements(By.xpath("//*[@id=\'Serialize\']/ul/li"));//*[@id="Serialize"]/ul/li[1]
  	 int size1=ele1.size();
 	 System.out.println(size1);
  	 
  	Actions act1=new Actions(driver);
  	
  	act1.keyDown(Keys.CONTROL)
  	.click(ele1.get(0))
 	.click(ele1.get(2))
  	.click(ele1.get(4))
  	.click(ele1.get(6))
  	.build().perform();
  		 

   TakesScreenshot s1=(TakesScreenshot)driver;
  	
  	File source=s1.getScreenshotAs(OutputType.FILE);
  	File destination=new File("C:\\Users\\RK\\Desktop\\screenshot\\shot3.jpg");
  	FileHandler.copy(source,destination);
  }
}
