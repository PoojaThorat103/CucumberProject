
Feature: Registration Form
 

  @tag1
  Scenario: check registration form
    Given User open application 
    And  click on 'Practice Form'
    Then User fill all details
    And  User click on submit button 
    Then User will see popup window and User will close that window.
