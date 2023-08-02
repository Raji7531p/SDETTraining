package com.myfirstmavenproject.junit;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DEMO19july {
	
	WebDriver driver;
	@BeforeClass
	public void beforeClass() {
		
		 WebDriverManager.chromedriver().setup(); 
		 driver=new ChromeDriver();
		
	}
        @Test
		public void Test1()  {
			
        	driver.get("https://www.globalsqa.com/demo-site/tooltip/");
        	
        	JavascriptExecutor js=(JavascriptExecutor) driver;
        	
        	js.executeScript("scroll(0, 750)");
        	
        	driver.manage().window().maximize();
        	
        	String toolTip=driver.findElement(By.xpath("//*[@src=\"images/st-stephens.jpg\"]")).getAttribute("alt");
        	
        	System.out.println(toolTip);
        	
        	
        }
        	
        	}


        