package factory;

/*
 * 
 * This helps understand:

thread isolation
driver lifecycle
 * 
 * */

public class DriverFactory {
	private static ThreadLocal<String> driver = new ThreadLocal<>();

	public static void initDriver() {
		String threadName = Thread.currentThread().getName();

		driver.set("Chrome Started -> " + threadName);

		System.out.println("Driver Initialized -> " + threadName);

		driver.set("Chrome Browser Started");

		System.out.println(driver.get());
	}

	public static String getDriver() {

		return driver.get();
	}

	public static void quitDriver() {

		System.out.println("Browser Closed");

		System.out.println("Driver Quit -> " + Thread.currentThread().getName());

		driver.remove();
	}

}
