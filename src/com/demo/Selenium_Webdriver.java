package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class Selenium_Webdriver {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_Testig\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();  // upcastig 
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		 WebElement email = driver.findElement(By.id("email"));
			email.sendKeys("Velkanakj");
			WebElement pass = driver.findElement(By.name("pass"));
			pass.sendKeys("PASSWORD251");
			boolean edisp = email.isDisplayed();
			System.out.println("Email is Displayed    :"+ edisp);// concadination
			boolean disp = pass.isDisplayed();
	    	System.out.println("Password is Displayed :" + disp);	
		    boolean emailenb = email.isEnabled();
		    System.out.println("Email is enabled      :"+emailenb);
		    boolean enabled = pass.isEnabled();
		    System.out.println("Password is enabled   :"+enabled);
		    boolean emailselect = email.isSelected();
		    System.out.println("Email is selected     :"+ emailselect);
		    boolean selected = pass.isSelected();
		    System.out.println("Password is selected  :"+ selected);
		   // driver.findElement(By.name("login")).click();
		    driver.get("https://www.google.com/");
		    driver.manage().window().maximize();
		    
		    WebElement goo = driver.findElement(By.name("q"));
		    goo.sendKeys("www.youtube.com");
		    driver.findElement(By.name("btnK")).click();
		    
	        
	        
	}
 
	
	
}
