package com.demo.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.action.BaseClass;

public class LoginLocator extends BaseClass{
	
	public LoginLocator() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='userName']")
	public WebElement userNameTextBox;
	
	@FindBy(xpath = "//input[@id ='password']")
	public WebElement passwordTextBox;
	
	@FindBy(xpath = "//button[@id ='login']")
	public WebElement loginButton;
}
