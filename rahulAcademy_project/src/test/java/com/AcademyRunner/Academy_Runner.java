package com.AcademyRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\main\\java\\AcademyFeatures\\Academy_homePage.feature"},
                  glue = {"AcademyStepDefenition","AcademyHooks"},
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"},
        monochrome = true,
        strict = true,
        dryRun = false
)

public class Academy_Runner {
}
