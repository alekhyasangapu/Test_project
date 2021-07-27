package mv;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demodate {
  @Test
  public void f() {

	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RK\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver;
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	 // driver.get("http://demo.automationtesting.in/Datepicker.html");
	  driver.get("http://www.leafground.com/");
	  //driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
	  JavascriptExecutor jse= (JavascriptExecutor)driver;
	 // jse.executeScript("document.getElementById('datepicker1').value=22/04/1997");
	 // jse.executeScript("scroll(0,550)");
	 // WebElement ele1=driver.findElement(By.xpath("/html/body/div[2]/section/div[3]/div[1]/div/p[9]/textarea"));
	  //jse.executeScript("arguments[0].scrollIntoView(true)",ele1);
	  jse.executeScript("scrollBy(200,500)");
	  //jse.executeScript("scrollTo(0, document.body.scrollHeight)");
	 // ele1.sendKeys("alekhyasangapu");
  }
}
