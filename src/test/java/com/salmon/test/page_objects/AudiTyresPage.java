package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

/**
 * Created by tfasoyiro on 18/03/2016.
 */
public class AudiTyresPage extends PageObject{

    private String audiTyresPageTitle = "Audi tyres < Servicing and MOT < Owners Area < Audi < Audi UK";

    private By audiTyresBody = By.cssSelector("body.ng-scope");
    private By audiTyresDarkContainer = By.cssSelector(".darkContainer.multipleLinks.positionTR");
    private By heroContainer = By.cssSelector(".container.innerHeroContainer");
    private By findTyresContainer = By.cssSelector("[class='row grey ng-scope'] .container");
    private By findTyresByReg = By.cssSelector("div.col-xs-12>div[id*=get-a-quote]");
    private By findTyresBySize = By.cssSelector(".panel-body>form[id=selectSpecByFiltersForm]");
    private By genuineTyresContainer = By.cssSelector(".container.ng-scope");
    private By genuineTyresImage = By.cssSelector(".cq-dd-image[alt*=Genuine]");
    private By priceMatchTyreCreativeImage = By.cssSelector("img.cq-dd-image[title=Audi_Price_Match_tyres_Creative]");
    private By btnLocateCentre = By.cssSelector("a.btn.btn-primary[href*=locate-a-centre]");
    private By inpRegNumber = By.cssSelector("#myaudi-carLookup-registration");
    private By btnFindTyres = By.cssSelector("#addOrder-submitBtn");
    private By ddlSection = By.cssSelector("#filter-width");
    private By ddlProfile = By.cssSelector("#filter-profile");
    private By ddlRimDiameter = By.cssSelector("#filter-size");
    private By ddlLoad = By.cssSelector("#filter-load");
    private By ddlSpeed = By.cssSelector("#filter-speed");
    private By btnFindTyresSize = By.cssSelector("#find-tyres-by-spec");
    private By lnkFindOutMore = By.cssSelector(".link-bullet-sm[href*=price]");

    public String stringAudiTyresPageTitle (){
        return audiTyresPageTitle;
    }
    public String stringAudiTyresBody(){
        return waitForExpectedElement(audiTyresBody).getText();
    }

    public void audiTyresVP(){
        waitForExpectedElement(audiTyresDarkContainer).isDisplayed();
        waitForExpectedElement(heroContainer).isDisplayed();
        waitForExpectedElement(findTyresContainer).isDisplayed();
        waitForExpectedElement(genuineTyresContainer).isDisplayed();
        waitForExpectedElement(genuineTyresImage).isDisplayed();
        waitForExpectedElement(priceMatchTyreCreativeImage).isDisplayed();
        elementToBeClickable(btnLocateCentre).isEnabled();
        elementToBeClickable(lnkFindOutMore).isEnabled();
    }
}
