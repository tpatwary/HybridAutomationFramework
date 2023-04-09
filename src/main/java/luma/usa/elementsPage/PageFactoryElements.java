package luma.usa.elementsPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import luma.usa.BasePage.SuperClass;
import luma.usa.genaricfunctions.CommonMethods;
import luma.usa.genaricfunctions.WaitHelper;

public class PageFactoryElements extends SuperClass { // "extends" from SuperClass java inheritance concept

	public PageFactoryElements() {
		PageFactory.initElements(driver, this); // this (current class property or elements) is java reserve keyword &
												// PageFactory.initElements coming from Selenium
												// PageFactoryElements is a constructor from java

	}

	// How we can store the webElemet

	@FindBy(linkText = "Sign In") // store all the webElemet by @FindBy annotation
	@CacheLookup // In order to find the cache memory so that my test cases performance will be
					// faster.

	private WebElement signInBtn; // WebElement we declare the locator object name ex: Clicking signInBtn

	public WebElement getSignInBtn() { // Encapsulation concept: private access modifier & getter method
		return signInBtn;
	}

	@FindBy(id = "email")
	@CacheLookup

	private WebElement EnterUserName;

	public WebElement getEnterUserName() {
		return EnterUserName;
	}

	@FindBy(id = "pass")
	@CacheLookup

	private WebElement EnterPassword;

	public WebElement getEnterPassword() {
		return EnterPassword;
	}

	@FindBy(xpath = "//button[@id='send2']")
	@CacheLookup

	private WebElement ClickOnSignBtn;

	public WebElement getClickOnSignBtn() {
		return ClickOnSignBtn;
	}

	@FindBy(linkText = "Men")
	@CacheLookup

	private WebElement SelectMenModule;

	public WebElement getSelectMenModule() {
		return SelectMenModule;
	}

	@FindBy(linkText = "Tops")
	@CacheLookup

	private WebElement SelectTopsFromMenModule;

	public WebElement getSelectTopsFromMenModule() {
		return SelectTopsFromMenModule;
	}

	@FindBy(linkText = "Jackets")
	@CacheLookup

	private WebElement SelectJacketFromMenModule;

	public WebElement getSelectJacketFromMenModule() {
		return SelectJacketFromMenModule;
	}

	@FindBy(xpath = "(//*[@Class='product-item-link'])[3]")
	@CacheLookup

	private WebElement SelectJupiterAll_WeatherTrainer;

	public WebElement getSelectJupiterAll_WeatherTrainer() {
		return SelectJupiterAll_WeatherTrainer;
	}

	@FindBy(xpath = "//*[@id='option-label-size-143-item-166']")
	@CacheLookup

	private WebElement SelectSize;

	public WebElement getSelectSize() {
		return SelectSize;
	}

	@FindBy(xpath = "//*[@id='option-label-color-93-item-53']")
	@CacheLookup

	private WebElement SelectColor;

	public WebElement getSelectColor() {
		return SelectColor;
	}

	//
	@FindBy(xpath = "//*[@id='qty']")
	@CacheLookup

	private WebElement SelectQuantity;

	public WebElement getSelectQuantity() {
		return SelectQuantity;
	}//

	@FindBy(xpath = "//*[@id='product-addtocart-button']")
	@CacheLookup

	private WebElement ClickOnAddtoCart;

	public WebElement getClickOnAddtoCart() {//
		return ClickOnAddtoCart;
	}

	@FindBy(linkText = "shopping cart")
	@CacheLookup

	private WebElement ClickShoppingCart;

	public WebElement getClickShoppingCart() {//
		return ClickShoppingCart;
	}

	@FindBy(xpath = "(//*[contains(text(),'Proceed to Checkout')])[2]")
	@CacheLookup

	private WebElement Proceed_to_Checkout;

	public WebElement getProceed_to_Checkout() {//
		return Proceed_to_Checkout;
	}

	//
	@FindBy(xpath = "//*[text()='New Address']")
	@CacheLookup

	private WebElement AddNewAddress;

	public WebElement getAddNewAddress() {//
		return AddNewAddress;
	}

	// ------------adding new shipping address
	@FindBy(xpath = "")
	@CacheLookup

