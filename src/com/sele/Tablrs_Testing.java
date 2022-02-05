package com.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tablrs_Testing {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Testig\\Driverr\\chromedriver.exe");			
	ChromeOptions ve = new ChromeOptions();
	ve.addArguments("incognito");
	WebDriver driver = new ChromeDriver(ve);
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/pages/table.html");
	System.out.println("                    Particular Column                  ");
	List<WebElement> td3 = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
	for (WebElement column : td3) {
		String columns = column.getText();
		System.out.println(columns);
	}
	System.out.println("                    Particular Rows                     ");
	List<WebElement> tr2 = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
	for (WebElement row : tr2) {
		String rows = row.getText();
		System.out.println(rows);
	}
	System.out.println();
	System.out.println("               COUNTS OF ROWS AND COLUMN ");
	
	List<WebElement> column_count = driver.findElements(By.xpath("//table/tbody/tr/th"));
			int size = column_count.size();
	System.out.println("Column Count"+" : "+size);
	
	List<WebElement> rows_count = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
	int rowcount = rows_count.size();
	System.out.println("Rows Count "+" : "+rowcount);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	driver.quit();
	
}
}
