package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

/**
 * Created by tfasoyiro on 22/02/2016.
 */
public class AudiHomePage extends PageObject {

    private String homePageTitle = "Audi UK - Vorsprung durch Technik";

    private By homeBody = By.cssSelector(".templateBootstrap.ng-scope");
    private By heroBanner = By.cssSelector(".container.innerHeroContainer>a");
    private By home = By.cssSelector(".header-bottom.nav.navbar-nav>li>a[href*=home]"); //.header-bottom.nav.navbar-nav>li:nth-of-type(1)
    private By newCar = By.cssSelector(".header-bottom.nav.navbar-nav>li:nth-of-type(2)");
    private By usedCard = By.cssSelector(".header-bottom.nav.navbar-nav>li>a[href*=audi-approved-used]");
    private By companyFleet = By.cssSelector(".dropdown.yamm-fw.fleet");
    private By owners = By.cssSelector(".header-bottom.nav.navbar-nav>li:nth-of-type(5)");
    private By stores = By.cssSelector("");
    private By audiRangeCarouselHeader = By.cssSelector(".carouselHeader>div.container");
    private By audiRangeCarousel = By.cssSelector(".row.carouselBg");   //.microfiche-car-link>img[src*=A1_side]
    private By imageWidgetPane = By.cssSelector(".row.top-level-row.top-spacer-30.bottom-spacer-60.row-background.background-none.audiDrivers");
    private By imageWidgetOne = By.cssSelector("a.imageTextWidget>img[src*=BookService]");
    private By imageWidgetTwo = By.cssSelector("a.imageTextWidget>img[src*=BookRepair]");
    private By imageWidgetThree = By.cssSelector("a.imageTextWidget>img[src*=icons_Videos]");
    private By imageWidgetFour = By.cssSelector("a.imageTextWidget>img[src*=icons_AudiTyres]");
    private By imageWidgetFive = By.cssSelector("a.imageTextWidget>img[src*=icons_PriceMatch]");
    private By imageWidgeSix = By.cssSelector("a.imageTextWidget>img[src*=icons_PartExchange]");


    public String stringAudiHomePageTitle(){
        return homePageTitle;
    }
    public String stringHomePageBody(){
        return waitForExpectedElement(homeBody).getText();
    }
    public String stringAudiRangeTextVP(){return waitForExpectedElement(audiRangeCarouselHeader).getText();}

    public void audiHomeVP (){
        waitForExpectedElement(homeBody).isDisplayed();
        elementToBeClickable(heroBanner);
        waitForExpectedElement(audiRangeCarousel).isDisplayed();
        waitForExpectedElement(imageWidgetPane).isDisplayed();
    }
    public void callToAction(String audicall){

        switch (audicall) {
            //AudiApp CTAs
            case "Book Service": {
                waitForExpectedElement(imageWidgetOne).click();
                break;
            }
            case "Book Repair":{
                waitForExpectedElement(imageWidgetTwo).click();
                break;
            }
            case "How To Videos":{
                waitForExpectedElement(imageWidgetThree).click();
                break;
            }
            case "Audi Tyres":{
                waitForExpectedElement(imageWidgetFour).click();
                break;
            }
            case "Service Price Match":{
                waitForExpectedElement(imageWidgetFive).click();
                break;
            }
            case "Part Exchange":{
                waitForExpectedElement(imageWidgeSix).click();
                break;
            }

            // Header CTAs
            case "Stores":{
                waitForExpectedElement(stores).click();
                break;
            }

        }

    }

}
