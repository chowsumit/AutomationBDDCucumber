package stepDefinition;

import org.junit.runner.RunWith;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
public class StepDefinition {

	
	@Given("^User is on the Netbanking landing page$")
	public void user_is_on_the_Netbanking_landing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		System.out.println("User is on the Netbanking landing page.");
		
	}

	@When("^User logins into application with username and password$")
	public void user_logins_into_application_with_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("User logins into application with username and password");
	}
	
	@When("^User logins into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_logins_into_application_with_username_and_password(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		System.out.println("The username is "+arg1+" and password is "+arg2);
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Home page is populated");
	}

	@Then("^Cards are displayed$")
	public void cards_are_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Cards are displayed");
	}
	
	
}
