package pages;

import context.ScenarioContext;

/*
 * Contains:

page behavior

NOT test logic.
 */

public class LoginPage extends BasePage {
	
	private ScenarioContext scenarioContext;
	
	public LoginPage(ScenarioContext scenarioContext) {
		this.scenarioContext = scenarioContext;
	}

    public void login() {

        System.out.println("Entered Username");
        scenarioContext.setUsername("Bhavna");
        System.out.println("Entered Password");

        System.out.println("Clicked Login");
    }

    public void createPACTransaction() {

        System.out.println("PAC Transaction Created");
    }
}