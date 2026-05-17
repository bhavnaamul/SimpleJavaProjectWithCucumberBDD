package pages;

import factory.DriverFactory;
import utility.LoggerUtil;
/*
 * 
 * Central place for:

common methods
driver access
reusable actions


Page classes should NOT initialize driver.

Hooks + DriverFactory manage lifecycle.
 * 
 * */

public class BasePage {
	public void loadApplication() {
		LoggerUtil.logger.info("Application Loaded Using -> " + DriverFactory.getDriver());
		//System.out.println("Application Loaded Using -> " + DriverFactory.getDriver());
	}

}
