package com.MCTHooks;

import com.MCTpages.MCT_HomePage;
import com.MCTpages.MCT_MyAccountPage;
import com.MCTpages.MCT_MyOrderPage;
import com.MCTstepDefenitions.MCT_HomePageSD;
import com.MCTstepDefenitions.MCT_MyAccountPageSD;
import com.MCTstepDefenitions.MCT_MyOrderPageSD;
import common.BDDWebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class MCTHook extends BDDWebAPI {
    public static MCT_HomePage mCT_HomePage;
    public static MCT_HomePageSD mCT_HomePageSD;
    public static MCT_MyAccountPage mct_MyAccountLable;
    public static MCT_MyAccountPageSD mct_MyAccountLableSD;
    public static MCT_MyOrderPage mct_MyOrderPage;
    public static MCT_MyOrderPageSD mct_MyOrderPageSD;
    public static void Init(){
        mCT_HomePage = PageFactory.initElements(driver, MCT_HomePage.class);
        mCT_HomePageSD = PageFactory.initElements(driver, MCT_HomePageSD.class);
        mct_MyAccountLable = PageFactory.initElements(driver, MCT_MyAccountPage.class);
        mct_MyAccountLableSD = PageFactory.initElements(driver, MCT_MyAccountPageSD.class);
        mct_MyOrderPage = PageFactory.initElements(driver, MCT_MyOrderPage.class);
        mct_MyOrderPageSD = PageFactory.initElements(driver, MCT_MyOrderPageSD.class);
    }
    @Before
    public void rampUp() throws IOException {
        setUp(false, "browserstack", "ox", "catalina", "chrome", "86", "https://demo.iscripts.com/multicart/demo/index.php");
        Init();
    }
    @After
    public void rampDown() {
        driver.quit(); }

}
