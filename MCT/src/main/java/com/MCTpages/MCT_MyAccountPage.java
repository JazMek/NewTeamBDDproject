package com.MCTpages;

import common.BDDWebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

public class MCT_MyAccountPage extends BDDWebAPI {
    public static final String mct_HomePage_profileNameLabel_XP = "//i[@class='fa fa-user-circle-o']";
    @FindBy(how = How.XPATH, using = mct_HomePage_profileNameLabel_XP)
    public static WebElement mct_HomePage_profileNameLabel;
    public static final String mct_HomePage_myAccountLink_XP = "//i[@class='fa fa-user-o']";
    @FindBy(how = How.XPATH, using = mct_HomePage_myAccountLink_XP)
    public static WebElement mct_HomePage_myAccountLink;
    public static final String MCT_myAccountLabel_XP = "//*[@id='item_details']/section/div/h3";
    @FindBy(how = How.XPATH, using = MCT_myAccountLabel_XP)
    public static WebElement MCT_myAccountLabel;
    public static final String MCT_MyAccount_List_XP = "//div[@class='myaccount_list']";
    @FindBy(how = How.XPATH, using = MCT_MyAccount_List_XP)
    public static WebElement MCT_MyAccount_List;

    public static void user_go_to_his_myaccount_page_Step() {
        mct_HomePage_profileNameLabel.click();
        mct_HomePage_myAccountLink.click();
    }

    public static void user_see_his_account_label_Step() {
        MCT_myAccountLabel.getText();
    }

    public static List<String> getAllOptions() {
        List<String> actualOptionResultList = new ArrayList<>();
        // Get the Locators Of all the Option And Return the Text in All Options Back
        List<WebElement> alloptionsinUI = MCT_MyAccount_List.findElements(By.xpath(MCT_MyAccount_List_XP));
        System.out.println("Total List Size " + alloptionsinUI.size());
        for (int i = 0; i < alloptionsinUI.size(); i++) {
            System.out.println(alloptionsinUI.get(i).getText());
            actualOptionResultList.add(alloptionsinUI.get(i).getText());
        }
        return actualOptionResultList;
    }

    protected static void user_see_all_my_account_options_in_below_table_Step() {
        MCT_MyAccountPage.getAllOptions();
    }


}