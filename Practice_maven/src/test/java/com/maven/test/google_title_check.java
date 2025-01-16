package com.maven.test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class google_title_check {
	
	
		
		
	   private WebDriver driver;

	   @BeforeClass
	   public void setUp() {
	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sapient-tester\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	       driver = new ChromeDriver();
	}

	@Test
	public void testGoogleTitle() {
	    driver.get("https://www.google.com");
	    String title = driver.getTitle();
	    assert title.equals("Google");
	}

	@AfterClass
	public void tearDown() {
	    driver.quit();
	}
}
