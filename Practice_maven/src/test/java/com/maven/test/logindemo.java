package com.maven.test;

import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class logindemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		// WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://zukeepr.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/header/div/div[1]/div/a")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/header/div/div[2]/div[2]/a")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	driver.findElement(By.name("user_email")).sendKeys("pmytest@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("12345");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/header/div/div[1]/div/a[3]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div/main/div/div[2]/div/div[2]/div[1]/div/div[1]/div/button/span/span[2]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement ele = driver.findElement(By.xpath("//input[@placeholder='Enter first name']"));
		
		
		ele.clear();
		
		

	 
		ele.sendKeys("Meera");  // Entering a new name
		
		driver.findElement(By.xpath("//button[span/span[text()='Save']]")).click();
	  
	  

	
		System.out.println("Successfully removed 'Payal' and entered the new name 'Meera'.");
	System.out.println("successfull");
	
	

	}


	}


