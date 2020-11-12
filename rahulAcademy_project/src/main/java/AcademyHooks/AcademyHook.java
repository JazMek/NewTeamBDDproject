package AcademyHooks;

import AcademyPages.Academy_HomePage;
import AcademyStepDefenition.Academy_HomePageSD;
import academyWebelement.Academy_HP_WebElement;
import common.BDDWebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class AcademyHook extends BDDWebAPI {

    public static Academy_HomePage academy_HomePage;
    public static Academy_HomePageSD academy_HomePageSD;
    public static Academy_HP_WebElement academy_hp_webElement;

    public static void Init(){
        academy_HomePage = PageFactory.initElements(driver, Academy_HomePage.class);
        academy_HomePageSD = PageFactory.initElements(driver, Academy_HomePageSD.class);
        academy_hp_webElement = PageFactory.initElements(driver, Academy_HP_WebElement.class);

    }
    @Before
    public void rampUp() throws IOException {
        setUp(false, "browserstack", "Windows", "10", "chrome", "86", "https://rahulshettyacademy.com/dropdownsPractise/");
        Init();
    }
    @After
    public void rampDown() {
        driver.quit(); }

}



