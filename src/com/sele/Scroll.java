package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Testig\\Driverr\\chromedriver.exe");				
		ChromeOptions ve = new ChromeOptions(); 
		ve.addArguments("incognito");
		WebDriver driver = new ChromeDriver(ve);
		driver.manage().window().maximize();
		// driver.get("https://www.amazon.in/");
		driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		WebElement endpage = driver.findElement(By.xpath("//a[text()=' Privacy Policy']"));
		JavascriptExecutor v = (JavascriptExecutor) driver;
		v.executeScript("arguments[0].scrollIntoView();", endpage);
		Thread.sleep(3000);
		WebElement startingpage = driver.findElement(By.id("client-logo"));
		v.executeScript("arguments[0].scrollIntoView();", startingpage);
		Thread.sleep(3000);
		v.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(3000);
		v.executeScript("window.scrollBy(0,-1000)");
		driver.quit();

		
		
		
//	WebElement logo = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
//JavascriptExecutor jr = (JavascriptExecutor) driver;  // narrowing method
//
//jr.executeScript("arguments[0].scrollIntoView();", logo);
//Thread.sleep(3000);
//jr.executeScript("window.scrollBy(0,-4000)");
//Thread.sleep(3000);
//jr.executeScript("window.scrollBy(0,1000)");
//Thread.sleep(3000);
	}
}
