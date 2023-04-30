package com.testNGAnnotation;

import org.testng.annotations.Test;

public class InvocationCountTest { // same test cases will run multiple times
	@Test(invocationCount = 10)
	public void gettest() {
		System.out.println("Test will execuated");
	}

}
