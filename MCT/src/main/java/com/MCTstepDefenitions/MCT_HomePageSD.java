package com.MCTstepDefenitions;

import com.MCTpages.MCT_HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;
import static com.MCTHooks.MCTHook.mCT_HomePage;
import static com.MCTHooks.MCTHook.mCT_HomePageSD;
public class MCT_HomePageSD extends MCT_HomePage {

    @Given("User enters the URL")
    public void user_enters_the_URL() {
        mCT_HomePageSD.user_enters_the_URL_Step();
    }
    @When("User lands on the Home page")
    public void user_lands_on_the_Home_page() {
        mCT_HomePage.user_lands_on_the_Home_page_Step();
    }
    @Then("User should see URL")
    public void user_should_see_URL() {
        mCT_HomePageSD.user_should_see_Step();
    }
    @Given("User click on the forward button")
    public void user_click_on_the_forward_button() throws InterruptedException {
        mCT_HomePageSD.user_click_on_the_forward_button_Step();
    }
    @Then("User should see a forward home page picture")
    public void user_should_see_a_forward_home_page_picture() {
        mCT_HomePageSD.user_should_see_a_forward_home_page_picture_Step();
    }
    @Given("User click on the previous button")
    public void user_click_on_the_previous_button() throws InterruptedException {
        mCT_HomePageSD.user_click_on_the_previous_button_Step();
    }
    @Then("User should see a previous home page picture")
    public void User_should_see_a_previous_home_page_picture() {
        mCT_HomePageSD.User_should_see_a_previous_home_page_picture_Step();
    }
    @Given("User is on MCT home page")
    public void user_is_on_MCT_home_page() {
        mCT_HomePageSD.user_is_on_MCT_home_page_Step();
    }
    @When("User complete login with id {string} password {string}")
    public void user_complete_login_with_id_password(String string, String string2) throws InterruptedException {
        mCT_HomePageSD.user_complete_login_with_id_password_Step("user","pass");
    }
    @Then("User see  profile name as {string}")
    public void user_see_profile_name_as(String profileNameLabel) {
        profileNameLabel = "james williams"; //"jaz mek";
        mCT_HomePageSD.user_see_profile_name_as_Step(profileNameLabel);
    }

}
