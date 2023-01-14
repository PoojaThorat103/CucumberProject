package com.demo.steps;

import com.cucumber.listener.Reporter;
import com.demo.action.PracticeAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PracticeStepDefinition {
	PracticeAction practiceAction ;
	
public PracticeStepDefinition(){
	 practiceAction = new PracticeAction();}

@When("^User double click on button and validate it$")
public void user_double_click_on_button_and_validate_it() {
    practiceAction.DoubleClickAction();}

@When("^User Right click on button and validate it$")
public void user_Right_click_on_button_and_validate_it() throws InterruptedException  {
	practiceAction.rightClickAction(); }

@When("^User perform Keyboard Actions$")
public void user_perform_Keyboard_Actions() throws InterruptedException {
	practiceAction.keyBoardAction();}

@When("^User perform drag and drop and validate it$")
public void user_perform_drag_and_drop_and_validate_it() throws InterruptedException{
	//practiceAction.DragAndDropAction();
	//practiceAction.ScrollAction();	
	//practiceAction.testAssertion();
	practiceAction.assertMethods(); 
}

	@When("^Select all radio buttons$")
	public void select_all_radio_buttons() throws InterruptedException {
		//practiceAction.selectAllRadioButtons();
	}

	@When("^Select multiple radio buttons$")
	public void select_multiple_radio_buttons()  {
		practiceAction.selectMultipleRadioButtons();
	}

	@When("^Deselect multiple radio buttons$")
	public void deselect_multiple_radio_buttons() throws Throwable {
		practiceAction.deselectMultipleRadioButtons();
	}


	@Given("^User should be on page$")
	public void user_should_be_on_page() {
		practiceAction.navigation();
	}

	@Then("^User select \"([^\"]*)\" form Drop down$")
	public void user_select_form_Drop_down(String value)  {
		practiceAction.selectDropDownValue(value);
	}


	@Given("^User will select value$")
	public void user_will_select_value() throws InterruptedException {
		practiceAction.AutoDropDown();
	}

	@Given("^User will select the value fron DP$")
	public void user_will_select_the_value_fron_DP()  {
		
	}


@Given("^select value from drop down$")
public void select_value_from_drop_down() throws Throwable {
	practiceAction.selectDropDownWithoutSelectTag();
}

//----------------------------------------------AMAZON------------------------------------------
	@Given("^User should be on Login page$")
	public void user_should_be_on_Login_page()  {
		practiceAction.navigateToLoginPage();
		Reporter.addStepLog("User is on Login Page ");
	}

	@Given("^Enter a \"([^\"]*)\"$")
	public void enter_a(String UserName) throws Throwable {
		practiceAction.EnterUsername(UserName);
	}

	@Given("^Click on continue button and validate it with \"([^\"]*)\"$")
	public void click_on_continue_button_and_validate_it_with(String expectedString) throws Throwable {
		practiceAction.clickOnContinueButton(expectedString);
	}

	@Given("^Enter the \"([^\"]*)\" and validate it$")
	public void enter_the_and_validate_it(String password)  {
	practiceAction.EnterPassword(password);
	}

	@Then("^Home page should display$")
	public void home_page_should_display()  {
		practiceAction.HomePageDisplay();
	}

	@Given("^Click on continue button and check error popup$")
	public void click_on_continue_button_and_check_error_popup() throws Throwable {
		practiceAction.IncorrectPhoneNumberPopUp();
	}

	@Given("^Enter invalid \"([^\"]*)\" and check error popUp \"([^\"]*)\"$")
	public void enter_invalid_and_check_error_popUp(String password, String ErrorMessage) throws Throwable {
		//Enter password
		practiceAction.EnterPassword(password);
		//Check error PopUp
		practiceAction.IncorrectPasswordPopUp(ErrorMessage);
	}

}