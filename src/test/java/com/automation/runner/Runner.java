package com.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src//test//resources//features",
		glue="com.automation.steps",
		plugin = "html:target/report.html"
		
	)
public class Runner {

}
