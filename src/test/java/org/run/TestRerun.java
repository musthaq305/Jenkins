package org.run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@Rerun\\failed1.txt",glue="org.stepdefinition")
public class TestRerun {

	
	
	
}
