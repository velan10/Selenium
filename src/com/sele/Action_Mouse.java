package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Action_Mouse {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Testig\\Driverr\\chromedriver.exe");
		ChromeOptions ve = new ChromeOptions();
		ve.addArguments("incognito");
		WebDriver driver = new ChromeDriver(ve);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		Actions a = new Actions(driver);
		WebElement Women = driver.findElement(By.xpath("//a[@title='Women']"));
		a.moveToElement(Women).build().perform();
		Thread.sleep(3000);
		WebElement Dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		a.moveToElement(Dresses).build().perform();
		Thread.sleep(3000);
		WebElement SummerDress = driver.findElement(By.xpath("(//a[text()='Summer Dresses'])[2]"));
		a.click(SummerDress).build().perform();

//		Thread.sleep(2000);
//        a.moveToElement(Women).build().perform();

        
        
	}
}
