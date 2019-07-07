package php.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import php.actions.OffersAction;

public class OffersStepdef {
	OffersAction OfferTest = new OffersAction();

	
	@Given("^I will be in the homepage$")
	public void i_will_be_in_the_homepage()  {
	  OfferTest.OffersHome();
	}

	@When("^I click on offers button offers page will be open$")
	public void i_click_on_offers_button_offers_page_will_be_open() {
	   OfferTest.OffersClick();
	}

	@When("^Dubai Special Packages and Rent Car should be appeard$")
	public void dubai_Special_Packages_and_Rent_Car_should_be_appeard()  {
	  OfferTest.ProofDubai();
	}

	@When("^I click on Read More$")
	public void i_click_on_Read_More()  {
	   OfferTest.DubaiReadMore();
	}

	@Then("^Description should be appeard bottom of the picture$")
	public void description_should_be_appeard_bottom_of_the_picture() {
	   OfferTest.ProofDescription(); 
	}

	
}
