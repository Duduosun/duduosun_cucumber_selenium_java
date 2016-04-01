package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by tfasoyiro on 04/03/2016.
 */
public class AudiOSBPage extends PageObject {

    private String osbPageTitle = "OSB < Book an appointment with Audi < Owners Area < Audi < Audi UK";

    private By osbBody = By.cssSelector("body.ng-scope");
    private By osbOverlay = By.cssSelector(".row.top-level-row.full-width-row.row-background-image");
    private By osbOverlayNo = By.cssSelector(".btn.btn-lg.btn-ghost.close");
    private By osbOVerlayYes = By.cssSelector(".btn.btn-primary.btn-lg.ar");
    private By osbForm = By.cssSelector(".panel.osbForm");
    private By registrationNumber = By.cssSelector("#myaudi-carLookup-registration");
    private By postcodeTownName = By.cssSelector("#addOrder-postcode");
    private By locateAudiCentres = By.cssSelector("#addOrder-submitBtn");
    private By audiExperience = By.cssSelector(".info.col-md-10.col-md-offset-1");
    private By audiRangePanel = By.cssSelector(".panel.panel-default>div.panel-body");
    private By btnThisIsYourCar = By.cssSelector(".btn.btn-primary.pull-left.btn-lg.ng-scope");
    private By serviceCentre = By.cssSelector(".details-panel.col-xs-9");
    //.panel.panel-default>div[class='panel-heading clearfix'] .details-panel.col-xs-9

    public String stringAudiOSBPageTitle (){
        return osbPageTitle;
    }
    public String stringAudiOSBPageBody (){
        return waitForExpectedElement(osbBody).getText();
    }
    public Boolean boolOsbForm(){return isElementPresent(osbForm);}

    public WebElement registrationNumberText() {
        return waitForExpectedElement(registrationNumber);
    }
    public WebElement postcodeTownNameText() {
        return waitForExpectedElement(postcodeTownName);}

    public void closeOverlay (){
        waitForExpectedElement(osbOverlayNo).click();
    }
    public void osbVP(){
        waitForExpectedElement(osbBody).isDisplayed();
        waitForExpectedElement(audiExperience).isDisplayed();
    }
    public void clickLocateAudiCentres(){
        waitForExpectedElement(locateAudiCentres).click();
    }
    public void audiRangeFound(){
        waitForExpectedElement(audiRangePanel).isDisplayed();
    }
    public void clickThisIsYourCar(){waitForExpectedElement(btnThisIsYourCar).click();}

}
