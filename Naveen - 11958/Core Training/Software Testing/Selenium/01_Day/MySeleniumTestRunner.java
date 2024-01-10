package com.test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MySeleniumTestRunner {
	WebDriver driver;
	
	@BeforeClass
	public void initializer() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	// To open google.com in a chrome browser
	
	@Test
	public void loadGooglePage() {
		//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		//driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
	}

	// Search Java Tutorial
	@Test
	public void searchTutorial() {
		driver.findElement(By.name("q")).sendKeys("Java Tutorial");
		// driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.name("btnK")).submit();
		System.out.println(driver.getTitle());
	}

	// open Tutorials point
	@Test
	public void openTutorialsPoint() {
		// driver.findElements(By.tagName("h3")).get(2).click();
		driver.findElement(By.partialLinkText("https://www.tutorialspoint.com")).click();
		System.out.println(driver.getTitle());
	}

	// Identify "Java Hello World" page
//		public void openHelloWorld() {
//			driver.findElement(By..click();
//			System.out.println(driver.getTitle());
//		}

	// Close the browser
	@AfterClass
	public void close() {
		driver.close(); // only closes current window.
		driver.quit(); // closes all browser windows.
	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * MySeleniumTestRunner obj = new MySeleniumTestRunner(); obj.loadGooglePage();
	 * obj.searchTutorial(); obj.openTutorialsPoint(); }
	 */

}
