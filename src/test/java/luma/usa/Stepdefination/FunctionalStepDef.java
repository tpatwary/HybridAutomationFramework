package luma.usa.Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;

import luma.usa.BasePage.SuperClass;

public class FunctionalStepDef extends SuperClass {

	@Given("user able to login the application")
	public void user_able_to_login_the_application() throws InterruptedException {
		initialization();
	}

	@When("user able to select Jackets from Men module")
	public void user_able_to_select_jackets_from_men_module() {
		
		// How to handle MouseHover
		Actions ac = new Actions(driver);
		WebElement Men_obj = driver.findElement(By.linkText("Men"));
		ac.moveToElement(Men_obj).build().perform();
		
		WebElement tops_obj = driver.findElement(By.linkText("Tops"));
		ac.moveToElement(tops_obj).build().perform();
		// action class click
		WebElement Jackets_obj = driver.findElement(By.linkText("Jackets"));
		ac.click(Jackets_obj).build().perform();
		
		
	
	}

	@When("user able to select a Jacket product's size, color, quantity")
	public void user_able_to_select_a_jacket_product_s_size_color_quantity() {

	}

	@When("user able to click add to cart button")
	public void user_able_to_click_add_to_cart_button() {

	}

	@When("user able to click on the shopping cart pop-up")
	public void user_able_to_click_on_the_shopping_cart_pop_up() {

	}

	@When("user able to click on the proceed to checkout")
	public void user_able_to_click_on_the_proceed_to_checkout() {

	}

	@When("user able to add shipping information")
	public void user_able_to_add_shipping_information() {

	}

	@When("user able to select shipping method radial button and click on next button")
	public void user_able_to_select_shipping_method_radial_button_and_click_on_next_button() {

	}

	@When("user able to click on the place order button")
	public void user_able_to_click_on_the_place_order_button() {

	}

	@Then("user able to verify the confirmation message {string}")
	public void user_able_to_verify_the_confirmation_message(String string) {

	}

}
