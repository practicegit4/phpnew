package php.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import php.utilities.PhpDriverSetup;

public class SignupAction {
	
	
	public void signuplink() {

	PhpDriverSetup.driver.get("https://www.phptravels.net/register");
	
		
	}
	public void FirstName(String FirstName) {
	PhpDriverSetup.driver.findElement(By.name("firstname")).sendKeys(FirstName);
	
	}
	public void LastName(String LastName) {
	PhpDriverSetup.driver.findElement(By.name("lastname")).sendKeys(LastName);
		
	}
	
	public void Phone(String Phone) {
	PhpDriverSetup.driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[5]/input").name("phone")).sendKeys(Phone);
	}		
	
	public void Email(String Email) {
		PhpDriverSetup.driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[6]/input").name("email")).sendKeys(Email);;
	}
	
	public void Password(String Password){
		
	PhpDriverSetup.driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[7]/input").name("password")).sendKeys(Password);
	}
	
	public void ConfirmPassword(String ConfirmPassword) {
	
	PhpDriverSetup.driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[8]/input").name("confirmpassword")).sendKeys(ConfirmPassword);
	
	//to scroll down imported a code 
	((JavascriptExecutor)PhpDriverSetup.driver).executeScript("scroll(0,100)");
	
	}
	public void SignUp() {
	PhpDriverSetup.driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[9]/button")).click();
	
	}
	
	public void Message() {
	
	String Msg=	PhpDriverSetup.driver.findElement(By.xpath("//*[@id='headersignupform']/div[2]/div")).getText();
	System.out.println("msg result= "+Msg);
	
	
	
	// Email Already Exists should be shown
	//System.out.println("Message shown= "+ExiestMessage);
	/*
	if(Msg.equals("Email Already Exists.")){
		System.out.println("case passed= "+Msg );
	}else { System.out.println("Failed");
		
	
	
	}
	*/
	
	}


}
	
	
	

