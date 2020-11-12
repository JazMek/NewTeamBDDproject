package com.MCTpages;

import com.MCTstepDefenitions.MCT_HomePageSD;
import common.BDDWebAPI;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class MCT_HomePage extends BDDWebAPI {


    public static String URL="https://www.demo.iscripts.com/multicart/demo/index.php";
    public void user_enters_the_URL_Step() {
        driver.get(URL);
    }
    public void user_lands_on_the_Home_page_Step() {
        driver.getCurrentUrl();
    }
    public void user_should_see_Step() {
        Assert.assertEquals(URL,driver.getCurrentUrl());
    }
}
