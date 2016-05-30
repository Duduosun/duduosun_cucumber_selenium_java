package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import com.salmon.test.framework.helpers.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by tfasoyiro on 14/05/2016.
 */
public class AudiProductPage extends PageObject {

    private String audiPDPageTitle = "";
    private String audiPLPageTitle = "";

    private By breadcrumbs = By.cssSelector(".breadcrumbs");
    private By header = By.cssSelector(".panel.header");
    private By footer = By.cssSelector(".footer.content");

    //PDP
    private By productDetails = By.cssSelector(".column.main");
    private By productImage = By.cssSelector(".fotorama__stage__frame.fotorama_vertical_ratio.fotorama__loaded.fotorama__loaded--img.fotorama__fade-rear.fotorama__loaded--full.fotorama__active");
    private By productThumbnail = By.cssSelector(".fotorama__nav.fotorama__nav--thumbs");
    private By productTAB = By.cssSelector(".product.data.items");
    private By productInfo = By.cssSelector(".product-info-main");
    private By pageName = By.cssSelector(".base");
    private By productSKU = By.cssSelector(".product.attibute.sku");
    private By stockAvailable = By.cssSelector(".stock.available>span");
    private By productSwatch = By.cssSelector(".swatch-opt");
    private By defaultQTY = By.cssSelector("#qty");
    private By addToBasket = By.cssSelector("#product-addtocart-button");
    private By productWishList = By.cssSelector(".action.towishlist");
    private By productCompare = By.cssSelector(".action.tocompare");
    private By productEmail = By.cssSelector(".action.mailto.friend");

    //PLP
    private By plpMainContent = By.cssSelector("#maincontent");
    private By plpTitle = By.cssSelector(".base");
    private By plpMessage = By.cssSelector(".message-success.success.message");
    private By topToolBar = By.cssSelector(".toolbar.toolbar-products:nth-of-type(2)");
    private By bottomToolBar = By.cssSelector(".toolbar.toolbar-products:nth-of-type(4)");
    private By sideBar = By.cssSelector(".sidebar.sidebar-main");
    private By additionalSideBar = By.cssSelector(".sidebar.sidebar-additional");
    private By compareBlock = By.cssSelector(".block.block-compare");
    private By wishListBlock = By.cssSelector(".block.block-wishlist");
    private By productList = By.cssSelector(".products.list.items.product-items");


    public void checkBreadcrumbs(){
        waitForExpectedElement(breadcrumbs);
        waitForExpectedElement(pageName);
    }

    public void callPDPElementToAction(String pdpelement){
        visibilityOfAllElementsLocatedBy(productInfo).stream()
                .filter(categoryElement -> categoryElement.getText().equals(pdpelement))
                .findFirst().get().click();
    }

    public void callPDPElementToView(String pdpelement){
        visibilityOfAllElementsLocatedBy(productInfo).stream()
                .filter(categoryElement -> categoryElement.getText().equals(pdpelement))
                .findFirst().get().isDisplayed();
    }

    //working with one of many elements
    private By cssAllQuickView = By.cssSelector(".quicklook");
    public void clickOneOfMany(int position){
        List<WebElement> plpProducts = WebDriverHelper.getWebDriver().findElements(cssAllQuickView);
        for(WebElement element: plpProducts){
            element.click();
        }
        plpProducts.get(position).click();
    }




}
