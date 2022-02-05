package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frames_Class {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Testig\\Driverr\\chromedriver.exe");		
		ChromeOptions ve = new ChromeOptions();
		ve.addArguments("incognito");
		WebDriver driver = new ChromeDriver(ve);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame("singleframe");
//	WebElement singleframe = driver.findElement(By.id("singleframe"));
//	driver.switchTo().frame("singleframe");
		WebElement text = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		text.sendKeys("Frameclass");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		WebElement multiframe = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		multiframe.click();
		WebElement outerframe = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(outerframe);
		WebElement innerframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(innerframe);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("multiframe");
//driver.switch().parentFrame(); // (option)
		driver.switchTo().defaultContent();
		WebElement video = driver.findElement(By.xpath("//a[text()='Video']"));
		video.click();

		
		
		
		
	}
}
