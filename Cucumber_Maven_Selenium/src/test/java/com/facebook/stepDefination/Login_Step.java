package com.facebook.stepDefination;



import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;







import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.facebook.runner.WebConnector;







import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Step {

	
	WebConnector selenium = WebConnector.getInstance();
	
	
	
	@Given("^Open \"(.*?)\" and go to \"(.*?)\"$")
	public void Open_Browser_and_go_to_url(String browser ,String url, DataTable table) throws Throwable {
	    
		List<Map<String,String>> t = table.asMaps(String.class, String.class);
		System.out.println(t.get(0).get("URL"));
		
		selenium.openBrowser(browser);
		selenium.navigate(url);
		
	}

	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void I_enter_valid_username_and_valid_password(String uname, String pass) throws Throwable {
		selenium.type(uname, "loginusername");
		selenium.type(pass, "loginpassword");
		
	}


	@And("^I click on \"(.*?)\" button$")
	public void I_click_on_login_button(String loginButton) throws Throwable {
		selenium.click(loginButton);
	}
	
	@Then("^Login should be \"(.*?)\"$")
	public void user_should_be_able_to_login_successfully(String ExpectedResult) throws Throwable {
	    
		//System.out.println("Login - "+ expectedResult);
		boolean result=selenium.isElementPresent("homelink");
		String actualResult=null;
		
		if(result)
			actualResult="Success";
		else
			actualResult="Fail";
		
		
		
	
			Assert.assertEquals(ExpectedResult, actualResult);
			
	}

	/*@And("^Close the browser$")
	public void Close_the_browser() throws Throwable {
		selenium.closeBrowser();
	}*/
	
	@After
    public void tearDown(Scenario scenario) throws IOException {

        if (scenario.isFailed()) {
            byte[] screenshotBytes = selenium.takescreenshot();
            scenario.embed(screenshotBytes, "image/png");
           System.out.println("==========================="+ scenario.getStatus()+"====================");
        }

       

    }
	
}
