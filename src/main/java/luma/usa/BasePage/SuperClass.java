package luma.usa.BasePage;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuperClass {
	public static WebDriver driver;
	public static Properties prop;
	public static Logger log;
	
	// 1st- Inside the parents class we have to create two objects Properties and another one is logger
	// 2nd- we have to create a constructor bc constructor invoke implicitly. so we dont need to call the logger. 
	// 3rd- We have write  Logger.getLogger (pass the arguments inside the ())
	// 4th- Then write down PropertyConfigurator.configure("log4J.properties");
	// 5th- Then we have to write down all the steps based on test cases. 
	// Then whenever we run its generate the reports inside the log folder.
	
	public SuperClass() {
		
		log = Logger.getLogger("QA Lead::");
		PropertyConfigurator.configure("log4J.properties");
	}
	
	
	public void initialization() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		log.info(">>>>> Automation Start with Chrome Browser <<<<< ");
		
		driver.navigate().to("https://magento.softwaretestingboard.com/");
		// driver.get("https://magento.softwaretestingboard.com/");

	}

}
