package com.testng.selenium.v1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumtestngtest {
	WebDriver driver;

	@BeforeTest
	public void initDriver() {
//		String path = System.getProperty("user.dir") + File.separator + "driver" + File.separator + "chromedriver-2";
//		System.setProperty("webdriver.chrome.driver", path);
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}

	@Test
	public void firstTest() {
		driver.get("https://www.bstackdemo.com/");
		System.out.println("Browser launched successfully");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
