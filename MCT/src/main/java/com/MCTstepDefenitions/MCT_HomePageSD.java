package com.MCTstepDefenitions;

import com.MCTpages.MCT_HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.MCTHooks.MCTHook.mCT_HomePage;

public class MCT_HomePageSD extends MCT_HomePage {

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
