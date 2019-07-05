package php.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhpElements {
	//username
		@FindBy(name="username")
	    public WebElement username;
		//password
		@FindBy(name="password")
		public WebElement password;
		
		//Login Button
			@FindBy(css = "#loginfrm > button")
			public WebElement loginButton;
		
			@FindBy(xpath = "//*[@id=\'body-section\']/div[1]/div/div/div[1]/h3")
			public WebElement Hi;
			
			
			
		
}
