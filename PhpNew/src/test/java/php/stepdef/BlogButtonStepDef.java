package php.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import php.actions.BlogButtonAction;

public class BlogButtonStepDef {

	BlogButtonAction blogAction = new BlogButtonAction();
	
	@Given("^I navigated to the blog page$")
	public void i_navigated_to_the_blog_page() throws Throwable {
	    blogAction.Bloginside();
	}
	 @When("^I click on search button$")
	  public void i_click_on_search_button() throws Throwable {
		 blogAction.ClickSearch();
	  	  
	}

	@When("^I type \"([^\"]*)\" into search box$")
	public void i_type_into_search_box(String something)  {
	    blogAction.Search(something);
	}

	@Then("^it should show no result found$")
	public void it_should_show_no_result_found()  {
		blogAction.FindProof();
	}



}
