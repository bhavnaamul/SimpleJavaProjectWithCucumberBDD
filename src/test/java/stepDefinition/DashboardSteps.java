package stepDefinition;

import context.ScenarioContext;
import io.cucumber.java.en.Then;

public class DashboardSteps {
	 private ScenarioContext scenarioContext;

	    public DashboardSteps(
	            ScenarioContext scenarioContext
	    ) {

	        this.scenarioContext = scenarioContext;
	    }

	    @Then("user lands on dashboard")
	    public void dashboard() {

	        System.out.println(
	                "Dashboard username -> "
	                        + scenarioContext.getUsername()
	        );
	    }

}
