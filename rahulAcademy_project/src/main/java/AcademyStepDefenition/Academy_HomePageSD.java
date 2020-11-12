package AcademyStepDefenition;

import AcademyPages.Academy_HomePage;
import common.BDDWebAPI;
import io.cucumber.java.en.*;

public class Academy_HomePageSD extends Academy_HomePage {

    Academy_HomePage academy_homePage;


    @Given("user open url and navigate to academy rahul Home page")
    public void user_open_url_and_navigate_to_academy_rahul_Home_page() {
        academy_homePage = new Academy_HomePage();
        academy_homePage.user_open_url_and_navigate_to_academy_rahul_Home_page_test();

    }

    @When("user write the word {string} at autosuggestion menu dropDown")
    public void user_write_the_word_at_autosuggestion_menu_dropDown(String data) {
        academy_homePage.user_write_the_word_at_autosuggestion_menu_dropDown_Test(data);
    }

    @Then("user can see all country suggestions list and can select the country")
    public void user_can_see_all_country_suggestions_list_and_can_select_the_country() throws InterruptedException {
        academy_homePage.user_can_see_all_country_suggestions_list_and_can_select_the_country_Test();

    }





}
