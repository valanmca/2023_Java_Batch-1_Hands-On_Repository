package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class MySeleniumTestRunner {
                 WebDriver  driver;
                 @BeforeClass
                 public void initializeDriver(){
              	System.setProperty("webdriver.chrome", "drivers/chromedriver.exe");
                 	driver =new ChromeDriver();
                 }                 
	//To open google.com in a chrome browser
          @Test      
        public void loadGooglePage(){
        	driver.navigate().to("https://www.google.com/");
        }
	//Search Java Tutorial
             
          @Test      
        public void searchTutorial() {
        	driver.findElement(By.name("q")).sendKeys("Java Tutorial");
        	driver.findElement(By.name("btnK")).submit();
        	System.out.println(driver.getTitle());

        }     
	//open Tutorials point
          @Test      
        public void openTutorialsPoint() {
        	driver.findElements(By.tagName("h3")).get(2).click();
        	//driver.findElement(By.partialLinkText("https://www.tutorialspoint.com")).click();
        	System.out.println(driver.getTitle());
        	
        }
//	//Identify "Java Hello World" page
//          @Test      
//        public void openHelloWorld() {
//        	driver.findElements(By.tagName("li")).get(3).click();
//        	System.out.println(driver.getTitle());	
//        }  
          
	//Close the browser
          @AfterClass           
        public void close() {
        	driver.quit();
        }
//	public static void main(String[] args) {
//		MySeleniumTestRunner obj=new MySeleniumTestRunner();
//		obj.loadGooglePage();
//		obj.searchTutorial();
//        obj.openTutorialsPoint();
//        obj.openHelloWorld();
//	}
}
