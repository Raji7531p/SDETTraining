package com.myfirstmavenproject.junit;
import java.awt.AWTException;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Openmrs {

	@Test
	  public void f() throws InterruptedException{
	 WebDriverManager.chromedriver().setup();
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	  driver.get("https://demo.openmrs.org/openmrs/login.htm");
	  
	  driver.findElement(By.id("username")).sendKeys("Admin");
	  
	  driver.findElement(By.name("password")).sendKeys("Admin123");
	  
	  driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/form/fieldset/ul/li[1]")).click();
	  
	  driver.findElement(By.id("loginButton")).click();
	  
	  Thread.sleep(4000);
	  
	 driver.findElement(By.linkText("Register a patient")).click();
	  
	  
	  // Patient name

	 
 driver.findElement(By.xpath("/html/body/div/div[3]/form/ul/li[1]/ul/li[1]/span")).click();
 
	
 
 driver.findElement(By.xpath("/html/body/div/div[3]/form/section[1]/div/fieldset[1]/div[1]/p[1]/input")).sendKeys("Harrypotterii");

	  driver.findElement(By.xpath("/html/body/div/div[3]/form/section[1]/div/fieldset[1]/div[1]/p[3]/input")).sendKeys("Harry");
	  
	  Thread.sleep(4000);
	  
	  driver.findElement(By.id("next-button")).click();
	  
	  Thread.sleep(5000);
 
	  //Gender
	  driver.findElement(By.xpath("/html/body/div/div[3]/form/section[1]/div/fieldset[2]/p/select/option[2]")).click();
	  driver.findElement(By.id("next-button")).click();
	  
	  //Birthdate
	 Thread.sleep(5000);
	 
	  driver.findElement(By.id("birthdateDay-field")).sendKeys("22");
	  
	  WebElement dropdown=driver.findElement(By.id("birthdateMonth-field"));
	  
	  Select select= new Select(dropdown);
	  
	  select.selectByVisibleText("October");

	  driver.findElement(By.id("birthdateYear-field")).sendKeys("1999");
	  
	  Thread.sleep(5000);
	  
	  driver.findElement(By.id("next-button")).click();
	  
	  Thread.sleep(5000);
	  
	  //Address       
      driver.findElement(By.id("address1")).sendKeys("Bham Bham Swamy Layout");
 
	  driver.findElement(By.id("cityVillage")).sendKeys("ATP");
	  
	  driver.findElement(By.id("stateProvince")).sendKeys("Andhra Pradesh");
	  
	  driver.findElement(By.id("country")).sendKeys("India");
	  
	  driver.findElement(By.id("postalCode")).sendKeys("515235");
	  
	  Thread.sleep(5000);
	  
	  driver.findElement(By.id("next-button")).click();
	  
	  Thread.sleep(5000);
	  
	//Phone Number
	 driver.findElement(By.name("phoneNumber")).sendKeys("9856428765");
	 
	  Thread.sleep(3000);
	  
	  driver.findElement(By.id("next-button")).click();
	  

	  Thread.sleep(2000);
	  
	//Relationship
	  WebElement patient=driver.findElement(By.id("relationship_type"));
	  
	 	  Select relationship= new Select(patient);
	 	  
	 	  relationship.selectByVisibleText("Sibling");
	 	  
	 	  driver.findElement(By.xpath("/html/body/div/div[3]/form/section[3]/div/fieldset/div/div/p[2]/input[1]")).sendKeys("Mahii");
	 	  
	 	  driver.findElement(By.id("next-button")).click();
	 	  
	 	  driver.findElement(By.id("submit")).click();
	 	  
	 	 Thread.sleep(10000);
	 	 
	 	  driver.findElement(By.xpath("/html/body/header/nav/div[1]/a/img")).click();
	 	  
	 	// Find Patient record
	 	  
	  driver.findElement(By.linkText("Find Patient Record")).click();
	  
	  //View the Patient by using search
	  driver.findElement(By.id("patient-search")).sendKeys("HarrypotteriiHarry");
	  
	 	  WebElement element=driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div/table/tbody/tr[1]/td[1]"));
	 	  
	 	  Actions action= new Actions(driver);
	 	  
	 	  action.doubleClick(element).perform();
	 	 
	 	  //Request Appointment
	 	 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[9]/div[2]/div/ul/li[5]/a/div/div[2]")).click();
	 	 
	 	  Thread.sleep(3000);
	 	  
	 	//Appointment Type
	  driver.findElement(By.id("appointment-type")).sendKeys("Surg");
	  
	 	  driver.findElement(By.xpath("/html/body/div/div[3]/div[4]/form/p[1]/ul/li[2]/a")).click();
	 	  
	 	  Thread.sleep(5000);
	 	
	 	  //save
	  driver.findElement(By.id("save-button")).click();
	 	 Thread.sleep(5000);
	 	 
		  //Logout
	 	//  driver.findElement(By.linkText("Logout")).click(); 

	
	  WebElement buttonLogout = driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[3]/a"));
	  buttonLogout.click();
	 
	}
}
	 
 
	  


	