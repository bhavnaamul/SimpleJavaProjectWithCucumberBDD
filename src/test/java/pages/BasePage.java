package pages;

import factory.DriverFactory;
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

	        System.out.println(
	                "Application Loaded Using -> "
	                        + DriverFactory.getDriver()
	        );
	    }

}
