package com.demo.steps;

import com.demo.action.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks extends BaseClass {

	@Before(order=0)
	public void InitializeDriver() {
		invokeBrowser();
		System.out.println("Initializing driver and launching Browser");
	}
	
	/*@After(order=0)
	public void closingDriver() {
		closeBrowser();
		System.out.println("Closing Browser");
		
	}*/
}
