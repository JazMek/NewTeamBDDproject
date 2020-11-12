package AcademyPages;

import common.BDDWebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static academyWebelement.Academy_HP_WebElement.*;

public class Academy_HomePage extends BDDWebAPI {


    public void user_open_url_and_navigate_to_academy_rahul_Home_page_test() {
//        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://rahulshettyacademy.com/dropdownsPractise/",actualUrl);
    }

    public void user_write_the_word_at_autosuggestion_menu_dropDown_Test(String data) {
        driver.findElement(By.xpath(autoseggestion_XP)).sendKeys("fr");
    }

    public void user_can_see_all_country_suggestions_list_and_can_select_the_country_Test() throws InterruptedException {
        /** First Method */
        List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
        System.out.println(list.size());

        /** Lambda Expression */
        list.forEach(elemnt -> System.out.println(elemnt.getText()));
        for (WebElement ele: list){
            if (ele.getText().equalsIgnoreCase("france")){
                ele.click();
                System.out.println(ele.getText());
                Thread.sleep(3000);
            }

        }

        /** Second Method */
//        for (int i=1; i<8;i++){
//             WebElement list = driver.findElement(By.xpath("//ul[@id='ui-id-1']/li["+i+"]"));
//            System.out.println(list.getText());
//            if (list.getText().equalsIgnoreCase("france")){
//                list.click();
//                Thread.sleep(4000);
//            }
//        }


        // lamda expression :
//        list.forEach(element -> System.out.print(element.getText()+" "));
    }
}
