package org.logout1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extra {
	static WebDriver driver;

	@BeforeClass
	public static void Beforeclass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");

	}

	@AfterClass
	public static void Afterclass() {
		driver.quit();
	}

	@org.junit.Before
	public void Before() {
		long start = System.currentTimeMillis();
		System.out.println(start);
	}

	@org.junit.After

	public void After() {
		long end = System.currentTimeMillis();
		System.out.println(end);
	}

	@Test
	public void login() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Naveen53");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("C1IZAU");
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}
}
