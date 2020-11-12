package com.MCTpages;

import common.BDDWebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.swing.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static com.MCTHooks.MCTHook.mCT_HomePage;

public class MCT_FooterHomePG extends BDDWebAPI {

    private static final String URL = "https://www.demo.iscripts.com/multicart/demo/index.php";
    MCT_HomePage mCT_HomePage;

             /******** WebElements *******/
    public static final String get_To_know_us_Link_XP= "//h1[contains(text(),'Get to know us')]";
    @FindBy(how = How.XPATH, using = get_To_know_us_Link_XP)
    public static WebElement get_To_know_us_Link_WbE;
    public static final String footerXP = "//section[@class ='footersep']";
    @FindBy(how = How.XPATH , using = footerXP)
    public static WebElement footerWebElement;
    public static final String table_getToKnowUs_XP = "//div[@class='col-xs-12 col-sm-6 col-md-3'][1]";
    @FindBy(how = How.XPATH , using = table_getToKnowUs_XP)
    public static WebElement table_getToKnowUs;
    public static final String viewCart_Link_Xp = "//a[contains(text(),'View Cart')]";
    @FindBy(how = How.XPATH, using = viewCart_Link_Xp)
    public static WebElement viewCart_Link;

           /******** Action Methods *******/
    public void user_lands_on_MCT_Home_Page_Step() {
        driver.get(URL);
        String getCurrentUrl = driver.getCurrentUrl();
        System.out.println("this is the current Url of Home Page : "+getCurrentUrl);
    }
    public void user_scroll_down_to_footer_home_page_and_see_all_the_Links_Step() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);",get_To_know_us_Link_WbE);
        boolean get_To_know_us_Link = get_To_know_us_Link_WbE.isDisplayed();
        System.out.println("**** this are the links displayed at 'get_To_know_us_Link' table *** ");

        // list of links displayed at 'get_To_know_us' Table
        List<WebElement> list_table_getToKnowUs = driver.findElements((By.xpath(table_getToKnowUs_XP)));
        for (int i= 0; i< list_table_getToKnowUs.size(); i++){
            String list_table_1 = list_table_getToKnowUs.get(i).getText();
            System.out.println(list_table_1);
//            if (list_table_1.contains("Contact Us")){
//                break;
//            }
        }
        //list of links for the whole Footer
//        List<WebElement> listFooterLinks = driver.findElements(By.xpath(footerXP));
//        System.out.println("this is the number of links in the footer : "+ listFooterLinks.size());
//        int count = 0;
//        for (int i = 0; i< listFooterLinks.size();i++){
//            String listLink = listFooterLinks.get(i).getText();
//            System.out.println(i+""+listLink);
//            count ++;
//        }
//        System.out.println(count);
    }
        // Scenario 2 :
    public void user_scroll_down_to_footer_step()  {
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].scrollIntoView(true);",get_To_know_us_Link_WbE);
        
    }

    public void click_on_View_Cart_link_Step() throws InterruptedException {
        Actions mouseOver = new Actions(driver);
        mouseOver.moveToElement(viewCart_Link).click(viewCart_Link).build().perform();
//        viewCart_Link.click();
        sleepFor(5);
//        driver.findElement(By.xpath(viewCart_Link_Xp)).click();
//        sleepFor(5);
//        System.out.println(driver.getCurrentUrl());

//        List<WebElement> listfooter = driver.findElements(By.xpath(footerXP));
//        for (WebElement list: listfooter) {
//            if (list.getText().contains("View Cart")){
//                Thread.sleep(3000);
////                viewCart_Link.click();
//                Thread.sleep(4000);
//                System.out.println(driver.getCurrentUrl());
//                break;
//            }
//        }
    }
}
