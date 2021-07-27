package element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Attribute {
	
	
	@FindBy(id="email")
	public static WebElement emailid;
	
	@FindBy(id="login")
	public static WebElement login_button;

	
	

	public static WebElement emailid(WebDriver driver) {
		return driver.findElement(By.id("email"));

}
	public static WebElement login_button(WebDriver driver) {
		return driver.findElement(By.name("login"));
	}
}