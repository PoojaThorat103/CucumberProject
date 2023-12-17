Feature: List of selenium practice 

# //-------------------Selenium Practice-----------------------------------------------//
Scenario: Double click and Right click Practice
When User double click on button and validate it
And User Right click on button and validate it

Scenario: Keyboard Action
When User perform Keyboard Actions

Scenario: Drag and Drop action
When User perform drag and drop and validate it

Scenario:  Radio Button
  When Select all radio buttons
  And Select multiple radio buttons
  And Deselect multiple radio buttons

#Traditional Drop Down
Scenario Outline: Drop down Practice
  Given User should be on page
  Then User select "<value>" form Drop down
    Examples:
      | value |
      |Angola|
      
      
  @sanity
  Scenario: Select value from Autosuggestion DropDown
   Given User will select value
   And User will select the value fron DP
         
      

 Scenario: Drop down parctice without select tag
 Given  select value from drop down

  # //-------------------AMAZON Login------------------------------------------------//

Scenario Outline: Amazon login successfully
  Given User should be on Login page
  And Enter a "<UserName>"
  And Click on continue button and validate it with "<expectedString>"
  And Enter the "<password>" and validate it
  Then Home page should display

Examples:
  |UserName|password|expectedString|
  |8668640656  |sonumonu@123|  Sign in|

 @smokeTest
  Scenario Outline:  Amazon login with invalid username
    Given User should be on Login page
    And Enter a "<UserName>"
    And Click on continue button and check error popup
    Examples:
      |UserName|
      |123  |

  Scenario Outline:  Amazon login with invalid Password
    Given User should be on Login page
    And Enter a "<UserName>"
    And Click on continue button and validate it with "<expectedString>"
    And Enter invalid "<password>" and check error popUp "<ErrorMessage>"

    Examples:
      |UserName|password|expectedString |ErrorMessage|
      |1234567890  | abc    |Sign in| There was a problem|

