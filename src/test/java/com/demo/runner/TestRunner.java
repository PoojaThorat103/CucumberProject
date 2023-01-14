package com.demo.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//src/test/java/Features	
features="src/test/resources/features/Practice.feature",
glue = {"com.demo.steps","com.demo.Runner"},
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
//dryRun = true,
tags= { "@smokeTest"}
)

public class TestRunner {

}
