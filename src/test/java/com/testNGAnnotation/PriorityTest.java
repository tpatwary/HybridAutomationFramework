package com.testNGAnnotation;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority = 0)
	public void getmethod1() {
		System.out.println("Test 1");
	}

	@Test(priority = 3)
	public void getmethod2() {
		System.out.println("Test 2");
	}

	@Test(priority = 2)
	public void getmethod3() {
		System.out.println("Test 3");
	}

	@Test(priority = 1)
	public void getmethod4() {
		System.out.println("Test 4");
	}

	@Test(priority = 4)
	public void getmethod5() {
		System.out.println("Test 5");
	}

}
