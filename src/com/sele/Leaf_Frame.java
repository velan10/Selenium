package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Leaf_Frame {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Testig\\Driverr\\chromedriver.exe");			
	ChromeOptions ve = new ChromeOptions();
	ve.addArguments("incognito");
	WebDriver driver = new ChromeDriver(ve);
	driver.manage().window().maximize();
	driver.get("http://testleaf.herokuapp.com/pages/frame.html");
	WebElement singleframe = driver.findElement(By.xpath("(//iframe)[1]"));
	driver.switchTo().frame(singleframe);
	driver.findElement(By.xpath("//button[@id='Click']")).click();
	driver.switchTo().defaultContent();
	//Thread.sleep(3000);
	WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='page.html']"));
	driver.switchTo().frame(outerframe);
	WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='nested.html']"));
	driver.switchTo().frame(innerframe);
	driver.findElement(By.xpath("//*[@id=\"Click1\"]")).click();
	driver.switchTo().parentFrame();
	Thread.sleep(3000);
	driver.navigate().refresh();
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
}
}
