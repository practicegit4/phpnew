package php.utilities;

import java.util.concurrent.TimeUnit;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeAction {
	@Before
	public static void setUp(Scenario scen) {
		System.out.println("Chrome driver initialized.");
		PhpDriverSetup.getChromeDriver();
		System.out.println("Chrome driver End");
		
		PhpDriverSetup.driver.manage().window().maximize();
		PhpDriverSetup.driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		

}
}
