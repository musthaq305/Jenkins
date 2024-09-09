package org.stepdefinition;

import org.help.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void bef() {
    
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		
	}
	
	@After
	public void aft() {
    
		closeBrowser();
	}
	
	@Before(order=2)
	public void bef3() {
    System.out.println("Before Scenario 3");
	}
	
	@Before(order=5)
	public void bef1() {
    System.out.println("Before Scenario 1");
	}
	
	@Before(order=4)
	public void bef2() {
    System.out.println("Before Scenario 2");
	}
	
	@After(order=8)
	public void aft3() {
    System.out.println("After Scenario 3");
	}
	
	@After(order=7)
	public void aft1() {
    System.out.println("After Scenario 1");
	}
	
	@After(order=6)
	public void aft2() {
    System.out.println("After Scenario 2");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
