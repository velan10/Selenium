package com.sele;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mini_Project {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Testig\\Driverr\\chromedriver.exe");				
		ChromeOptions ve = new ChromeOptions();
		ve.addArguments("incognito");
		WebDriver driver = new ChromeDriver(ve);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions v = new Actions(driver);
		WebElement Signin = driver.findElement(By.xpath("//a[@class='login']"));
		v.moveToElement(Signin).build().perform();
		v.click(Signin).build().perform();
		driver.findElement(By.id("email")).sendKeys("velanvelli@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Velan@1995");
		WebElement email_signin = driver.findElement(By.xpath("//input[@id='passwd']//following::button[1]"));
		email_signin.click();
		WebElement tshirt = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]//following::a[text()='T-shirts']"));
		tshirt.click();
		JavascriptExecutor vs = (JavascriptExecutor) driver;
		vs.executeScript("window.scrollBy(0,700)");
		driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]")).click();
		WebElement frames = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(frames);
		WebElement cart = driver.findElement(By.name("Submit"));
		cart.click();
		driver.switchTo().defaultContent();
		// Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		driver.findElement(By.name("processAddress")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("cgv")).click();
		driver.findElement(By.name("processCarrier")).click();
		WebElement payment = driver.findElement(By.xpath("//a[@class='cheque']"));
		payment.click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		vs.executeScript("window.scrollBy(0,500)");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Testig\\Screenshot\\Mini-Project.png");
		FileUtils.copyFile(source, destination);

	}
}
