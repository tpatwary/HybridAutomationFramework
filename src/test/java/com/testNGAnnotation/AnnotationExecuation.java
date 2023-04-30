package com.testNGAnnotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationExecuation {
	@BeforeMethod
	public void openBrowser() {
		System.out.println("Browser will open");
	}

	@AfterMethod
	public void closeBrowser() {
		System.out.println("Browser will close");
	}

	@Test
	public void getTest1() {
		System.out.println("Test1 will execuated");
	}

	@Test
	public void getTest2() {
		System.out.println("Test2 will execuated");
	}
}
