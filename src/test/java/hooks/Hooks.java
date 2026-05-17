package hooks;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.LoggerUtil;

public class Hooks {
	@Before(order = 0)
	public void beforeScenario() {
	//	System.out.println("Executing Scenario On -> " + Thread.currentThread().getId());
		LoggerUtil.logger.info("===== TEST EXECUTION STARTED =====" + Thread.currentThread().getId());
//        System.out.println("BEFORE HOOK - Browser setup");
		DriverFactory.initDriver();
	}

	@After
	public void afterScenario() {
		//System.out.println("After Hook -> " + Thread.currentThread().getId());
		LoggerUtil.logger.info("===== TEST EXECUTION COMPLETED =====" + Thread.currentThread().getId());
		// System.out.println("AFTER HOOK - Browser close");
		DriverFactory.quitDriver();

	}

	/*
	 * BEFORE HOOK - Browser setup STEP 1 - Launch Application STEP 2 - Enter
	 * Credentials STEP 3 - Verify Login AFTER HOOK - Browser close
	 */

	@Before("@PAC")
	public void pacHook() {
		//System.out.println("PAC TAGGED HOOK");
		LoggerUtil.logger.info("===== TEST EXECUTION STARTED for PAC TAGGED HOOK =====");

	}

	@Before("@AWP")
	public void pawpHook() {
		//System.out.println("AWP TAGGED HOOK");
		LoggerUtil.logger.info("===== TEST EXECUTION STARTED for AWD TAGGED HOOK =====");

	}

	@Before("@Regression")
	public void regHook() {
		//System.out.println("REG TAGGED HOOK");
		LoggerUtil.logger.info("===== TEST EXECUTION STARTED for REGRESSION TAGGED HOOK =====");

	}
}
