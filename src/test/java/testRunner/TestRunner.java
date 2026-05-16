package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = "src/test/resources/feature/Dashboard.feature",
       // tags = "@Smoke",
        glue = {"stepDefinition", "hooks"},
        plugin = {"pretty"},
        monochrome = true
)

public class TestRunner
        extends AbstractTestNGCucumberTests {
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {

        return super.scenarios();
    }
	
}

