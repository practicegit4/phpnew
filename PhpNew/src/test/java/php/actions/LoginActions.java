package php.actions;

import org.openqa.selenium.support.PageFactory;

import php.elements.PhpElements;

import php.utilities.PhpDriverSetup;

 public class LoginActions {
	 
    PhpElements loginTest;
	
	public LoginActions() {
		this.loginTest =new PhpElements();
		PageFactory.initElements(PhpDriverSetup.driver, loginTest);
			
		
	}
	public String phpLoginPage(){
		
		PhpDriverSetup.driver.get("https://www.phptravels.net/login");
		String dd = PhpDriverSetup.driver.getTitle();
		return dd;
	}
	
		
	public void username(String username) {

		loginTest.username.sendKeys(username);
		
	}
	public void password(String password) {
		loginTest.password.sendKeys(password);
	
		
	
		
	}
	public void loginClick() {
		loginTest.loginButton.click();
		
	}
    public String AccountPage(){
		
		PhpDriverSetup.driver.get("https://www.phptravels.net/account/");
		String bd = PhpDriverSetup.driver.getTitle();
		return bd;
	}
	
	
	
			
			
		}
		
	
	

