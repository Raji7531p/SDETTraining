package com.myfirstmavenproject.junit;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class demo {
  
	WebDriver driver;
	 @BeforeClass
public void beforeClass()
{
	 WebDriverManager.chromedriver().setup();

	  driver = new ChromeDriver();
}
	
	  
	  public void test1() throws InterruptedException, AWTException, IOException {
		 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); //throughout the script a common wait
		  
		  driver.get("https://www.leafground.com/messages.xhtml;jsessionid=node01xov5jrdmas4414eo7ir0lz18b376396.node0");
		  
		  }  
		
		
	  }		
		  
	


	