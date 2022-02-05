package com.demo;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FileUtilsTestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Screenshot_Class {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Testig\\Driver\\chromedriver.exe");	
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("incognito");
		WebDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        WebElement fs = driver.findElement(By.xpath("//input[@type='email']"));
		fs.sendKeys("Velanvelli@gmail.com");
		driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[1]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
//		username.sendKeys("velanvelli@gmail.com");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Velan@1995");
//		driver.findElement(By.xpath("//button[@value='1']")).click();
//		Thread.sleep(6000);
//		TakesScreenshot picks = (TakesScreenshot) driver;
//		File scfile = picks.getScreenshotAs(OutputType.FILE);
//		File destfile = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Testig\\Screenshot\\snap1.png");
//		FileUtils.copyFile(scfile, destfile);


}
}