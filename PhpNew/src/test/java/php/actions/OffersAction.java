package php.actions;

import org.openqa.selenium.By;
import php.utilities.PhpDriverSetup;

public class OffersAction {
	
	public void OffersHome() {
	PhpDriverSetup.driver.get("https://www.phptravels.net");
	}	
	public void OffersClick() {
	PhpDriverSetup.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[1]/li[2]/a")).click();
	
	}
	
	public String ProofDubai() {
		String proof=PhpDriverSetup.driver.findElement(By.xpath("//*[@id=\'body-section\']/div[6]/div/div[3]/div[1]/h4")).getText();
	    String proofcar=PhpDriverSetup.driver.findElement(By.xpath("//*[@id='body-section']/div[6]/div/div[3]/div[3]/h4")).getText();
	    System.out.println("ProofDubai found= "+proof);
	    System.out.println("ProofCar found= "+proofcar);
	    
	    return "proof,proofcar";
	}
	
		
	
	public void DubaiReadMore() {
		PhpDriverSetup.driver.findElement(By.cssSelector("#body-section > div.listingbg > div > div.col-md-9.col-xs-12 > div:nth-child(1) > a.btn.btn-primary.go-right.loader")).click();
	
	}
	public String ProofDescription() {
		String Descr = PhpDriverSetup.driver.findElement(By.cssSelector("#OVERVIEW > div.col-md-12.go-left > div > div > div.desc-scrol > div > div.visible-lg.visible-md.RTL > p.main-title.go-right")).getText();
		System.out.println("found="+Descr);
	    return Descr;
	}
		
	}

