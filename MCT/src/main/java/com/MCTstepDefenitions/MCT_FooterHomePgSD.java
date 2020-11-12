package com.MCTstepDefenitions;

import com.MCTpages.MCT_FooterHomePG;
import io.cucumber.java.en.*;

public class MCT_FooterHomePgSD extends MCT_FooterHomePG{

    MCT_FooterHomePG mct_footerHomePG;
    // Scenario 1
    @Given("User lands on MCT Home Page")
    public void user_lands_on_MCT_Home_Page() {
        mct_footerHomePG = new MCT_FooterHomePG();
        mct_footerHomePG.user_lands_on_MCT_Home_Page_Step();
    }

    @Then("user scroll down to footer home page and see all the Links")
    public void user_scroll_down_to_footer_home_page_and_see_all_the_Links() throws InterruptedException {
        mct_footerHomePG.user_scroll_down_to_footer_home_page_and_see_all_the_Links_Step();
    }
    // Scenario 2 :
    @Then("user scroll down to footer")
    public void user_scroll_down_to_footer() throws InterruptedException {
        mct_footerHomePG.user_scroll_down_to_footer_step();
    }

    @And("click on View Cart link")
    public void click_on_View_Cart_link() throws InterruptedException {
        mct_footerHomePG.click_on_View_Cart_link_Step();
    }




}
