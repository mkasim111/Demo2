package stepDefinition;

import org.junit.Assert;

import Utils.TestDriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefPractice extends TestDriverFactory{
	
	@Given("^User navigate to practice page$")
	public void user_navigate_to_practice_page() throws Throwable {
		getDriver().get("https://learn.letskodeit.com/p/practice");
		
	}

	@When("^User clicks on the Login button$")
	public void user_clicks_on_the_Login_button() throws Throwable {
		pp.clickRadioButton();
		lp= pp.clickLoginButton();
	}

	@Then("^User should navigate successfully to Login Page$")
	public void user_should_navigate_successfully_to_Login_Page() throws Throwable {
		lp.writeEmailinTextBox("testEmail");
		//Assert.assertTrue(false);
	}
	
	

}
