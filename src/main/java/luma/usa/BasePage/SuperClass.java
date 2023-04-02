package luma.usa.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class SuperClass {
	public static WebDriver driver;
	public void initialization() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		
		driver.navigate().to("https://magento.softwaretestingboard.com/");
		//driver.get("https://magento.softwaretestingboard.com/");
		
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("email")).sendKeys("tahiya04@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("test1234@");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='send2']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.id("send2")).click();
		
	
		
	}

}
