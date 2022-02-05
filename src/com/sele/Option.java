package com.sele;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class Option {
public static void main(String[] args) throws IOException, InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Testig\\Driverr\\chromedriver.exe");	
ChromeOptions ch = new ChromeOptions();
ch.addArguments("incognito");
WebDriver driver = new ChromeDriver(ch);
driver.manage().window().maximize();
driver.get("https://www.rediff.com/");
driver.findElement(By.xpath("//a[text()='Create Account']")).click();
Thread.sleep(4000);
 driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("VELLIVELAN");
 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Velan10");
driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("velanvelli@gmail.com");
driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("9840509705");
driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Velan.444");
driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Velan.444");
WebElement date = driver.findElement(By.xpath("(//select[contains(@name,'DOB')])[1]"));
Select s = new Select(date);
s.selectByValue("10");
WebElement month = driver.findElement(By.xpath("(//select[contains(@name,'DOB')])[2]"));
Select s1 = new Select(month);
s1.selectByIndex(3);
WebElement year = driver.findElement(By.xpath("(//select[contains(@name,'DOB')])[3]"));
Select s2 = new Select(year);
s2.selectByVisibleText("2019");
boolean multi = s.isMultiple();
System.out.println(multi);
List<WebElement> op = s.getOptions();
for (WebElement webElement : op) {
	String text = webElement.getText();
	System.out.print(text);
}
List<WebElement> m = s1.getOptions();
for (WebElement webElement : m) {
	//String mtext = webElement.getText();
System.out.println(webElement.getText());
}
System.out.println("----------------------------------------");
WebElement first = s2.getFirstSelectedOption();
System.out.println(first.getText());
WebElement second = s1.getFirstSelectedOption();
System.out.println(second.getText());

















}
	
	
	
	
}
