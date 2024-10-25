package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

public class ExtendReport {

    @CucumberOptions(
            features = {"src/test/java/FeatureFiles"
            },
            glue = {"StepDefinitions"},
            plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
    )
    public class _07_ExtendReport extends AbstractTestNGCucumberTests {

    }

}
