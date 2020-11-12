package com.MCTHooks;

import com.MCTpages.MCT_FooterHomePG;
import com.MCTpages.MCT_HomePage;
import com.MCTstepDefenitions.MCT_FooterHomePgSD;
import com.MCTstepDefenitions.MCT_HomePageSD;
import common.BDDWebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class MCTHook extends BDDWebAPI {
    public static MCT_HomePage mCT_HomePage;
    public static MCT_HomePageSD mCT_HomePageSD;
    public static MCT_FooterHomePG mct_footerHomePG;
    public static MCT_FooterHomePgSD mct_footerHomePgSD;


    public static void Init(){
        mCT_HomePage = PageFactory.initElements(driver, MCT_HomePage.class);
        mCT_HomePageSD = PageFactory.initElements(driver, MCT_HomePageSD.class);
        mct_footerHomePG = PageFactory.initElements(driver, MCT_FooterHomePG.class);
        mct_footerHomePgSD = PageFactory.initElements(driver, MCT_FooterHomePgSD.class);

    }
    @Before
    public void rampUp() throws IOException {
        setUp(false, "browserstack", "Windows", "10", "chrome", "86", "https://demo.iscripts.com/multicart/demo/index.php");
        Init();
    }
    @After
    public void rampDown() {
        driver.quit(); }

}
