package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = "src/test/resources/feature/Login.feature",
        glue = {"stepDefinitions", "hooks"},
        plugin = {"pretty"},
        monochrome = true
)

public class TestRunner
        extends AbstractTestNGCucumberTests {
	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {

        return super.scenarios();
    }
	
}

