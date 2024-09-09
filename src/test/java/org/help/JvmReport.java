package org.help;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void generateJvmReport(String jsonPath) {
		
	//1.To Fetch location path of JVM Report folder	
	File f= new File("C:\\Users\\Admin\\eclipse-workspace\\CucumberMorning\\AllReports\\JVMReport");	
	
	//2.To add the Details for Report generation
	Configuration c= new Configuration(f,"FACEBOOK APPLICATION");
	
	c.addClassifications("OS","Windows");
	c.addClassifications("Jdk Version","1.8");
	c.addClassifications("Tool","Eclipse");
	
	//3.To add the json path into list
	List <String> l= new ArrayList<>();
	l.add(jsonPath);
	
	//4.To Create a Object for ReportBuilder for call generateReport()
	ReportBuilder r= new ReportBuilder(l,c);
	r.generateReports();
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
