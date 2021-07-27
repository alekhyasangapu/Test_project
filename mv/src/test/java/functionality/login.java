package functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import element.Attribute;



public class login {
  @Test
  public void f() {
	 

	  	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RK\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  	  
	  	  WebDriver driver;
	  	  driver=new ChromeDriver();
	  	  driver.get("https://www.facebook.com/");
	  	  
	  	  PageFactory.initElements(driver,Attribute.class);
	  	  		
	    Attribute.emailid(driver).sendKeys("alekhya@gmail.com");
	    Attribute.login_button(driver).click();
  }
	  

  }

