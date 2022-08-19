package org.shop;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lube {
	//Locators(xpath) , sendKeys , text , 
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\SeleniumProject\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@autocorrect='off']")).sendKeys("Amazon");
		
		Actions amazon = new Actions(driver);
		
		Thread.sleep(3000);
		
		WebElement a1 = driver.findElement(By.xpath("//span[text()='amazon']"));
		amazon.moveToElement(a1).perform();	
		a1.click();
		
		WebElement a2 = driver.findElement(By.xpath("//h3[text()='Amazon.in']"));
		amazon.moveToElement(a2).perform();
		a2.click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bick lube chain");
		
		Robot lubes = new Robot();
		
		lubes.keyPress(KeyEvent.VK_TAB);
		lubes.keyRelease(KeyEvent.VK_TAB);
		
		lubes.keyPress(KeyEvent.VK_ENTER);
		lubes.keyRelease(KeyEvent.VK_ENTER);
		
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		
		WebElement Down = driver.findElement(By.xpath("//img[@data-image-index='24']"));
		Js.executeScript("arguments[0].scrollIntoView(true)", Down);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//img[@data-image-index='24']")).click();
		
		WebElement Copy = driver.findElement(By.xpath("//input[@value='bike lube chain']"));
        amazon.doubleClick(Copy).perform();
        
		lubes.keyPress(KeyEvent.VK_CONTROL);
		lubes.keyPress(KeyEvent.VK_A);
		lubes.keyRelease(KeyEvent.VK_A);
		lubes.keyRelease(KeyEvent.VK_CONTROL);
		
		amazon.contextClick(Copy).perform();
		
		for (int i = 0; i <=2; i++) {
			lubes.keyPress(KeyEvent.VK_DOWN);
			lubes.keyRelease(KeyEvent.VK_DOWN);
			}
		
		lubes.keyPress(KeyEvent.VK_ENTER);
		lubes.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
