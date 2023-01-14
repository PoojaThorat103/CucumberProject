package com.demo.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.action.BaseClass;

public class LinkHandleLocator extends BaseClass{

	public LinkHandleLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Home")
	public WebElement homeLink;
	
}
