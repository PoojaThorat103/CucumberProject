Feature: Log in functionality

  @sanity
  Scenario Outline: Log in with valid Credentials
  Given User Open Applicaton
  When User enter username"<username>"
  And user enter password "<password>"
  And user click on login button
  Then Home page should be displayed

  
  Examples:
  |username|password|
  |Pooja|reset123|
  |sahil|thorat123|
  
  @smoke @tagshook
  Scenario: This scenario is used to validate login functionality 1
    Given User Open Applicaton
    When User enters Username "Sahil" and Password "sahil @123"
    And user click on login button
    Then Home page should be displayed
    
 @smoke
  Scenario: Log in with valid Credentials
    Given User Open Applicaton
    When User enter username credentials
      | Deepika  | Dthul    |
    And user click on login button
    Then Home page should be displayed
    
    
    
 
