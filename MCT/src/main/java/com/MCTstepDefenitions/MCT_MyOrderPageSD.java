package com.MCTstepDefenitions;

import com.MCTpages.MCT_HomePage;
import com.MCTpages.MCT_MyOrderPage;
import common.BDDWebAPI;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class MCT_MyOrderPageSD extends MCT_HomePage {

    @When("I goto myaccount page")
    public void i_goto_myaccount_page() throws InterruptedException {
        MCT_MyOrderPage.i_goto_myaccount_page_Step();
    }

    @When("I navigate to order page")
    public void i_navigate_to_order_page() {
        MCT_MyOrderPage.i_navigate_to_order_page_Step();
    }

    @Then("I see a table with al lmy orderes")
    public void i_see_a_table_with_al_lmy_orderes() throws IOException {
        MCT_MyOrderPage.i_see_a_table_with_al_lmy_orderes_Step();
    }

    @Then("I exepct count {int} in my order table")
    public void i_exepct_count_in_my_order_table(Integer exepctcount) {
        MCT_MyOrderPage.i_exepct_count_in_my_order_table_Step(exepctcount);
    }



}