	private WebElement EnterFirstName;

	public WebElement getEnterFirstName() {//
		return EnterFirstName;
	}

	@FindBy(xpath = "")
	@CacheLookup

	private WebElement EnterLastName;

	public WebElement getEnterLastName() {//
		return EnterLastName;
	}

	@FindBy(xpath = "")
	@CacheLookup

	private WebElement EnterCompanyName;

	public WebElement getEnterCompanyName() {//
		return EnterCompanyName;
	}

	@FindBy(xpath = "")
	@CacheLookup

	private WebElement EnterCustomerAddress;

	public WebElement getEnterCustomerAddress() {//
		return EnterCustomerAddress;
	}

	@FindBy(xpath = "")
	@CacheLookup

	private WebElement EnterCity;

	public WebElement getEnterCity() {//
		return EnterCity;
	}

	@FindBy(xpath = "")
	@CacheLookup

	private WebElement SelectState;

	public WebElement getSelectState() {//
		return SelectState;
	}

	@FindBy(xpath = "")
	@CacheLookup

	private WebElement EnterZipCode;

	public WebElement getEnterZipCode() {//
		return EnterZipCode;
	}

	@FindBy(xpath = "")
	@CacheLookup

	private WebElement SelectCountry;

	public WebElement getSelectCountry() {//
		return SelectCountry;
	}

	@FindBy(xpath = "")
	@CacheLookup

	private WebElement EnterPhoneNumber;

	public WebElement getEnterPhoneNumber() {//
		return EnterPhoneNumber;
	}

	@FindBy(xpath = "")
	@CacheLookup

	private WebElement ClickOnShiphere;

	public WebElement getClickOnShiphere() {//
		return ClickOnShiphere;
	}

	@FindBy(xpath = "")
	@CacheLookup

	private WebElement SelectShippingMethod;

	public WebElement getSelectShippingMethod() {//
		return SelectShippingMethod;
	}

	@FindBy(xpath = "")
	@CacheLookup

	private WebElement ClickNextBtn;

	public WebElement getClickNextBtn() {//
		return ClickNextBtn;
	}

	@FindBy(xpath = "")
	@CacheLookup

	private WebElement ClickPlaceOrder;

	public WebElement getClickPlaceOrder() {//
		return ClickPlaceOrder;
	}

	@FindBy(xpath = "//*[text()='Thank you for your purchase!'")
	@CacheLookup

	private WebElement VerifyTextMessage;

	public WebElement getVerifyTextMessage() {//
		return VerifyTextMessage;
	}

	public void addNewShippingDetails() {
		WaitHelper.seleniumWait(getAddNewAddress());
		CommonMethods.jsClick(getAddNewAddress());

		WaitHelper.seleniumWait(getEnterFirstName());
		getEnterFirstName().clear();
		getEnterFirstName().sendKeys("");

		WaitHelper.seleniumWait(getEnterLastName());
		getEnterLastName().clear();
		getEnterLastName().sendKeys("");

		WaitHelper.seleniumWait(getEnterCompanyName());
		getEnterCompanyName().clear();
		getEnterCompanyName().sendKeys("");

		WaitHelper.seleniumWait(getEnterCustomerAddress());
		getEnterCustomerAddress().clear();
		getEnterCustomerAddress().sendKeys("");

		WaitHelper.seleniumWait(getEnterCity());
		getEnterCity().clear();
		getEnterCity().sendKeys("");

		// selectState
		WaitHelper.seleniumWait(getEnterZipCode());
		getEnterZipCode().clear();
		getEnterZipCode().sendKeys("");
		// Select country

		WaitHelper.seleniumWait(getEnterPhoneNumber());
		getEnterPhoneNumber().clear();
		getEnterPhoneNumber().sendKeys("");

		WaitHelper.seleniumWait(getClickOnShiphere());
		CommonMethods.actionClick(getClickOnShiphere());

	}

//------------------------------------
	public void applicationLogin() {
		getSignInBtn().click();
		getEnterUserName().sendKeys("dummypractice.qa@gmail.com");
		getEnterPassword().sendKeys("Abc@2023");
		getClickOnSignBtn().click();

	}

}
