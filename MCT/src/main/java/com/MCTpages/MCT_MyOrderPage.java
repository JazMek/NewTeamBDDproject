package com.MCTpages;

import common.BDDWebAPI;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MCT_MyOrderPage extends BDDWebAPI {
    public static final String mct_MyOrderPage_MyOrdersLinkClick_XP = "//div[@class='myaccount_list_img']";
    @FindBy(how =How.XPATH, using = mct_MyOrderPage_MyOrdersLinkClick_XP )
    public static WebElement mct_MyOrderPage_MyOrdersLinkClick;
    public static final String mct_MyOrderPage_myOrderTable_XP = "//table[@class='table table-bordered oder_table']";
    @FindBy(how = How.XPATH, using = mct_MyOrderPage_myOrderTable_XP)
    public static WebElement mct_MyOrderPage_myOrderTable;
    public static final String mct_MyOrderPage_allTableRows_XP = "//table[@class='table table-bordered oder_table']//tr";
    @FindBy(how = How.XPATH, using = mct_MyOrderPage_allTableRows_XP)
    public static WebElement mct_MyOrderPage_allTableRows;
    public static final String mct_HomePage_profileNameLabel_XP = "//i[@class='fa fa-user-circle-o']";
    @FindBy(how = How.XPATH, using = mct_HomePage_profileNameLabel_XP)
    public static WebElement mct_HomePage_profileNameLabel;
    public static final String mct_HomePage_myAccountLink_XP = "//i[@class='fa fa-user-o']";
    @FindBy(how = How.XPATH, using = mct_HomePage_myAccountLink_XP)
    public static WebElement mct_HomePage_myAccountLink;
public static final String MCT_Row_XP = "//table[@class='table table-bordered oder_table']//tr[2]";
    @FindBy(how = How.XPATH, using = MCT_Row_XP)
    public static WebElement MCT_Row;
    public static void i_goto_myaccount_page_Step() throws InterruptedException {
        mct_HomePage_profileNameLabel.click();
        mct_HomePage_myAccountLink.click();
    }

    public static void i_navigate_to_order_page_Step() {
        mct_MyOrderPage_MyOrdersLinkClick.click();
    }

    public static void i_see_a_table_with_al_lmy_orderes_Step() throws IOException {
       boolean result = mct_MyOrderPage_allTableRows.isDisplayed();
       if(result == true){
           TakesScreenshot shot = (TakesScreenshot)driver;
           File file = shot.getScreenshotAs(OutputType.FILE);
          //String orderTableScrennSot;
           //String destPath = System.getProperty(("user.dir") +“/target/cucumber-reports/” + orderTableScrennSot +”.png”));
           //FileUtils.copyFile(file,path);
           FileUtils.copyFile(file,new File("target/cucumber-reports/MCT.png"));
           //        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        // now copy the screenshot  to desired location using copyFile //method
//        FileUtils.copyFile(src,new File("src/ScreenShot//MCT.png"));


       }
    }
    public static void getTotalTableRowsCount() {

       // return mct_MyOrderPage_allTableRows.findElements(By.xpath((mct_MyOrderPage_allTableRows_XP))).size();
        //System.out.println(mct_MyOrderPage_allTableRows.findElements(By.xpath((mct_MyOrderPage_allTableRows_XP))).size()-1);
//int count =mct_MyOrderPage_allTableRows.findElements(By.xpath((mct_MyOrderPage_allTableRows_XP))).size()-1;
       // System.out.println(count);
        List<WebElement> MyOrderList = mct_MyOrderPage_allTableRows.findElements(By.xpath((mct_MyOrderPage_allTableRows_XP)));

        MyOrderList.remove(0);
        int count=MyOrderList.size();
        System.out.println(count);
        for (WebElement element:MyOrderList) {

            System.out.println(element.getText());
        }
//        WebElement SecondRowData = MCT_Row.findElement(By.xpath(MCT_Row_XP));
//        System.out.println(SecondRowData.size());
//        for (WebElement element1:SecondRowData) {
//            System.out.println(element1.getText());
//        }
    //    String karim = SecondRowData.getText();
     //   System.out.println("***************************************"+karim);

//      List<WebElement> str=  driver.findElements(By.xpath("//table[@class='table table-bordered oder_table']//tr[2]/td"));
//        for (WebElement amr:str) {
//            System.out.println(amr.getText());
//        }
//        System.out.println(str.size());
    }
    public static void i_exepct_count_in_my_order_table_Step(Integer exepctcount) {

        getTotalTableRowsCount();

    }
}