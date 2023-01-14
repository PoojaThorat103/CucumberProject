package com.demo.steps;

import com.demo.action.LinkHandleAction;

import cucumber.api.java.en.Given;

public class LinkHandleStepeDefinition extends LinkHandleAction{

	@Given("^User is on links page$")
	public void user_is_on_links_page()  {
		navigateLinkPage(); }

	@Given("^click on 'home' link$")
	public void click_on_home_link() throws InterruptedException  {
		LinkClick();}
	
}
