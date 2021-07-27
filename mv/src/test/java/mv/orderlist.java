package mv;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class orderlist {
  @Test
  public void f() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\RK\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  	  
		  	  WebDriver driver;
		  	  driver=new ChromeDriver();
		  	  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		  	 
		  	  
		  	  driver.get("http://www.leafground.com/pages/selectable.html");
		  	 // int size_list = driver.findElements(By.xpath("//ol[@id='selectable']/li")).size();
		  	 // System.out.println(size_list);
		  	  
		  	List<WebElement> ele1= driver.findElements(By.xpath("//ol[@id='selectable']/li"));
		  	int size_list=ele1.size();
		  	 System.out.println(size_list);
		  	  
		  	
		  	Actions act1=new Actions(driver);
		  	
		  	act1.keyDown(Keys.CONTROL)
		  	.click(ele1.get(0))
		  	.click(ele1.get(2))
		  	.click(ele1.get(4))
		  	.click(ele1.get(6))
		  	.build().perform();
		  	
		  	 
  }
}
