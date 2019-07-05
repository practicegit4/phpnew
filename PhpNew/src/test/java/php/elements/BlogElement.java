package php.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlogElement {

	
	//blogButton 
	@FindBy(xpath= "/html/body/nav/div/div[2]/ul[1]/li[1]/a")
	public WebElement BlogButton;
	
	//search box
	@FindBy(name ="s")
	public WebElement Search;
	
	//search button
	@FindBy(className= "btn btn-primary")
	public WebElement clickSearch;
	
	
	//POPULAR POSTS
	@FindBy(className= "panel-heading go-text-right")
	public WebElement PPost;
	
	
	
}
