package php.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import php.actions.LoginActions;

public class PhpStepdeff {
	LoginActions loginActions = new LoginActions();

	@Given("^I navigated to php login page$")
	public void i_navigated_to_php_login_page() {
		loginActions.phpLoginPage();
	}

	@When("^I entered \"([^\"]*)\"  and \"([^\"]*)\"$")
	public void i_entered_and(String username, String password) {
		loginActions.username(username);
		loginActions.password(password);
	}

	@When("^I click on login$")
	public void i_click_on_login() {
		loginActions.loginClick();
	}

	@Then("^I should be on the login page$")
	public void i_should_be_on_the_login_page() {
	    loginActions.AccountPage();
	}

}