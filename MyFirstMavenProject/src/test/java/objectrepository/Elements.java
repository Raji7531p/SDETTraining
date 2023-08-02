package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elements {
	
	@FindBy(id="userName")
	public static WebElement us;
	
	@FindBy(name="password")
	public static WebElement pswd;
	
	@FindBy(xpath="//*[@value='Login']")
	public static WebElement Loginbtn;

	public static WebElement us(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

	public static WebElement pswd(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	/*public static WebElement us(WebDriver driver) {
		return driver.findElement(By.id("userName"));
		
	}
	
	public static WebElement pswd(WebDriver driver) {

		return driver.findElement(By.name("password"));
}
    public static WebElement loginbtn(WebDriver driver) {
    	
    	return driver.findElement(By.xpath("//*[@value=\"Login\"]"));
    	}*/
    	
    }
    