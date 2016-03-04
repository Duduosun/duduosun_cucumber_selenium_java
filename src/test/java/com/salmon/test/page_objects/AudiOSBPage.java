package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

/**
 * Created by tfasoyiro on 04/03/2016.
 */
public class AudiOSBPage extends PageObject {

    private String osbPageTitle = "< Book an appointment with Audi < Owners Area < Audi < Audi UK</";

    private By osbBody = By.cssSelector(".ng-scope");
    private By osbOverlay = By.cssSelector(".row.top-level-row.full-width-row.row-background-image");
    private By osbOverlayNo = By.cssSelector(".btn.btn-lg.btn-ghost.close");
    private By osbOVerlayYes = By.cssSelector(".btn.btn-primary.btn-lg.ar");
    private By osbForm = By.cssSelector(".panel.osbForm");
    private By registrationNumber = By.cssSelector("#myaudi-carLookup-registration");
    private By postcodeTownName = By.cssSelector("#addOrder-postcode");
    private By locateAudiCentres = By.cssSelector("#addOrder-submitBtn");
    private By audiExperience = By.cssSelector(".info.col-md-10.col-md-offset-1");

    public String stringAudiOSBPageTitle (){
        return osbPageTitle;
    }
    public String stringAudiOSBPageBody (){
        return waitForExpectedElement(osbBody).getText();
    }
    

    public void closeOverlay (){
        waitForExpectedElement(osbOverlayNo).click();
    }
    public void osbVP(){
        waitForExpectedElement(osbBody).isDisplayed();
        waitForExpectedElement(osbForm).isDisplayed();
        waitForExpectedElement(audiExperience).isDisplayed();
    }

}
