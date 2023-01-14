package com.demo.steps;

import java.util.List;
import java.util.Map;

import com.demo.locator.LoginLocator;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions extends LoginLocator{

	@Given("^User Open Applicaton$")
	public void user_Open_Applicaton(){
	    System.out.println("User open application ===");
	   
	}

	@When("^User enter username\"([^\"]*)\"$")
	public void user_enter_username(String username) {
		 System.out.println("User enter username ="+username);
		 userNameTextBox.sendKeys(username);
	}

	@When("^user enter password \"([^\"]*)\"$")
	public void user_enter_password(String password)  {
		 System.out.println("user enter password ="+password);
		 passwordTextBox.sendKeys(password);
	
	}

	@When("^user click on login button$")
	public void user_click_on_login_button()  {
		loginButton.click();
	}

	@Then("^Home page should be displayed$")
	public void home_page_should_be_displayed()  {
		System.out.println("Home page should be displayed ===");
	}


@When("^User enters Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
public void user_enters_Username_and_Password(String Username, String Password) throws Throwable {
	System.out.println(" === " + Username);
	System.out.println(" === " + Password);

  
}

@When("^User enter username credentials$")
public void user_enter_username_credentials( DataTable credentials)  {
	 List<List<String>> data = credentials.raw();
	 																		// row / column
     System.out.println("-------------------------------------------------"+data.get(0).get(0));
     System.out.println("-------------------------------------------------"+data.get(0).get(1));


			
}
	
	
	
	
}
