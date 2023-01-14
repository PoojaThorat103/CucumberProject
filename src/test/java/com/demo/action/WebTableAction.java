package com.demo.action;

import java.util.List;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.demo.locator.WebTableLocator;

public class WebTableAction extends Wrapper{
	
	WebTableLocator webTableLocator;
	private boolean isDisplayed;
	
	public WebTableAction() {
		webTableLocator = new WebTableLocator();}
	
	public void NavigateToPage() {
		driver.navigate().to("https://demoqa.com/webtables");}
	
	public void ValidateHeaderData() {
		// No. of column
		List <WebElement> header = webTableLocator.listOfRows;
		System.out.println("No of header : =  " +header.size());		
		Assert.assertEquals(header.size(), 7);
		for(WebElement ele: header) {
			String value = ele.getText();
			System.out.println(value);} }

	public void ValidateFirstName() throws InterruptedException {
		Thread.sleep(3000);
		List <WebElement> name = webTableLocator.firstName;
		//System.out.println("User First Name : " + name.getText());
		for(WebElement f:name) {
			String Fname =f.getText();
			System.out.println(Fname);
			if (f.getText().contains("Kierra")) {
				isDisplayed = true;
				System.out.println("Name found");
				userClick(webTableLocator.deleteRecord);				
			break;}	
			}
		if(!isDisplayed) {
			Assert.assertTrue("name not found", isDisplayed);}	
		
	/*	for(WebElement f:name) {
			String Fname =f.getText();
			if (f.getText().contains("Kierra")) {
				isDisplayed = true;}	
			}*/ }	
  
}













