package com.demo;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Online {
public static void main(String[] args) throws InterruptedException, AWTException {

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Testig\\Driverr\\chromedriver.exe");				
	ChromeOptions ve = new ChromeOptions(); 
	ve.addArguments("incognito");
	WebDriver driver = new ChromeDriver(ve);
	driver.manage().window().maximize();
	
	/**
	//driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
//	driver.findElement(By.linkText("Go to Home Page")).click();
//	WebElement d = driver.findElement(By.id("email"));
//	d.sendKeys("VICKY");
//	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input")).sendKeys("Chlm");
//	driver.findElement(By.name("username")).getText();
//	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).clear();
//	
//	WebElement dd = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
//boolean de = dd.isEnabled();
//System.out.println("Is Enabled : "+de);

	//String value = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input")).getAttribute("value");
	//System.out.println(value);
	
	**/
	//*************-------------------BUTTONS---------***************
	/**
	driver.get("http://www.leafground.com/pages/Button.html");
	WebElement xyposition = driver.findElement(By.id("position"));
org.openqa.selenium.Point xypoint = xyposition.getLocation();	
int x = xypoint.getX();
int y = xypoint.getY();
System.out.println("The X Axis is : "+x+"\n"  +"The y Axis is : "+y);
WebElement df = driver.findElement(By.xpath("//*[@id=\"color\"]"));
String color = df.getCssValue("background-color");
System.out.println("Th color is : "+color);
WebElement ee = driver.findElement(By.xpath("//*[@id=\"size\"]"));
Dimension size = ee.getSize();
System.out.println("The Size is :"+size);
**/
//-----------------------------------------ListBoxes-------------------------

//	/**
	
	driver.get("http://www.leafground.com/pages/Dropdown.html");
	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
Select drop = new Select(dropdown);
drop.selectByIndex(2);
Thread.sleep(3000);
drop.selectByValue("3");
Thread.sleep(3000);
drop.selectByVisibleText("Loadrunner");
Thread.sleep(3000);
List<WebElement> list = drop.getOptions();
int i = list.size();
System.out.println(i);
List<WebElement> options = drop.getAllSelectedOptions();
System.out.println(options);

//**/

Select jh = new Select(dropdown);
Robot j = new Robot();

List<WebElement> findElements = driver.findElements(By.xpath(""));
WebElement velan = driver.findElement(By.xpath("//*[@id=\\\"contentblock\\\"]/section/div[6]/select"));
Class<? extends WebElement> class1 = velan.getClass();
String cssValue = velan.getCssValue("");
org.openqa.selenium.Point location = velan.getLocation();
Rectangle rectangle = velan.getRect();
//velan.getScreenshotAs("00cfd","dddd");
Dimension size = velan.getSize();
String tagName = velan.getTagName();
int hashCode = velan.hashCode();
boolean displayed = velan.isDisplayed();
boolean enabled = velan.isEnabled();
boolean selected = velan.isSelected();
String string = velan.toString();
WebElement element = driver.findElement(By.xpath("//*[@id=\\\"contentblock\\\"]/section/div[6]/select"));
element.sendKeys("velan"+Keys.ENTER);

}	
}
