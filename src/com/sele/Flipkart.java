package com.sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Testig\\Driverr\\chromedriver.exe");
			ChromeOptions ve = new ChromeOptions();
	ve.addArguments("incognito");
	WebDriver driver = new ChromeDriver(ve);
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Actions a = new Actions(driver);
	
//	driver.findElement(By.xpath("(//button)[2]")).click();
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("velanvelli@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("velanvelli.10");
driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
Thread.sleep(3000);
WebElement Home = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[6]"));
a.moveToElement(Home).build().perform();
//a.clickAndHold(Home).build().perform();

Thread.sleep(2000);
//Actions a = new Actions(driver);
Alert alert = driver.switchTo().alert();
//a.moveToElement();	
Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);






}
}
