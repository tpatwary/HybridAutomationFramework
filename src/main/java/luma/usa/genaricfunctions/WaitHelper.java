package luma.usa.genaricfunctions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import luma.usa.BasePage.SuperClass;

public class WaitHelper extends SuperClass{
	
	// How to write webdriver wait & 
	// single element
	public static void seleniumWait(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}
	
	// for multiple elements
	public static void waitUntilVisibelityOfElements(List<WebElement> ele) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElements(ele));
	}

}
