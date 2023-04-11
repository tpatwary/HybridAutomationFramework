package luma.usa.genaricfunctions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import luma.usa.BasePage.SuperClass;

public class CommonMethods extends SuperClass {

	public static void HoverOver(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).build().perform();
	}

	public static void actionClick(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.click(ele).build().perform();
	}
	
	public static void jsClick(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
	}
	// How to handle the drop down menu
	//Ans: I can handle many way 
	// A. By using select class 
	// B. By suing list interface
	
	
	public static void dropdownMenu(WebElement ele, String text) {
		Select se = new Select(ele);
		//se.selectByVisibleText(text);
		//se.selectByIndex(43);
		se.selectByValue("43");
		
	}
}
