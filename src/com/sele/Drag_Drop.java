package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Testig\\Driver\\chromedriver.exe");
	ChromeOptions ve = new ChromeOptions();
	ve.addArguments("incognito");
	WebDriver driver = new ChromeDriver(ve);
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/pages/drop.html");
	WebElement From = driver.findElement(By.id("draggable"));
	WebElement To = driver.findElement(By.id("droppable"));
	Actions a = new Actions(driver);
	a.dragAndDrop(From, To).build().perform();
}
}
