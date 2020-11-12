package com.MCTstepDefenitions;

import com.MCTpages.MCT_MyAccountPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MCT_MyAccountPageSD extends MCT_MyAccountPage {
    @Given("User go to his Account page")
    public void user_go_to_his_Account_page() {
        MCT_MyAccountPage.user_go_to_his_myaccount_page_Step();
    }

    @Then("User see his account  label")
    public void user_see_my_account_label() {
        MCT_MyAccountPage.user_see_his_account_label_Step();
    }

    @Then("User see all his account options in below table")
    public void user_see_all_my_account_options_in_below_table(io.cucumber.datatable.DataTable dataTable) {
        MCT_MyAccountPage.user_go_to_his_myaccount_page_Step();
        MCT_MyAccountPage.user_see_all_my_account_options_in_below_table_Step();
    }

}
