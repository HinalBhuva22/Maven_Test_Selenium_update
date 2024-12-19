package com.maven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class page_title {
	
	public static void main(String[] args)  {
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://situational-data.softwarecompanyindia.com/dashboard");
	driver.manage().window().maximize();

	WebElement element = driver.findElement(By.id("root"));
	element.click();
	String pageTitle = driver.getTitle();
	
	System.out.println("Page Title: " + pageTitle);
	
	
  System.out.println("successfull");
  
  
	

}
}
