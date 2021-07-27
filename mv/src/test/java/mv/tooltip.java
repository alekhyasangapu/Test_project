package mv;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class tooltip {
  @Test
  public void f() throws IOException {

	/*  WebDriver driver;
	  FileInputStream f1=new FileInputStream("src\\test\\java\\config.properties");
	  
	  Properties prop= new Properties();
	  prop.load(f1);
	  String browser_name=prop.getProperty("browser");
	  String driver_path=prop.getProperty("path");
	  if(browser_name.equalsIgnoreCase("chrome"))
	  {
	  System.setProperty("webdriver.chrome.driver",driver_path);
	  driver=new ChromeDriver();
     }
       else  if(browser_name.equalsIgnoreCase("firefox")){
       System.setProperty("webdriver.gecko.driver",driver_path);
       driver=new FirefoxDriver();
       }
       else {
    	   System.setProperty("webdriver.ie.driver",driver_path);
    	   driver=new InternetExplorerDriver();
       }
    	 */
	  
  
System.setProperty("webdriver.chrome.driver","C:\\Users\\RK\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver;
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  driver.get("http://www.leafground.com/pages/tooltip.html");
	  WebElement ele1=driver.findElement(By.id("age"));
	  String msg=ele1.getAttribute("title");
	  System.out.println(msg);
	  
  }
}
