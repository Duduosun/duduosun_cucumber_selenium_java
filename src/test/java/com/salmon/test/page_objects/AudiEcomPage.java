package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

/**
 * Created by tfasoyiro on 06/04/2016.
 */
public class AudiEcomPage extends PageObject {

    private String audiEcommercePageTitle = "Home page";

    private By audiEcomBody = By.cssSelector(".cms-home.cms-index-index.page-layout-1column");
    private By topRHS = By.cssSelector(".panel.header");
    private By logo = By.cssSelector(".logo>img");

    private By searchInput = By.cssSelector("#search");
    private By searchCTA =By.cssSelector(".action.search");
    private By advancedSearchCTA = By.cssSelector(".action.advanced");

    private By firstCAT = By.cssSelector("#ui-id-2");
    private By secondCAT = By.cssSelector("#ui-id-41");

    private By footer = By.cssSelector(".footer.content");


    //keep
    private By ecommCarousel = By.cssSelector("");
    private By heroBanner = By.cssSelector("");

    //action

    //Hover firstCAT only
    //Click firstCAT only
    //Click secondCAT

    public void mouseOverFirstCAT(WebElement catentry){
        //Point hoverItem = Point

        //clickWithinElementWithXYCoordinates(catentry, hoverItem.getX(), hoverItem.getY());
        catentry.click();
    }

    public void clickFirstCAT(String catentry){
        visibilityOfAllElementsLocatedBy(firstCAT).stream()
                .filter(categoryElement -> categoryElement.getText().equals(catentry))
                .findFirst().get().click();
    }

    public void clickSecondCAT(WebElement catentry, String subcatentry){
        mouseOverFirstCAT(catentry);
        visibilityOfAllElementsLocatedBy(firstCAT).stream()
                .filter(categoryElement -> categoryElement.getText().equals(subcatentry))
                .findFirst().get().click();
    }
}
