package com.MCTallRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = {"src/main/java/com/MCTallFeatures"},
        glue ={"com.MCTstepDefenitions","com.MCTHooks"},
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"},
//        strict = true,
        monochrome = true,
        dryRun = false
// tags = " ( @Regression or @smokeTest ) and not @pending "
// tags = {"@Regression or @smokeTest or "}
// tags={"@Test1,@Test2"}

)

public class MCT_EndToEndRunner extends AbstractTestNGCucumberTests {
}
