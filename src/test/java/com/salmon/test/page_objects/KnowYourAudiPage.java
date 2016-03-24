package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

/**
 * Created by tfasoyiro on 18/03/2016.
 */
public class KnowYourAudiPage extends PageObject {

    private String knowYourAudiPageTitle = "Get to know your Audi - Audi UK";

    private By knowYourAudiBody = By.cssSelector(".ownersArea.ng-scope");
    private By audiDifferenceLogo = By.cssSelector(".the-audi-difference");
    private By getToKnowYourAudiHeader = By.cssSelector(".title-breadcrumb");
    private By ownersAreaContainer = By.cssSelector(".grid.fixed[style*=owners-area]"); //.parsys.grid-container


    public String  stringKnowYourAudiPageTitle(){
        return knowYourAudiPageTitle;
    }
    public String stringKnowYourAudiBody(){
        return waitForExpectedElement(knowYourAudiBody).getText();}

    public void knowYourAudiVP(){
        waitForExpectedElement(audiDifferenceLogo).isDisplayed();
        waitForExpectedElement(getToKnowYourAudiHeader).isDisplayed();
        waitForExpectedElement(ownersAreaContainer).isDisplayed();
    }

}
