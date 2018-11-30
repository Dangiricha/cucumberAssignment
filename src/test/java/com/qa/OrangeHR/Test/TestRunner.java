package com.qa.OrangeHR.Test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/java/com/qa/OrangeHR/Test/Multiplication.feature","src/test/java/com/qa/OrangeHR/Test/LoginTest.feature"},
				glue= {"com/qa/OrangeHR/Test", "Stepdefinition.java"},
		format={"pretty","html:target/cucumber"}
		//tags = {"@Smoke, @Regression"} 		
		)
public class TestRunner {

		
}
