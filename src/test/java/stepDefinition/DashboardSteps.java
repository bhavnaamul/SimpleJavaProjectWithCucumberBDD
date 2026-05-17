package stepDefinition;

import context.ScenarioContext;
import io.cucumber.java.en.Then;
import utility.LoggerUtil;

public class DashboardSteps {
	private ScenarioContext scenarioContext;

	public DashboardSteps(ScenarioContext scenarioContext) {
		this.scenarioContext = scenarioContext;
	}

	@Then("user lands on dashboard")
	public void dashboard() {
		LoggerUtil.logger.info("Dashboard displayed successfully");
		LoggerUtil.logger.info("Dashboard username -> " + scenarioContext.getUsername());
		//System.out.println("Dashboard username -> " + scenarioContext.getUsername());
	}

}
