package php.runner;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class PhpRunner {
	@CucumberOptions(features = { "FeatureFiles" }, glue = { "php.stepdef", "php.utilities" }, plugin = { "pretty",
			"html:target/cucumber-htmlreport", "json:target/cucumber-report.json","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, monochrome = true)

	@Test
	public static class phprunner extends AbstractTestNGCucumberTests {

		@AfterClass
		public static void writeExtentReport() {
			Reporter.loadXMLConfig(new File("Config/LoginReport.xml"));

		}
	}
}
