package com.sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Prat {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Testig\\Driverr\\chromedriver.exe");				
ChromeOptions ve = new ChromeOptions(); 
ve.addArguments("incognito");
WebDriver driver = new ChromeDriver(ve);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//driver.get("https://www.facebook.com/");
//String title = driver.getTitle();
//System.out.println("The URL Title is :"+title);
//String url = driver.getCurrentUrl();
//System.out.println(url);
//driver.navigate().to("http://www.leafground.com/pages/Edit.html");
//driver.navigate().back();
//driver.navigate().forward();
//driver.navigate().refresh();
////driver.close();
//WebElement email = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div"));
//boolean b = email.isEnabled();
//System.out.println(b);
//WebElement click = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//boolean c = click.isEnabled();
//System.out.println(c);
//boolean d = click.isDisplayed();
//System.out.println(d);
//System.getProperty(key, def)
//driver.get("http://www.leafground.com/pages/radio.html");
driver.get("https://tnvelaivaaippu.gov.in/Empower/LoginAction.htm");
driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
driver.findElement(By.xpath("(//input[@type='radio'])[3]")).clear();
WebElement pass = driver.findElement(By.name("password"));
String text = pass.getText();
System.out.println(text);



}
}
