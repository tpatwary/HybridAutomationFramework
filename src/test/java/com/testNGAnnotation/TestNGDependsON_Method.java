package com.testNGAnnotation;

import org.testng.annotations.Test;

public class TestNGDependsON_Method {
	@Test
	public void getmethod1() {
		System.out.println(" Browser will open ");
	}

	@Test(dependsOnMethods = { "getmethod1" })
	public void getmethod2() {
		System.out.println(" Successfully login the application ");
	}

	@Test(dependsOnMethods = { "getmethod2" })
	public void getmethod3() {
		System.out.println(" Expected & Actual Matching ");
	}

}
