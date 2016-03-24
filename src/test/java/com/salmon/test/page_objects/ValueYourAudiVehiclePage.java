package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

/**
 * Created by tfasoyiro on 18/03/2016.
 */
public class ValueYourAudiVehiclePage extends PageObject {

    private String vehicleValuePageTitle = "Audi UK - Vorsprung durch Technik";

    private By vehicleValueBody = By.cssSelector("body.templateBootstrap.ng-scope.bs.modal-open");
    private By valueYourVehicleOverlay = By.cssSelector("#partExchange");
    private By progressBar = By.cssSelector(".wizardSteps");
    private By pillarOne = By.cssSelector(".padded-wrapper>form[id=vehicleDetailsForm]");
    private By pillarTwo = By.cssSelector(".aside.padded-wrapper.noshade.ng-scope");
    private By easySteps = By.cssSelector(".row.easy-steps");
    private By inpRegNumber = By.cssSelector("#registration");
    private By inpCurrentMileage = By.cssSelector("#mileage");
    private By optReasonOne = By.cssSelector("#sellVehicleOnly");
    private By optReasonTwo = By.cssSelector("#buyNewAudi");
    private By optReasonThree = By.cssSelector("#buyUsedAudi");
    private By btnNext = By.cssSelector("#get-vehicle-details");
    private By lnkLocalAudiCentre = By.cssSelector("#locate-centre");
    private By lnkEstimateTnC = By.cssSelector("#terms-trigger");

    public String stringVehicleValuePage(){
        return vehicleValuePageTitle;
    }
    public String stringVehicleValueOverlay(){
        return waitForExpectedElement(valueYourVehicleOverlay).getText();
    }
    public String stringEasySteps(){return waitForExpectedElement(easySteps).getText();}

    public void valueVehicleVP(){
        waitForExpectedElement(valueYourVehicleOverlay).isDisplayed();
        waitForExpectedElement(progressBar).isDisplayed();
        waitForExpectedElement(pillarOne).isDisplayed();
        waitForExpectedElement(pillarTwo).isDisplayed();
        elementToBeClickable(btnNext).isEnabled();
        elementToBeClickable(lnkLocalAudiCentre).isEnabled();
        elementToBeClickable(lnkEstimateTnC).isEnabled();
    }
}
