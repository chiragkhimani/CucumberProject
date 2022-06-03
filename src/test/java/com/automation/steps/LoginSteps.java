package com.automation.steps;

import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps {

	LoginPage loginPage = new LoginPage();

	@Given("user open the website")
	public void user_open_the_website() {
		loginPage.openWebsite();
	}

	@When("user login with valid credentials")
	public void user_login_with_valid_credentials() {
		loginPage.doLogin(ConfigReader.getProperty("user.name"), ConfigReader.getProperty("user.password"));
	}

	@When("user login with invalid credentials")
	public void user_login_with_invalid_credentials() {
		loginPage.doLogin("invalidUser", "admin123");
	}

	@When("verify invalid login error message is displayed")
	public void verify_invalid_login_error() {
		loginPage.verifyInvalidLoginErrorMsg();
	}

}
