package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

/**
 * Created by tfasoyiro on 04/03/2016.
 */
public class AudiCommonPage extends PageObject {
    private By topHeader = By.cssSelector(".header-top-wrapper");
    private By buildYourAudi = By.cssSelector(".btn-primary.audi_icon_build>a");
    private By financeAndOffers = By.cssSelector(".audi_icon_price>a");
    private By testDrive = By.cssSelector(".audi_icon_testdrive>a");
    private By findAudiCentre = By.cssSelector(".audi_icon_locator>a");
    private By yourAudi = By.cssSelector(".yourAudi");
    private By searchText = By.cssSelector("#searchtext");
    private By searchSubmit = By.cssSelector("#sitesearchSubmit");
    private By logo = By.cssSelector(".pull-right>img");
    private By audiRangeBottom = By.cssSelector(".row.audiRange");
    private By audiFooter = By.cssSelector(".mainSection");
    private By audiApps = By.cssSelector(".audiApps");
    private By socialShare = By.cssSelector(".socialSharing");

    //ecomerch
    private By topCategory = By.cssSelector("#ui-id-2");
    private By audiEcomBody = By.cssSelector("");
    private By ecomCarousel = By.cssSelector("");
    private By heroBanner = By.cssSelector("");

    //for Login Page
    private String loginPageTitle = "Customer Login";
    private By loginPageBody = By.cssSelector(".customer-account-login.page-layout-1column");
    private By userName = By.cssSelector("#email[name*=login]");
    private By passWord = By.cssSelector("#pass[name*=login]");
    private By btnLogin = By.cssSelector("#send2[class*=primary]");
    private By createAccount = By.cssSelector(".action.create.primary");
    private By forgotPassword = By.cssSelector(".action.remind>span");

    public String stringFooter(){
        return waitForExpectedElement(audiFooter).getText();
    }

    public void audiCommonVP (){
        waitForExpectedElement(topHeader).isDisplayed();
        waitForExpectedElement(logo).isDisplayed();
        waitForExpectedElement(audiRangeBottom).isDisplayed();
        waitForExpectedElement(audiFooter).isDisplayed();
        waitForExpectedElement(audiApps).isDisplayed();
        waitForExpectedElement(socialShare).isDisplayed();
    }


}
