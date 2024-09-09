package org.run;

import org.help.JvmReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\eclipse-workspace\\CucumberMorning\\src\\test\\resources\\Feature\\Login.feature"
                 ,glue="org.stepdefinition",dryRun=false,strict=true,snippets=SnippetType.UNDERSCORE
                 ,plugin= {"html:C:\\Users\\Admin\\eclipse-workspace\\CucumberMorning\\AllReports\\HtmlReport",
                		 "junit:C:\\Users\\Admin\\eclipse-workspace\\CucumberMorning\\AllReports\\JunitReport\\facebook.xml",
                		 "json:C:\\Users\\Admin\\eclipse-workspace\\CucumberMorning\\AllReports\\JsonReport\\fb.json",
                		 "rerun:C:\\Users\\Admin\\eclipse-workspace\\CucumberMorning\\Rerun\\failed1.txt"}) 

//tags----To Execute or Ignore particular scenario or feature file
//dryRun=false--It lead the normal execution and generate the snippets for undefined steps
//dryRun=true---It Skip the normal excecution and generate only snippets for undefined steps
//strict=false--Build is marked as pass for undefined steps
//strict=true---Build is marked as fail for indefined steps

public class TestRunner {

	@AfterClass
	public static void aft() {
		
		JvmReport.generateJvmReport("C:\\Users\\Admin\\eclipse-workspace\\CucumberMorning\\AllReports\\JsonReport\\fb.json");

	}
	
}
