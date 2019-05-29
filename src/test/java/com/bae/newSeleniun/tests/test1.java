package com.bae.newSeleniun.tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 { 
	
	public static WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		}
	
	@After 
	public void teardonw() {
		driver.quit();
	}
	
	@Test
	public void methodTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		WebElement checkElement = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
		checkElement.sendKeys("cute kittens");
		checkElement = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/div/center/input[1]"));
		checkElement.click();
		checkElement = driver.findElement(By.xpath("//*[@id=\"dimg_8\"]"));
		checkElement.click();
		checkElement = driver.findElement(By.id("sWxStkhqTkPk8M:"));
		assertTrue(checkElement.isDisplayed());
		Thread.sleep(4000);
	}
} 
