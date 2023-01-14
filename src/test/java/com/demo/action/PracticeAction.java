package com.demo.action;

import java.util.List;
import java.util.NoSuchElementException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.cucumber.listener.Reporter;
import com.demo.locator.PracticeLocator;

 public class PracticeAction extends Wrapper{
	PracticeLocator practiceLocator;
	
 public PracticeAction() {
	practiceLocator = new PracticeLocator();}
	
 public void DoubleClickAction() {		
	driver.navigate().to("https://demoqa.com/buttons");
	Actions actions = new Actions(driver);
	actions.doubleClick(practiceLocator.DoubleClickButton).perform();
	Assert.assertEquals("Text does not matched: " , "You have done a double click", practiceLocator.doubleClickText.getText());}
	
  public void rightClickAction() throws InterruptedException {
	Thread.sleep(3000);
	driver.navigate().to("https://demoqa.com/buttons");
	Actions actions = new Actions(driver);
	actions.contextClick(practiceLocator.rightClickButton).perform();	
	Assert.assertEquals("Text does not matched", "You have done a right click",practiceLocator.rightClickText.getText());}
  
  public void keyBoardAction() throws InterruptedException {
	 Thread.sleep(3000);
	 driver.navigate().to("https://demoqa.com/text-box");
	 Actions actions = new Actions(driver);
	 Action command = actions.moveToElement(practiceLocator.fullName).click(practiceLocator.fullName)
		.keyDown(practiceLocator.fullName, Keys.SHIFT).sendKeys(practiceLocator.fullName,"pooja")
		.keyUp(practiceLocator.fullName, Keys.SHIFT).build();  
	  	command.perform();}
  
  public void DragAndDropAction() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.navigate().to("https://demoqa.com/droppable/");
	  Actions actions = new Actions(driver);
	  actions.dragAndDrop(practiceLocator.dragItam, practiceLocator.dropItem).perform();  }
  
  public void ScrollAction() {
	  driver.navigate().to("https://demoqa.com/text-box");
	  ScrollDownVertical(practiceLocator.submitButton); 
  }
  
  public void testAssertion() {
	  driver.navigate().to("https://demoqa.com/text-box");
	  try {
		  Assert.assertTrue("Element Not Display.....", practiceLocator.FirstaNameTextBox.isDisplayed());
		  System.out.println("Element display"); }	  
		  catch(NoSuchElementException e){
			  System.out.println("The element is not present in the application"); }	  
	  		  System.out.println("Rest of the code--------------");
	  }
	  
	  public void assertMethods() {
		  driver.navigate().to("https://demoqa.com/text-box");
		  String actualTitle = driver.getTitle();
		  String expected = "ToolsQA";
		  System.out.println(expected);
		  Assert.assertEquals("Title mismatch==", expected, actualTitle);		    
	  }

	 public void selectDropDownValue(String value){
		 selectByVisibleText(practiceLocator.selectValue, value);
		 String ActualValue = practiceLocator.selectValue.getAttribute("value");
	 }

	 public void selectDropDownWithoutSelectTag() {
		 driver.navigate().to("https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_1");
		  userClick(practiceLocator.dropDown);
		  
		 List<WebElement> ele = practiceLocator.bootstrapDropdown;
		 System.out.println(ele.size());
		 
		 for(int i=0; i<ele.size(); i++) {
			 String name = ele.get(i).getText();
 
			 if(name.equals("HTML")) {
				 ele.get(i).click();
			 }
		 }
		 
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 public void selectAllRadioButtons() throws InterruptedException {
 		driver.navigate().to("https://itera-qa.azurewebsites.net/home/automation");
		 ScrollDownVertical(practiceLocator.daysTitlePath);
		 Thread.sleep(2000);
		 //Get total radio button count
		List<WebElement> options=practiceLocator.radioButtonDays;
		System.out.println(options.size());

		//Select all radio button
		/* for(int i=0;i<options.size();i++){
			 options.get(i).click();
		 }*/
		 for(WebElement chk:options){
			 chk.click();
		 }
	 }

	 //Select last 3 radio buttons 
	 //Select First 3 radio buttons
	 public void selectMultipleRadioButtons() {
		driver.navigate().to("https://itera-qa.azurewebsites.net/home/automation");
		ScrollDownVertical(practiceLocator.daysTitlePath);
			 
		List<WebElement> options=practiceLocator.radioButtonDays;
		System.out.println(options.size());
		
		//select last 3 radio buttons
		//7-3 = 4
		for(int i=4;i<options.size();i++) {
			options.get(i).click();
			}	
				
		 //Select First 3 radio buttons		
		for(int i=0;i<3;i++) {
			options.get(i).click();
		}
	 }

	 public void deselectMultipleRadioButtons() throws InterruptedException {
		 ScrollDownVertical(practiceLocator.daysTitlePath);
		 Thread.sleep(2000);
		 List<WebElement> options=practiceLocator.radioButtonDays;
		 
		 for(WebElement chk:options){
			 if(chk.isSelected()) {
			 chk.click();
			 }
		 }
	 }
	 

//----------------------------------------------AMAZON ----------------------------------
	public void navigation(){
		driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		Reporter.addStepLog("User Is on login page");
	}

	 public void navigateToLoginPage(){
		 driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fyour-account%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	 }

	 public void EnterUsername(String UserName) throws InterruptedException {
		userType(practiceLocator.email,UserName);
	 }

	  public void clickOnContinueButton(String expectedString){
		  userClick(practiceLocator.continueButton);
		  Reporter.addStepLog("User has clicked on continue button");
		  System.out.println(practiceLocator.signIn.getText()+ "-----");
		  verifyTest("Expected and Actual text does not matched",expectedString,practiceLocator.signIn.getText());
	  }

	 public void EnterPassword(String password) {
		 userType(practiceLocator.password,password);
		 userClick(practiceLocator.signIn);
		 Reporter.addStepLog("User has entered password and clicked on SignIn button");
	 }

	 public void HomePageDisplay(){
		System.out.println(practiceLocator.YourAccountHomePage.getText());
		String ExpectedValue= "Your Account";
		 verifyTest("Element not present on page: ",practiceLocator.YourAccountHomePage.isDisplayed());
		 Reporter.addStepLog("Home page displayed");
	 }

	 public void IncorrectPhoneNumberPopUp(){
		 userClick(practiceLocator.continueButton);
		 Reporter.addStepLog("Entered incorrect phone number");
		 verifyTest("Error message not displayed ", practiceLocator.errorBox.isDisplayed());
		 Reporter.addStepLog("Error message Displayed");
	 }

	 public void IncorrectPasswordPopUp(String ErrorMessage){
		 verifyTest("Wrong password error message is displayed", isElementDisplayed(practiceLocator.errorMsgText));
	 }

	 public void AutoDropDown() throws InterruptedException {
		 driver.navigate().to("https://demoqa.com/select-menu");
		 userClick(practiceLocator.multiselectDropdown);
	 }

 }
		  
	  

	  
	  

  
  
	  
 


