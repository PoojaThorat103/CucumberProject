package com.demo.action;

import java.util.Set;

import javax.naming.NameNotFoundException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.demo.locator.LinkHandleLocator;

public class LinkHandleAction extends Wrapper{
	
	LinkHandleLocator linkHandleLocator = new LinkHandleLocator();	
	public LinkHandleAction() {
		linkHandleLocator = new LinkHandleLocator();}
	
	public void navigateLinkPage() {
		driver.navigate().to("https://demoqa.com/links");}
	
	public void LinkClick() throws InterruptedException {
		
		boolean isWindowSwitched = false;
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("This is parent Window  "   + parentWindow);		
		Thread.sleep(3000);
		userClick(linkHandleLocator.homeLink);		
		Set<String> childWindow = driver.getWindowHandles();
		
		if(childWindow.size() <= 1) {
			Assert.assertTrue("No new window found", false);
		}
		
		System.out.println("chield window " +childWindow);
		for(String win: childWindow) {
			System.out.println("chield window " +driver.switchTo().window(win).getTitle());
			driver.switchTo().window(win);
			if(driver.getTitle().contains("ToolsQA")){
				System.out.println("user is on chiled window");
				isWindowSwitched = true;
			break;
			}
		}
		
		if(!isWindowSwitched) {
			Assert.assertTrue("Not switched to new window", isWindowSwitched);
		}
			
		Thread.sleep(2000);
		WebElement getTitle = driver.findElement(By.linkText("Selenium"));
		System.out.println(getTitle.getText());
		driver.close();
		driver.switchTo().window(parentWindow);
   }
	
	
	
}
	


