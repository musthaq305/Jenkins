package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.help.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{

	
	@When("User have to enter the invalid username and valid password")
	public void user_have_to_enter_the_invalid_username_and_valid_password(io.cucumber.datatable.DataTable d) {
	    
		Map<String, String> mp = d.asMap(String.class, String.class);
		
		String email = mp.get("username");
		String password = mp.get("password");
		
		WebElement mail = driver.findElement(By.id("emailid"));
		mail.sendKeys(email);
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(password);
		
		
		
	}
	
	@When("User have to enter the valid username and invalid password")
	public void user_have_to_enter_the_valid_username_and_invalid_password(io.cucumber.datatable.DataTable d) {
	   
		List<Map<String, String>> mp = d.asMaps();
		
		String email = mp.get(1).get("email");
		String password = mp.get(2).get("password");
		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys(email);
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(password);
		
	}


	@When("User have to enter the {string} and {string}")
	public void user_have_to_enter_the_and(String email, String password) {
	   
		 
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys(email);
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(password);
	}


	@When("User have to click the login button")
	public void user_have_to_click_the_login_button() {
	    
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
	}

	@Then("User have to reach invalid credential page")
	public void user_have_to_reach_invalid_credential_page() {
	   
		String url = driver.getCurrentUrl();
		
		if (url.contains("privacy_mutation_token")) {
			
			System.out.println("Reach Invalid Credential Page");
		} 
		else {
             System.out.println("Not Reach Invalid Credential Page");
		}
	}
	
	@Given("User have to launch the facebook application through chrome browser")
	public void user_have_to_launch_the_facebook_application_through_chrome_browser() {
	   
		
	}
	
	
	
	@When("User have to click the forgotten password")
	public void user_have_to_click_the_forgotten_password() {
	   
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	}

	@When("User have to enter invalid email")
	public void user_have_to_enter_invalid_email() {
	  
		WebElement frgtnmail = driver.findElement(By.xpath("//input[@id='identify_email']"));
		frgtnmail.sendKeys("smart@123");
	}

	@Then("User have to click search button")
	public void user_have_to_click_search_button() {
	    
		driver.findElement(By.xpath("//button[text()='Search']")).click();
	}




}
