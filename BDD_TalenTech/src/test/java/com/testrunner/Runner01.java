package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(
		features = "Features",
		glue = "com.stepdef"
)

public class Runner01 extends AbstractTestNGCucumberTests {	

}
