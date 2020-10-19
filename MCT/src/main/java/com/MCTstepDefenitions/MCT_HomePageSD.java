package com.MCTstepDefenitions;

import com.MCTpages.MCT_HomePage;
import common.BDDWebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

public class MCT_HomePageSD extends BDDWebAPI {
    public static MCT_HomePage mCT_HomePage;
    public static MCT_HomePageSD mCT_HomePageSD;
    public static void Init(){
        mCT_HomePage = PageFactory.initElements(driver, MCT_HomePage.class);
        mCT_HomePageSD = PageFactory.initElements(driver, MCT_HomePageSD.class);
    }
    @Before
    public void rampUp() throws IOException {
        setUp(false, "browserstack", "ox", "catalina", "chrome", "86", "https://demo.iscripts.com/multicart/demo/index.php");
        Init();
    }
    @After
    public void rampDown() {
        driver.quit(); }

    @Given("User enters the URL")
    public void user_enters_the_URL() {
        mCT_HomePage.user_enters_the_URL_Step();
    }
    @When("User lands on the Home page")
    public void user_lands_on_the_Home_page() {
        mCT_HomePage.user_lands_on_the_Home_page_Step();
    }
    @Then("User should see URL")
    public void user_should_see_URL() {
        mCT_HomePage.user_should_see_Step();
    }
}
