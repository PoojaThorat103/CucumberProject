package com.demo.steps;

import com.demo.action.RegistrationAction;
import com.demo.action.Wrapper;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RegistrationStepDefinition extends RegistrationAction {

	@Given("^User open application$")
	public void user_open_application()  {
	    System.out.println("user open credintials");
	}

	@Given("^click on 'Practice Form'$")
	public void click_on_Practice_Form() throws InterruptedException {
		clickOnPracticeForm();
		System.out.println("user will click on practice form");
	}

	@Then("^User fill all details$")
	public void user_fill_all_details()  {
		FillForm();
		System.out.println("user will fill all details of form");
	}

	@Then("^User click on submit button$")
	public void user_click_on_submit_button()  {
		submitForm();
	}

	@Then("^User will see popup window and User will close that window\\.$")
	public void user_will_see_popup_window_and_User_will_close_that_window()  {
	    
	}

	
	
}
