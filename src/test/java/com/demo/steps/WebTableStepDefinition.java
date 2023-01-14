package com.demo.steps;

import com.demo.action.WebTableAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class WebTableStepDefinition {
	
	@Given("^user is on table page$")
	public void user_is_on_table_page() {
		WebTableAction action = new WebTableAction();
		action.NavigateToPage();}

	@Given("^check data in table$")
	public void check_data_in_table() throws InterruptedException {
		WebTableAction action = new WebTableAction();
		action.ValidateHeaderData();}	
	
	@Then("^validate firstName$")
	public void validate_firstName() throws InterruptedException{
		WebTableAction action = new WebTableAction();
		action.ValidateFirstName();}
	
	
	}

