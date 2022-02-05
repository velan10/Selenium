package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium_Sample {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_Testig\\Driver\\chromedriver.exe");
		 ChromeOptions ch = new ChromeOptions();
		 ch.addArguments("incognito");
		 WebDriver driver = new ChromeDriver(ch);  // upcastig 
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
//	WebElement aa = driver.findElement(By.id("twotabsearchtextbox"));
//	aa.sendKeys("Mobiles latest ");
//	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//	driver.navigate().to("https://www.amazon.in/s?k=mobile+latest&crid=2YQF46VY1M07Y&sprefix=mobile+latest%2Caps%2C279&ref=nb_sb_noss_1");
//	driver.findElement(By.xpath("//span[text()='Samsung']")).click();
//	driver.navigate().to("https://www.amazon.in/Samsung-Galaxy-M12-Storage-Processor/dp/B08XJCMGL7/ref=sr_1_4?crid=2YQF46VY1M07Y&dchild=1&keywords=mobile+latest&qid=1635505622&refinements=p_89%3ASamsung&rnid=3837712031&s=electronics&sprefix=mobile+latest%2Caps%2C279&sr=1-4");
//	
	
	
	}
}
