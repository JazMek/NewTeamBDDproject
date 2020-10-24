package com.MCTpages;

import com.MCTstepDefenitions.MCT_HomePageSD;
import common.BDDWebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

public class MCT_HomePage extends BDDWebAPI {
    public static final String mct_HomePage_forwardButton_XP = "//a[contains(text(),'Next')]";//*[@class='next']
    @FindBy(how = How.XPATH, using = mct_HomePage_forwardButton_XP)
    public static WebElement mct_HomePage_forwardButton;
    public static final String mct_HomePage_prevButton_XP = "//a[contains(text(),'Previous')]";//*[@class='prev']
    @FindBy(how = How.XPATH, using = mct_HomePage_prevButton_XP)
    public static WebElement mct_HomePage_prevButton;
    public static final String mct_HomePage_forwardImg_XP = "//img[contains(@src,'1514352896.jpg')]";
    @FindBy(how = How.XPATH, using = mct_HomePage_forwardImg_XP)
    public static WebElement mct_HomePage_forwardImg;
    public static final String mct_HomePage_previousImg_XP = "//img[contains(@src,'1514352879.jpg')]";
    @FindBy(how = How.XPATH, using = mct_HomePage_previousImg_XP)
    public static WebElement mct_HomePage_previousImg;
    //**********************
    public static final String mct_HomePage_loginLink_XP = "//button[@id='dLabellogin']";
    @FindBy(how = How.XPATH, using = mct_HomePage_loginLink_XP)
    public static WebElement mct_HomePage_loginLink;
    public static final String mct_HomePage_usernameFIeld_XP = "//input[@id='username']";
    @FindBy(how = How.XPATH, using = mct_HomePage_usernameFIeld_XP)
    public static WebElement mct_HomePage_usernameFIeld;
    public static final String mct_HomePage_myAccountLink_XP = "//i[@class='fa fa-user-o']";
    @FindBy(how = How.XPATH, using = mct_HomePage_myAccountLink_XP)
    public static WebElement mct_HomePage_myAccountLink;
    public static final String mct_HomePage_passwordField_XP = "//input[@id='password']";
    @FindBy(how = How.XPATH, using = mct_HomePage_passwordField_XP)
    public static WebElement mct_HomePage_passwordField;
    public static final String mct_HomePage_loginButton_XP = "//button[@id='jqLogin']";
    @FindBy(how = How.XPATH, using = mct_HomePage_loginButton_XP)
    public static WebElement mct_HomePage_loginButton;


    public static String URL = "https://www.demo.iscripts.com/multicart/demo/index.php";

    public void user_enters_the_URL_Step() {
        driver.get(URL);
    }

    public void user_lands_on_the_Home_page_Step() {
        driver.getCurrentUrl();
    }

    public void user_should_see_Step() {
        Assert.assertEquals(URL, driver.getCurrentUrl());
    }

    public void user_click_on_the_forward_button_Step() throws InterruptedException {
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //mct_HomePage_forwardButton.click();
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", mct_HomePage_forwardButton);

    }
    protected void user_should_see_a_forward_home_page_picture_Step() {
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mct_HomePage_forwardImg.isDisplayed();
    }
    public void user_click_on_the_previous_button_Step() throws InterruptedException {
        Thread.sleep(2000);
        //mct_HomePage_prevButton.click();
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", mct_HomePage_prevButton);

    }

    public void User_should_see_a_previous_home_page_picture_Step() {
       mct_HomePage_previousImg.isDisplayed();
    }

   public void user_is_on_MCT_home_page_Step() {
       mct_HomePage_loginLink.click();
    }

    public void user_complete_login_with_id_password_Step(String id,String password) throws InterruptedException {
        id = "user";//"jaz07";
        password = "pass";//"jaz07";
        mct_HomePage_loginLink.click();
       mct_HomePage_usernameFIeld.sendKeys(id);
       mct_HomePage_passwordField.sendKeys(password);
       mct_HomePage_loginButton.click();
       sleepFor(5);
    }

    public void user_see_profile_name_as_Step(String profileNameLabel) {
        profileNameLabel = "james williams";//"jaz mek";
       String profilName= driver.findElement(By.xpath("//*[@id=\"dLabel\"]/span")).getText();;
        System.out.println(profilName);
        Assert.assertEquals(profileNameLabel,profilName.toLowerCase());

    }

}
