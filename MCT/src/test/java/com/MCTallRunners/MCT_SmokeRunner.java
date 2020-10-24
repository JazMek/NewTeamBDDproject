package com.MCTallRunners;

//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="src/main/java/com/MCTallFeatures",
        glue = {"com.MCTstepDefenitions","com.MCTHooks"},
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"},
        strict = true
//        tags = "@AdvancedSearchSearchIncluding"
)
public class MCT_SmokeRunner extends AbstractTestNGCucumberTests{
}
