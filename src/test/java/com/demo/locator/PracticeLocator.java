package com.demo.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.demo.action.BaseClass;

import java.util.List;

public class PracticeLocator extends BaseClass{

public PracticeLocator() {
	PageFactory.initElements(driver, this);}
	
		@FindBy(xpath="//button[@id='doubleClickBtn']")
		public WebElement DoubleClickButton;
		
		@FindBy(xpath="//p[@id='doubleClickMessage']")
		public WebElement doubleClickText;
		
		@FindBy(xpath ="//button[@id='rightClickBtn']")
		public WebElement rightClickButton;
		
		@FindBy(xpath="//p[@id='rightClickMessage']")
		public WebElement rightClickText;
		
		@FindBy(xpath="//input[@id='userName']")
		public WebElement fullName;
		
		@FindBy(xpath="//div[@id='draggable']")
		public WebElement dragItam;
		
		@FindBy(xpath="//div[@id='droppableExample-tabpane-simple']//descendant::div[@id='droppable']")
		public WebElement dropItem;
		
		@FindBy(xpath="//button[@id='submit']")
		public WebElement submitButton;
		
		@FindBy(xpath = "//input[@id = 'userNamee']")
		public WebElement FirstaNameTextBox;
		
		@FindBy(xpath = "//input[@id = 'userEmail']")
		public WebElement emailBox;

		@FindBy(xpath = "//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select")
		public WebElement selectValue;

		@FindBy(xpath="//div[@class=' css-yk16xz-control']//descendant::div[contains(text (), 'Select Title')]")
		public WebElement multiselectDropdown;
		
		@FindBy(xpath="//div[@class='dropdown-menu show']//a")
		public List<WebElement> bootstrapDropdown;
		
		@FindBy(xpath="//button[@id='btnDropdownDemo']")
		public WebElement dropDown;

		@FindBy(xpath="//input[@class='form-check-input' and @type='checkbox']")
		public List<WebElement> radioButtonDays;

		@FindBy(xpath="//label[contains(text(),'Which days')]")
		public WebElement daysTitlePath;
	//--------------------------------------

		@FindBy(xpath ="//input[@id=\"ap_email\"]")
		public WebElement email;

		@FindBy(xpath = "//input[@id=\"continue\"]")
		public WebElement continueButton;

		@FindBy(xpath="//div[@id='auth-error-message-box']")
		public WebElement errorBox;


		@FindBy(xpath="//div[@id='auth-error-message-box']//descendant::div/h4[text()='There was a ']")
		public WebElement errorMsgText;
	
		@FindBy(xpath= "//input[@id='ap_password']")
		public WebElement password;
		
		@FindBy(xpath= "//span[@id='auth-signin-button']")
		public WebElement signIn;


	@FindBy(xpath= "//span[contains(text(),'Sign in')]")
	public WebElement signInSymbol;

	@FindBy(xpath="//h1[contains (text(),' Your Account')]")
	public WebElement YourAccountHomePage;


}

