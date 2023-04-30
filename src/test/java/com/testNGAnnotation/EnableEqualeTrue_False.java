package com.testNGAnnotation;

import org.testng.annotations.Test;

public class EnableEqualeTrue_False {
	@Test(enabled = true)
	public void getmethod1() {
		System.out.println("Test 1");
	}

	@Test(enabled = false)
	public void getmethod2() {
		System.out.println("Test 2");
	}

	@Test(enabled = false)
	public void getmethod3() {
		System.out.println("Test 3");
	}

	@Test(enabled = true)
	public void getmethod4() {
		System.out.println("Test 4");
	}

	@Test(enabled = false)
	public void getmethod5() {
		System.out.println("Test 5");
	}

}
