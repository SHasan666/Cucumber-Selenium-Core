package com.facebook.stepDefination;


import org.junit.Assert;





import com.facebook.runner.WebConnector;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CommonUtil {
	WebConnector selenium = WebConnector.getInstance();
	
	// clicking on object
	@And("^I click on \"([^\"]*)\"$")
	public void I_Click_On(String object){
		selenium.log("Clicking on "+object);
		selenium.click(object);
	}
	
	@And("^I enter \"([^\"]*)\" as \"([^\"]*)\"$")
	public void I_enter(String object,String text){
		selenium.log("Typing in "+object);
		System.out.println("Entering in "+ object +" value "+ text);
		selenium.type(text, object);
	}
	// check if not logged in - then login
	@Given("^I am logged in facebook with (.*?)$")
	public void i_am_logged_in_facebook_with(String Mozilla) throws Throwable {
		selenium.openBrowser(Mozilla);
		if(!selenium.isLoggedIn())
		{
			selenium.doDefaultLogin();
		}
		
	}
	
	@Given("^Runmode is \"([^\"]*)\"$")
	public void Runmode_is(String runmode){
		if(runmode.equals("N"))
			throw new PendingException("Skipping the test as Runmode is No");
	}
	
	@Given("^Browser is \"([^\"]*)\"$")
	public void Browser_is(String browser){
		selenium.openBrowser(browser);
	}
	
	@Then("^\"(.*?)\" should be present$")
	public void should_be_present(String object){
		Assert.assertTrue("Object not found "+ object, selenium.isElementPresent(object));
	}
	
	// compare tiles
	// compare text
	// compare values in droplist
	
	
	
	
	
}
