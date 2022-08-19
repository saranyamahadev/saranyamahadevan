package org.shop;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Avengars {
	
	//Locators(xpath) , sendKeys , text , Debug , Xpath contains , getText , getAttribute , mouseOver action , drag and drop
	
	//scrolldown And scrollup , Alerts , Robot class , contextClick , doubleClick
   
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\SeleniumProject\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		driver.manage().window().maximize();
		
		JavascriptExecutor J = (JavascriptExecutor)driver;
		
		WebElement Down = driver.findElement(By.xpath("//footer[@class='container  footer']"));
		J.executeScript("arguments[0].scrollIntoView(true)", Down);
		
		WebElement Bank = driver.findElement(By.xpath("//input[@onclick='return fLogon()']"));
		
		String B1 = Bank.getAttribute("class");
		System.out.println(B1);
		
		Bank.click();
		
		Alert A = driver.switchTo().alert();
		
		String Letter = A.getText();
		System.out.println(Letter);
		
		Thread.sleep(1000);
		
		A.accept();
		
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		
		Actions AC = new Actions(driver);
		
		WebElement drag = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
		WebElement drop = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		AC.dragAndDrop(drag, drop).perform();
		
		WebElement drag1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		
		WebElement drop1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		AC.dragAndDrop(drag1, drop1).perform();
		
		driver.navigate().to("http://www.greenstechnologys.com/");
		
		WebElement down1 = driver.findElement(By.xpath("//p[text()='We undertake ']"));
		J.executeScript("arguments[0].scrollIntoView(true)", down1);
		
		Thread.sleep(2000);
		
		WebElement down2 = driver.findElement(By.xpath("//a[text()='COURSES']"));
		J.executeScript("arguments[0].scrollIntoView(false)", down2);
		
		WebElement ac1 = driver.findElement(By.xpath("//p[contains(text(),'undertake')]"));
		String ac2 = ac1.getText();
		System.out.println(ac2);
		
		WebElement courses = driver.findElement(By.xpath("//a[text()='COURSES']"));
		AC.moveToElement(courses).perform();
		
		WebElement oracle = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		AC.moveToElement(oracle).perform();
		
		WebElement sql = driver.findElement(By.xpath("//span[text()='SQL Certification']"));
		AC.moveToElement(sql).click().perform();	
		
		driver.navigate().to("http://adactinhotelapp.com/");
		
		WebElement adactin = driver.findElement(By.id("username"));
		adactin.sendKeys("premkumarcello@gmail.com");
		AC.doubleClick(adactin).perform();
		
		Robot R = new Robot();
		
		R.keyPress(KeyEvent.VK_CONTROL);
		R.keyPress(KeyEvent.VK_A);
		R.keyRelease(KeyEvent.VK_A);
		R.keyRelease(KeyEvent.VK_CONTROL);
		
		AC.contextClick(adactin).perform();
		
		for (int i = 0; i <=2; i++) {
			R.keyPress(KeyEvent.VK_DOWN);
			R.keyRelease(KeyEvent.VK_DOWN);
		}
		
     	R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		
		R.keyPress(KeyEvent.VK_TAB);
		R.keyRelease(KeyEvent.VK_TAB);
		
		R.keyPress(KeyEvent.VK_CONTROL);
		R.keyPress(KeyEvent.VK_V);
		R.keyRelease(KeyEvent.VK_V);
		R.keyRelease(KeyEvent.VK_CONTROL);
		
		driver.findElement(By.id("login")).click();
		
		driver.navigate().to("https://en.wikipedia.org/wiki/Software_testing");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

