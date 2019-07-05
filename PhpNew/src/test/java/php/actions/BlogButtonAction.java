package php.actions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import php.elements.BlogElement;
import php.utilities.PhpDriverSetup;

public class BlogButtonAction {
	
	BlogElement blogTest;
	
      public void BlogPage(){
		
		PhpDriverSetup.driver.get("https://www.phptravels.net");
		
	}
      public void BlogClick() {
	  
	  PhpDriverSetup.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[1]/a")).click();
}
       public void  Search(String something) {
    	   
    	   PhpDriverSetup.driver.findElement(By.cssSelector("#body-section > div > div > div.secondary.col-md-4.add_bottom_30.go-left > div:nth-child(2) > div.panel-body > form > div > input").name("s")).sendKeys(something);
       }
       
       public void ClickSearch() {
    	   PhpDriverSetup.driver.findElement(By.cssSelector("#body-section > div > div > div.secondary.col-md-4.add_bottom_30.go-left > div:nth-child(2) > div.panel-body > form > div > span > button").className("input-group-btn")).click();
    	   }
       public void FindProof() {
    	   String Proof1=PhpDriverSetup.driver.findElement(By.cssSelector("#body-section > div > div > div.col-md-8.go-right > div > div.panel-body")).getText();
    	   System.out.println("Proof_Found= "+Proof1);
       }
       public void Bloginside(){
   		
   		PhpDriverSetup.driver.get("https://www.phptravels.net/blog");
   		

       }
}
