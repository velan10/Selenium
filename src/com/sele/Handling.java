package com.sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Handling {
	public static void main(String[] args) throws AWTException  {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Testig\\Driverr\\chromedriver.exe");
		ChromeOptions ve = new ChromeOptions();
		ve.addArguments("incognito");
		WebDriver driver = new ChromeDriver(ve);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		WebElement Fashion = driver.findElement(By.xpath("//a[text()='Fashion']"));
		Actions ds = new Actions(driver);
		ds.contextClick(Fashion).build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		ds.contextClick(mobiles).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement Electronics = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		ds.contextClick(Electronics).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Set<String> all_tabs = driver.getWindowHandles();
		for (String id : all_tabs) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
		}
		String current_tab = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		for (String id : all_tabs) {
			if (driver.switchTo().window(id).getTitle().equals(current_tab)) {
				break;
//continue;
			} else {
				driver.close();
			}

		}

	}
}
