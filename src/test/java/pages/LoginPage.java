package pages;

import context.ScenarioContext;
import utility.LoggerUtil;

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
LoggerUtil.logger.info("Performing Login Action by entering credentials and clicking login button");
       // System.out.println("Entered Username");
LoggerUtil.logger.info("Entered Username");
  //      scenarioContext.setUsername("Bhavna");
        LoggerUtil.logger.info("Username stored in ScenarioContext -> " + scenarioContext.getUsername());
        //System.out.println("Entered Password");
        LoggerUtil.logger.info("Entered Password");
        //System.out.println("Clicked Login");
        LoggerUtil.logger.info("Clicked Login");
    }

    public void createPACTransaction() {
LoggerUtil.logger.info("PAC Transaction Created successfully");
       // System.out.println("PAC Transaction Created");
    }
}