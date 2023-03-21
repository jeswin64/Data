package com.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {

	
	public static WebDriver driver;

	public static void getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\Project_Maven\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	

	public static void maxi() {
		driver.manage().window().maximize();
	}
	

	public static void getUrl(String a) {
		driver.get(a);
	}
	

	public static void inputValue(WebElement b, String c) {
		b.sendKeys(c);
	}
	

	public static void screenShot(String e) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Project_Maven\\screenshot\\" + e);
		FileUtils.copyFile(from, to);

	}

	public static void clickOnElement(WebElement d) {
		d.click();
	}
    
    	 public static void navigate() {
    		 driver.navigate().to("https://www.flipkart.com/");
			
		}
    	 
	}
    	
			
		
    	 
    	 
    	 
    	 
   
		
	

