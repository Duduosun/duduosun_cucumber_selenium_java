package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import org.openqa.jetty.html.Page;
import org.openqa.selenium.By;

/**
 * Created by tfasoyiro on 18/03/2016.
 */
public class AudiPriceMatchPage extends PageObject {

    private String audiPriceMatchPageTitle = "Audi Service Price Match < Servicing and MOT < Owners Area < Audi < Audi UK";

    private By audiPriceMatchBody = By.cssSelector(".ownersArea.ng-scope");
    private By audiDifferenceLogo = By.cssSelector(".the-audi-difference");
    private By audiPriceMatchHeader = By.cssSelector(".title-breadcrumb");
    private By lnkAudiDifference = By.cssSelector(".text>p>a[href*=audi-difference]");
    private By lnkLocalCentre = By.cssSelector(".text>p>a[href*=locate-a-centre]");
    private By lnkAudiTyres = By.cssSelector(".text>p>a[href*=audi-tyres]");
    private By priceMatchCreativeImage = By.cssSelector("img.cq-dd-image[title=Audi_Price_Match_Creative]");
    private By priceMatchTyreCreativeImage = By.cssSelector("img.cq-dd-image[title=Audi_Price_Match_tyres_Creative]");
    private By btnLocateCentre = By.cssSelector(".parbase.section.simple-image>a>img[alt*=Locate]");
    private By btnServiceAudi = By.cssSelector(".parbase.section.simple-image>a>img[alt*=Servicing]");
    private By btnMOT  = By.cssSelector(".parbase.section.simple-image>a>img[alt*=MOT]");



    public String stringAudiPriceMatchPageTitle() {
        return audiPriceMatchPageTitle;
    }
    public String stringAudiPriceMatchBody(){
        return waitForExpectedElement(audiPriceMatchBody).getText();
    }

    public void audiPriceMatchVP(){
        waitForExpectedElement(audiDifferenceLogo).isDisplayed();
        waitForExpectedElement(audiPriceMatchHeader).isDisplayed();
        elementToBeClickable(lnkAudiDifference).isEnabled();
        elementToBeClickable(lnkLocalCentre).isEnabled();
        elementToBeClickable(lnkAudiTyres).isEnabled();
        elementToBeClickable(btnLocateCentre).isEnabled();
        elementToBeClickable(btnServiceAudi).isEnabled();
        elementToBeClickable(btnMOT).isEnabled();
        waitForExpectedElement(priceMatchCreativeImage).isDisplayed();
        waitForExpectedElement(priceMatchTyreCreativeImage).isDisplayed();
    }
}
