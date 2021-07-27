package mv;
import java.io.BufferedWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import jxl.read.biff.BiffException;

public class cookies {
	
	@Test
	public void script1() throws  IOException   {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RK\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");	
		
		driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
		String msg=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(msg);
		
	
        
        File f1=new File("C:\\Users\\RK\\Desktop\\cookies\\Cookies.data");
        
        try {
        	f1.createNewFile();
        	FileWriter fw1= new FileWriter(f1);
        	BufferedWriter bw=new BufferedWriter(fw1);
        	
        	for(Cookie ck:driver.manage().getCookies()) {
        		bw.write(ck.getName()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getValue()+";"+ck.isSecure()+";"+ck.getExpiry());
        	
        	bw.newLine();
        	
        	
        	}
        	bw.close();
        	fw1.close();
        }
        
       catch(Exception e) {
    	   System.out.println(e);
        	
       	
        }
        
        

}
}
