package luma.usa.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import luma.usa.BasePage.SuperClass;

public class Hooks extends SuperClass {

	@Before
	public void setUp() {

		System.out.println("===Automation Start===");
		initialization();

	}

	@After
	public void tearDown() {
		System.out.println("===Automation Completed & Close the Browser ===");
		driver.quit();

	}

}
