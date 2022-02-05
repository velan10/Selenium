package com.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class MultiDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Testig\\Driverr\\chromedriver.exe");
		ChromeOptions ve = new ChromeOptions();
		ve.addArguments("incognito");
		WebDriver driver = new ChromeDriver(ve);
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/home.html");
		Thread.sleep(4000);
		WebElement openpage = driver.findElement(By.xpath("(//a[contains(@class,'wp')])[5]"));
		openpage.click();
		WebElement mul = driver.findElement(By.xpath("(//select)[6]"));
		Select s = new Select(mul);
		List<WebElement> options = s.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
		System.out.println("+++++++++++++++++++++++++++");
		s.selectByIndex(2);
		s.selectByValue("4");
		Thread.sleep(3000);
		s.selectByVisibleText("UFT/QTP");
		List<WebElement> all = s.getAllSelectedOptions();
		for (WebElement webElement : all) {
			System.out.println(webElement.getText());
		}
		//System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		s.deselectByIndex(2);
		Thread.sleep(3000);
		s.selectByIndex(1);
		s.deselectByVisibleText("UFT/QTP");
		System.out.println("----------------------------");
		List<WebElement> allOptions1 = s.getAllSelectedOptions();
		for (WebElement webElement : allOptions1) {
			String text = webElement.getText();
			System.out.println(text);
		}
		s.deselectAll();
		s.selectByValue("3");
		Thread.sleep(3000);
		System.out.println("*****************************");
		List<WebElement> options1 = s.getAllSelectedOptions();
		for (WebElement webElement : options1) {
			System.out.println(webElement.getText());
		}

//	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<");
//	WebElement first2 = s.getFirstSelectedOption();
//	String text = first2.getText();
//	System.out.println(text);
//
//

	}

}
