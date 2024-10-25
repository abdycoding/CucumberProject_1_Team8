package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
            tags = "@RegressionTest",
            features = {
                    "src/test/java/FeatureFiles/_02_UserLogin.feature",
                    "src/test/java/FeatureFiles/_03_BillPaymentFunctionality.feature",
                    "src/test/java/FeatureFiles/_04_AccountCreation.feature"},
            glue = {"StepDefinitions"},
            plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
    )

    public class RegressionTesting extends AbstractTestNGCucumberTests {
    }

