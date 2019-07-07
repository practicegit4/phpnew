package php.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import php.actions.SignupAction;

public class SignupStepdef {
	SignupAction signupTest = new SignupAction();
	
	
	
	
	@Given("^Signup page should be opened successfully$")
	public void signup_page_should_be_opened_successfully()  {
	   signupTest.signuplink();
	}

	@When("^I put \"([^\"]*)\"$")
	public void i_put(String FirstName)  {
	   signupTest.FirstName(FirstName);
	}

	@When("^I give \"([^\"]*)\"$")
	public void i_give(String LastName)  {
		signupTest.LastName(LastName); 
	}

	@When("^I input \"([^\"]*)\"$")
	public void i_input(String Phone)  {
		signupTest.Phone(Phone);  
	}

	@When("^I have given \"([^\"]*)\"$")
	public void i_have_given(String Email)  {
		signupTest.Email(Email);
	}

	@When("^I place \"([^\"]*)\"$")
	public void i_place(String Password)  {
		signupTest.Password(Password); 
	}

	@When("^I choose \"([^\"]*)\"$")
	public void i_choose(String ConfirmPassword)  {
		signupTest.ConfirmPassword(ConfirmPassword);
	}

	@When("^I click on signup button$")
	public void i_click_on_signup_button()  {
		signupTest.SignUp();
	}

	@Then("^It should say Email Already Exists$")
	public void it_should_say_Email_Already_Exists()  {
		signupTest.Message();
	}
	
}

