package luma.usa.genaricfunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import luma.usa.BasePage.SuperClass;

public class WaitHelper extends SuperClass{
	
	// 
	public static void seleniumWait(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}

}
