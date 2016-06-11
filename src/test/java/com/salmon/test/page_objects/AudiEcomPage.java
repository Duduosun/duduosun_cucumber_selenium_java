package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import com.salmon.test.framework.helpers.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Objects;

/**
 * Created by tfasoyiro on 06/04/2016.
 */
public class AudiEcomPage extends PageObject {

    private String audiEcommercePageTitle = "Home page";

    private By header = By.cssSelector(".panel.header");
    private By firstCAT = By.cssSelector("#ui-id-2>li");
    private By secondCAT = By.cssSelector(".level0.submenu.ui-menu.ui-widget.ui-widget-content.ui-corner-all>li");
    private By footer = By.cssSelector(".footer.content");

    private By audiEcomBody = By.cssSelector(".cms-home.cms-index-index.page-layout-1column");
    private By topRHS = By.cssSelector(".panel.header");
    private By logo = By.cssSelector(".logo>img");
    private By searchInput = By.cssSelector("#search");
    private By searchCTA =By.cssSelector(".action.search");
    private By advancedSearchCTA = By.cssSelector(".action.advanced");

    //keep
    private By ecommCarousel = By.cssSelector("");
    private By heroBanner = By.cssSelector("");

    private By offers = By.cssSelector(".level0.nav-1.first.level-top.ui-menu-item");
    private By accessories = By.cssSelector(".level0.nav-2.level-top.parent.ui-menu-item");
        private By bags = By.cssSelector("#ui-id-20"); //#ui-id-20
        private By pen = By.cssSelector("#ui-id-23");
    private By clothing = By.cssSelector(".level0.nav-3.level-top.parent.ui-menu-item");
        private By women = By.cssSelector("#ui-id-41");
        private By alphaConfig = By.cssSelector("#ui-id-42");
    private By model = By.cssSelector(".level0.nav-4.level-top.parent.ui-menu-item");
        private By gammaSimple = By.cssSelector("#ui-id-51");
    private By drivingExp = By.cssSelector(".level0.nav-6.level-top.ui-menu-item");
    private By alpha = By.cssSelector(".level0.nav-7.level-top.parent.ui-menu-item");
        private By deltachild = By.cssSelector("#ui-id-57");
        private By outtaStock = By.cssSelector("#ui-id-60");
    private By car = By.cssSelector(".level0.nav-14.level-top.parent.ui-menu-item");
        private By family = By.cssSelector("#ui-id-69>span");
    private By giftVoucher = By.cssSelector(".level0.nav-15.level-top.parent.ui-menu-item");
    private By codeStorm = By.cssSelector(".level0.nav-17.last.level-top.ui-menu-item");


    public void clickFirstCAT(String catentry){
        visibilityOfAllElementsLocatedBy(firstCAT).stream()
                .filter(categoryElement -> categoryElement.getText().equals(catentry))
                .findFirst().get().click();
    }
    public void mouseOverTopCat(String tcat){

        switch (tcat){

            case "Accessories": {
                waitForExpectedElement(accessories);
                mouseOverExpectedElement(waitForExpectedElement(accessories));
                waitForExpectedElement(bags).click();
                break;
            }

            case "Clothing" : {
                waitForExpectedElement(clothing);
                mouseOverExpectedElement(waitForExpectedElement(clothing));
                waitForExpectedElement(women).click();
                break;
            }

            case "Model Cars" : {
                waitForExpectedElement(model);
                mouseOverExpectedElement(waitForExpectedElement(model));
                waitForExpectedElement(gammaSimple).click();
                break;
            }

            case "Alpha Testing": {
                waitForExpectedElement(alpha);
                mouseOverExpectedElement(waitForExpectedElement(alpha));
                waitForExpectedElement(deltachild).click();
                break;
            }

            case "Car Accessories" : {
                waitForExpectedElement(car);
                mouseOverExpectedElement(waitForExpectedElement(car));
                waitForExpectedElement(family).click();
                break;
            }
        }
    }
    public void clickSecondCAT(String subcatentry){
        switch (subcatentry) {

            case "Bags": {
                waitForExpectedElement(accessories);
                mouseOverExpectedElement(waitForExpectedElement(accessories));
                waitForExpectedElement(bags).click();
                break;
            }
            case "Pens": {
                waitForExpectedElement(accessories);
                mouseOverExpectedElement(waitForExpectedElement(accessories));
                waitForExpectedElement(pen).click();
                break;
            }

            case "Women" : {
                waitForExpectedElement(clothing);
                mouseOverExpectedElement(waitForExpectedElement(clothing));
                waitForExpectedElement(women).click();
                break;
            }
            case "Alpha Test Configurable" : {
                waitForExpectedElement(clothing);
                mouseOverExpectedElement(waitForExpectedElement(clothing));
                waitForExpectedElement(alphaConfig).click();
                break;
            }

            case "Gamma Testing Simple" : {
                waitForExpectedElement(model);
                mouseOverExpectedElement(waitForExpectedElement(model));
                waitForExpectedElement(gammaSimple).click();
                break;
            }

            case "Delta Child": {
                waitForExpectedElement(alpha);
                mouseOverExpectedElement(waitForExpectedElement(alpha));
                waitForExpectedElement(deltachild).click();
                break;
            }
            case "Outta Stock": {
                waitForExpectedElement(alpha);
                mouseOverExpectedElement(waitForExpectedElement(alpha));
                waitForExpectedElement(outtaStock).click();
                break;
            }

            case "Family" : {
                waitForExpectedElement(car);
                mouseOverExpectedElement(waitForExpectedElement(car));
                waitForExpectedElement(family).click();
                break;
            }
        }
    }
    public void callSearch (String search){
        waitForExpectedElement(searchInput).sendKeys(search);
        waitForExpectedElement(searchCTA).click();
    }


    public void mouseOverTopCats(String catentry){

        visibilityOfAllElementsLocatedBy(firstCAT).stream()
                .filter(categoryElement -> categoryElement.getText().equals(catentry))
                .findFirst().get().isSelected();
    }
    public void mouseOverFirstCA(WebElement catentry, int x, int y){
        Point hoverItem = catentry.getLocation();

        clickWithinElementWithXYCoordinates(catentry, hoverItem.getX(), hoverItem.getY());
        catentry.click();
    }
    public void clickSecondCAT(String subcatentry, String catentry){
        mouseOverTopCat(catentry);
        visibilityOfAllElementsLocatedBy(secondCAT).stream()
                .filter(categoryElement -> categoryElement.getText().equals(subcatentry))
                .findFirst().get().click();
        //visibilityOfAllElementsLocatedBy(firstCAT).stream().findAny()
    }
}