package com.myfirstmavenproject.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonRegPage {
   
	WebDriver driver;
	
	@BeforeClass
	public void beforsClass() {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_97fyapli65_b&adgrpid=57684946783&hvpone=&hvptwo=&hvadid=617721222427&hvpos=&hvnetw=g&hvrand=6463788394906984456&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9152546&hvtargid=kwd-297132974063&hydadcr=5870_2362052");
		
	
	}
  @Test
  public void regPage () throws InterruptedException {
		
 
  WebElement signin=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
  WebElement startthere=driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-newCust\"]/a"));
  
  	WebDriverWait wait=new WebDriverWait(driver,1000);
  	wait.until(ExpectedConditions.visibilityOf(startthere));
  	
    Actions action = new Actions(driver);
	  action.moveToElement(signin).perform();
	 driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-newCust\"]/a")).click();
	 Thread.sleep(10000);
	 
	 driver.findElement(By.id("ap_customer_name")).sendKeys("Raajii");
	 driver.findElement(By.id("ap_phone_number")).sendKeys("9836742345");
	 driver.findElement(By.id("ap_email")).sendKeys("Raajii@gmail.com");
	 driver.findElement(By.id("ap_password")).sendKeys("RSK@123");
	 driver.findElement(By.id("continue")).click();
  }
  @AfterClass
  public void afterclass()
  {
	  driver.quit();
  }
  
}

