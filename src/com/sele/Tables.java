package com.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tables {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Testig\\Driverr\\chromedriver.exe");
				ChromeOptions ve = new ChromeOptions();
		ve.addArguments("incognito");
		WebDriver driver = new ChromeDriver(ve);
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		List<WebElement> all_data = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement tr_td : all_data) {
			String text = tr_td.getText();
			System.out.println(text);
		}
		System.out.println("                    Particular Rows                     ");
		List<WebElement> tr2 = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
		for (WebElement row : tr2) {
			String rows = row.getText();
			System.out.println(rows);
		}
		System.out.println("                    Particular Column                  ");
		List<WebElement> td3 = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		for (WebElement column : td3) {
			String columns = column.getText();
			System.out.println(columns);
		}
		System.out.println("                     Selected values                  ");
		WebElement r3d4 = driver.findElement(By.xpath("//table/tbody/tr[3]/td[4]"));
		String text1 = r3d4.getText();
		System.out.println(text1);
		System.out.println("                     Table Titles                        ");
		List<WebElement> tltles = driver.findElements(By.xpath("//table/tbody/tr/th"));
		for (WebElement headtopics : tltles) {
			String topic = headtopics.getText();
			System.out.println(topic);
		}
		
		
		
		driver.quit();
	}
}
