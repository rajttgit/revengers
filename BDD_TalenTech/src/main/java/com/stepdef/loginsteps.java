package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pageobjects.HomepageObjects;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginsteps {
	
	static WebDriver driver = homepagesteps.driver;
	
	@When("^i click on my account$")
	public void i_click_on_my_account() throws Throwable {
		HomepageObjects.myAcountButton.click();
	}

	@Then("^i should be taken to the login page$")
	public void i_should_be_taken_to_the_login_page() throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl(), HomepageObjects.loginPageURL);
	}

	@When("^I enter my email address$")
	public void i_enter_my_email_address() throws Throwable {
		HomepageObjects.emailTextBox.sendKeys(HomepageObjects.email);
	}

	@When("^my password$")
	public void my_password() throws Throwable {
		HomepageObjects.passwordTextBox.sendKeys(HomepageObjects.password);
	}

	@When("^click the sign in button$")
	public void click_the_sign_in_button() throws Throwable {
		HomepageObjects.signInButton.click();
	}

	@Then("^I should be taken to my account page$")
	public void i_should_be_taken_to_my_account_page() throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl(), HomepageObjects.accountPageURL);
	}

}