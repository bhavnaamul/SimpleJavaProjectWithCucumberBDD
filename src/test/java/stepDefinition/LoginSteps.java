package stepDefinition;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

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
	LoginPage loginPage = new LoginPage();


	@Given("user launches application")
	public void launchApplication() {
		System.out.println("Executing Scenario On -> " + Thread.currentThread().getName());
		System.out.println("STEP 1 - Launch Application");
		System.out.println(DriverFactory.getDriver());
		//loginPage.loadApplication();
	}

	@Given("user setup PAC details successfully")
	public void PACSetup() {
		System.out.println("STEP 1 - PAC Setup");
	}

	@Given("user setup REG details successfully")
	public void REGSetup() {
		System.out.println("STEP 1 - REG Setup");
	}

	@When("user enters username and password")
	public void enterCredentials() {

		System.out.println("STEP 2 - Enter Credentials");
		loginPage.login();
	}

	@Then("user should login successfully")
	public void verifyLogin() {

		System.out.println("STEP - Verify Login");
	}

	@When("user creates PAC transaction")
	public void createPAC() {

		System.out.println("STEP - Create PAC");

		loginPage.createPACTransaction();
	}

	@Then("PAC should be successful")
	public void verifyPAC() {

		System.out.println("STEP - Verify PAC");
	}
}
