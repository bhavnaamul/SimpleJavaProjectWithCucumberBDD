package stepDefinition;

import context.ScenarioContext;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utility.LoggerUtil;

/*
 * Step Definitions:

orchestrate flow

They:

call page methods
coordinate execution

They should NOT contain:

raw Selenium logic
driver initialization
 */

public class LoginSteps {
	// LoginPage loginPage = new LoginPage();
	private LoginPage loginPage;
	private ScenarioContext scenarioContext;

	public LoginSteps(ScenarioContext scenarioContext, LoginPage loginPage) {
		this.scenarioContext = scenarioContext;
		this.loginPage = loginPage;
	}

	@Given("user launches application")
	public void launchApplication() {
		//System.out.println("Executing Scenario On -> " + Thread.currentThread().getName());
//		System.out.println("STEP 1 - Launch Application");
		LoggerUtil.logger.info("Executing Scenario On ->"  + Thread.currentThread().getName() + " - " + Thread.currentThread().getId());
		DriverFactory.getDriver();
		loginPage.login();
		LoggerUtil.logger.info("User logged into application");
		LoggerUtil.logger.info("Username stored -> " + scenarioContext.getUsername());
		//System.out.println("Username stored -> " + scenarioContext.getUsername());
		// loginPage.loadApplication();
	}

	@Given("user setup PAC details successfully")
	public void PACSetup() {
		LoggerUtil.logger.info("STEP 1 - PAC Setup");
		//System.out.println("STEP 1 - PAC Setup");
	}

	@Given("user setup REG details successfully")
	public void REGSetup() {
		LoggerUtil.logger.info("STEP 1 - REG Setup");
		//System.out.println("STEP 1 - REG Setup");
	}

	@When("user enters username and password")
	public void enterCredentials() {
		LoggerUtil.logger.info("User logged into application");
		//System.out.println("STEP 2 - Enter Credentials");
		loginPage.login();
	}

	@Then("user should login successfully")
	public void verifyLogin() {
		LoggerUtil.logger.info("STEP - Verify Login");
		//System.out.println("STEP - Verify Login");
	}

	@When("user creates PAC transaction")
	public void createPAC() {
		LoggerUtil.logger.info("STEP - Create PAC");
		//System.out.println("STEP - Create PAC");
		loginPage.createPACTransaction();
	}

	@Then("PAC should be successful")
	public void verifyPAC() {
		LoggerUtil.logger.info("STEP - Verify PAC");
		//System.out.println("STEP - Verify PAC");
	}
}
