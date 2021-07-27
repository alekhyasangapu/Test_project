package mv;
//import java.util.concurrent.TimeUnit;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class popup {
  @Test
  public void f() throws AWTException, IOException {
 System.setProperty("webdriver.chrome.driver","C:\\Users\\RK\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver;
	  driver=new ChromeDriver();
	  
	  driver.get("http://www.leafground.com/pages/Alert.html");
	  
	  //WebDriverWait var_wait=new WebDriverWait(driver,20);
	  //var_wait.until(ExpectedConditions.alertIsPresent());
	 
	  driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
	// String msg= driver.switchTo().alert().getText();
	 // System.out.println(msg);
 
	  
//	  driver.get("http://www.leafground.com/pages/Alert.html");
  
	//  driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
//	  String msg2 = driver.switchTo().alert().getText();
	//  System.out.println(msg2);
	  //driver.switchTo().alert().dismiss();
	  
	  
 
	 // driver.get("http://www.leafground.com/pages/Alert.html");
  
	  //driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
	  //driver.switchTo().alert().accept();
	  //System.out.println(msg3);
	  //driver.switchTo().alert();
	  //driver.switchTo().alert().sendKeys("alekhyasangapu");
	  
	  Robot robot1=new Robot();
	  Dimension screen_size=Toolkit.getDefaultToolkit().getScreenSize();
	  Rectangle rect1= new Rectangle(screen_size);
	  BufferedImage source=robot1.createScreenCapture(rect1);
	  File destination=new File("C:\\Users\\RK\\Desktop\\screenshot\\shot2.jpg");
	  ImageIO.write(source, "jpg", destination);
	 
    
  }
}
