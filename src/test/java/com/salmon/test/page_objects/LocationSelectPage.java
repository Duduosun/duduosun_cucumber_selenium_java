package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

/**
 * Created by tfasoyiro on 18/09/2015.
 */
public class LocationSelectPage extends PageObject {

    //private String locationPageTitle = "Location Select - Selfridges | Shop Online";
    private String locationPageTitle = "Country Select - Selfridges | Shop Online";

    private By countrySelectBody = By.id("pgcountryselectdesktop");
    private By countryFlagWrapper = By.className("country-flag-wrapper");
    private By countrySearch = By.className("countrysearch");
    private By continueButton = By.cssSelector(".js-continueButton.btnN.btnN3.proceed");
    private By deliveryInformation = By.className("deliverySnippet");

    private By regions = By.cssSelector(".regions");
    private By countryAustralia = By.cssSelector(".flag.AU");
    private By countryCanada = By.cssSelector(".flag.CA");
    private By countryChina = By.cssSelector(".flag.CN");
    private By countryFrance = By.cssSelector(".flag.FR");
    private By countryGermany = By.cssSelector(".flag.DE");
    private By countryHongKong = By.cssSelector(".flag.HK");
    private By countryIreland = By.cssSelector(".flag.IE");
    private By countryItaly = By.cssSelector(".flag.IT");
    private By countryJapan = By.cssSelector(".flag.JP");
    private By countryKuwait = By.cssSelector(".flag.KW");
    private By countryMacau = By.cssSelector(".flag.MO");
    private By countryNetherlands = By.cssSelector(".flag.NL");
    private By countryQatar = By.cssSelector(".flag.QA");
    private By countrySaudiArabia = By.cssSelector(".flag.SA");
    private By countrySingapore = By.cssSelector(".flag.SG");
    private By countrySpain = By.cssSelector(".flag.ES");
    private By countryTaiwan = By.cssSelector(".flag.TW");
    private By countryUnitedArabEmirates = By.cssSelector(".flag.AE");
    private By countryUnitedKingdom = By.cssSelector(".flag.GB");
    private By countryUnitedStates = By.cssSelector(".flag.US");


    public void clickContinue(){
        waitForExpectedElement(continueButton).click();
    }
    public void clickFrance(){waitForExpectedElement(countryAustralia).click();}

    public void clickCountry(String country){
        switch (country) {
            case "Australia" : {
                waitForExpectedElement(countryAustralia).click();
                break;
            }
            case "Canada" : {
                waitForExpectedElement(countryCanada).click();
                break;
            }
            case "China" : {
                waitForExpectedElement(countryChina).click();
                break;
            }
            case "France" : {
                waitForExpectedElement(countryFrance).click();
                break;
            }
            case "Germany" : {
                waitForExpectedElement(countryGermany).click();
                break;
            }
            case "Hong Kong" : {
                waitForExpectedElement(countryHongKong).click();
                break;
            }
            case "Ireland" : {
                waitForExpectedElement(countryIreland).click();
                break;
            }
            case "Italy" : {
                waitForExpectedElement(countryItaly).click();
                break;
            }
            case "Japan" : {
                waitForExpectedElement(countryJapan).click();
                break;
            }
            case "Kuwait" : {
                waitForExpectedElement(countryKuwait).click();
                break;
            }
            case "Macau" : {
                waitForExpectedElement(countryMacau).click();
                break;
            }
            case "Netherlands " : {
                waitForExpectedElement(countryNetherlands).click();
                break;
            }
            case "Qatar " : {
                waitForExpectedElement(countryQatar).click();
                break;
            }
            case "Saudi Arabia" : {
                waitForExpectedElement(countrySaudiArabia).click();
                break;
            }
            case "Singapore" : {
                waitForExpectedElement(countrySingapore).click();
                break;
            }
            case "Spain" : {
                waitForExpectedElement(countrySpain).click();
                break;
            }
            case "Taiwan" : {
                waitForExpectedElement(countryTaiwan).click();
                break;
            }
            case "UAE" : {
                waitForExpectedElement(countryUnitedArabEmirates).click();
                break;
            }
            case "UK" : {
                waitForExpectedElement(countryUnitedKingdom).click();
                break;
            }
            case "USA" : {
                waitForExpectedElement(countryUnitedStates).click();
                break;
            }
        }
    }
    public void vpCountrySelect(){
        waitForExpectedElement(countrySelectBody).isDisplayed();
        waitForExpectedElement(countryFlagWrapper).isDisplayed();
        waitForExpectedElement(deliveryInformation).isDisplayed();
    }

    public String stringLocationPageTitle (){
        return locationPageTitle;
    }
    public String returnCountry() {
        String retval = "";
        retval = waitForExpectedElement(regions).getText();
        return retval;
    }
}
