package com.sele;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Error {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Testig\\Driverr\\chromedriver.exe");
		ChromeOptions ve = new ChromeOptions();
		ve.addArguments("incognito");
		WebDriver driver = new ChromeDriver(ve);
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/home.html");
		Thread.sleep(4000);
	driver.findElement(By.xpath("//img[@alt='Alert']")).click();
	WebElement simple = driver.findElement(By.xpath("(//button)[1]"));
	simple.click();
	Alert alert = driver.switchTo().alert();
	Thread.sleep(3000);
	String text = driver.switchTo().alert().getText();
	System.out.println("the Simple Alert is :" +text);
	alert.accept();
	System.out.println("---------------------------------");
	driver.findElement(By.xpath("(//button)[2]")).click();
	Alert alert2 = driver.switchTo().alert();
	String text1 = driver.switchTo().alert().getText();
	System.out.println("The Comfirm Alert is :"+text1);
	Thread.sleep(3000);
	alert2.accept();
	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	driver.findElement(By.xpath("(//button)[3]")).click();
	Alert alert3 = driver.switchTo().alert();
	String text2 = driver.switchTo().alert().getText();
	System.out.println("The Prompt Alert is :  "+text2);
	Thread.sleep(3000);
	alert3.sendKeys("Alert Errors");
	Thread.sleep(5000);
	//alert3.dismiss();
	alert3.accept();
	System.out.println("------------X-------------X------------X-----------");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}}
