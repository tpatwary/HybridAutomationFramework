package com.testNGAnnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallalTesting {
	WebDriver driver;

	@Test
	public void getOpenBrowserNode1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		System.out.println("getOpenBrowserNode1");
	}

	@Test
	public void getOpenBrowserNode2() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		System.out.println("getOpenBrowserNode2");
	}

	@Test
	public void getOpenBrowserNode3() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		System.out.println("getOpenBrowserNode3");
	}

	@Test
	public void getOpenBrowserNode4() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		System.out.println("getOpenBrowserNode4");
//		driver.close();
	}

}
