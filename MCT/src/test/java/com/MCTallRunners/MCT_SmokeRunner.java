package com.MCTallRunners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features ="src/main/java/com/MCTallFeatures",
        glue = {"com.MCTstepDefenitions","com.MCTHooks"},
        plugin = "pretty"
//        tags = "@AdvancedSearchSearchIncluding"
)
public class MCT_SmokeRunner extends AbstractTestNGCucumberTests{
}
