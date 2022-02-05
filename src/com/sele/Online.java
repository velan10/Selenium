package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Online {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Testig\\Driverr\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	//WebDriver driver = new FirefoxDriver()
	//Firefox is(gecko driver)
	
	
	
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("velanvelli"+Keys.ENTER);	
	
WebElement f = driver.findElement(By.xpath("(//a[@role='button'])[2]"));	
f.click();	
	//driver.findElement(By.);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
