package com.demo.locator;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.action.BaseClass;

public class WebTableLocator extends BaseClass{

	public WebTableLocator() {
		PageFactory.initElements(driver, this);}
		
	@FindBy(xpath = "//span[@id ='delete-record-3']")
	public WebElement deleteRecord;
	
	@FindBy(xpath = "//*[@id='app']/div/div/div/following-sibling::div/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div")
	public List<WebElement> listOfRows;
	
	@FindBy(xpath = "//div[@class='rt-tbody']//descendant::div[@class ='rt-td']")
	public List<WebElement> firstName;

}
