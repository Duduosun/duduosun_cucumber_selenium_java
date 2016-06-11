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

    private By breadcrumbs = By.cssSelector(".breadcrumbs");

    //PLP
    private By plpMessage = By.cssSelector(".message-success.success.message");
    private By topToolBar = By.cssSelector(".toolbar.toolbar-products:nth-of-type(2)");
    private By bottomToolBar = By.cssSelector(".toolbar.toolbar-products:nth-of-type(4)");
    private By sideBar = By.cssSelector(".sidebar.sidebar-main");
    private By additionalSideBar = By.cssSelector(".sidebar.sidebar-additional");
    private By compareBlock = By.cssSelector(".block.block-compare");
    private By wishListBlock = By.cssSelector(".block.block-wishlist");
    private By productList = By.cssSelector(".products.list.items.product-items");
    private By productGridView = By.cssSelector(".products.wrapper.grid.products-grid");
    private By plpGridViewActive = By.cssSelector(".modes-mode.active.mode-grid");
    private By plpGridViewClickable = By.cssSelector("#mode-grid");
    private By productListView = By.cssSelector(".products.wrapper.list.products-list");
    private By plpListViewActive = By.cssSelector(".modes-mode.active.mode-list");
    private By plpListViewClickable = By.cssSelector("#mode-list");

    //PDP
    private By pdpBlock = By.cssSelector(".product-item-info");
    private By pdpProduct = By.cssSelector(".product-item-link");
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

    public String stringBreadcrumbs(){
        return waitForExpectedElement(breadcrumbs).getText();
    }
    public String stringPageName(){
        return waitForExpectedElement(pageName).getText();
    }

    public WebElement elementPLPGridView(){
        return waitForExpectedElement(productGridView);
    }
    public WebElement elementPLPListView(){
        return waitForExpectedElement(productListView);
    }

    public void PLPView(){
        waitForExpectedElement(productList).isDisplayed();
        waitForExpectedElement(pdpBlock).isDisplayed();
        waitForExpectedElement(pdpProduct).isDisplayed();
    }

    public void oneOfManyProducts(int eproduct){
        List<WebElement> plpProducts = WebDriverHelper.getWebDriver().findElements(pdpProduct);
        //plpProducts.get(eproduct).click();
        plpProducts.get(eproduct).isDisplayed();
    }

    public void clickOneOfManyProducts(String plpelement){
        visibilityOfAllElementsLocatedBy(pdpProduct).stream()
                .filter(categoryElement -> categoryElement.getText().equals(plpelement))
                .findFirst().get().click();
    }

    public void callPDPElementToAction(String pdpelement){
        visibilityOfAllElementsLocatedBy(productInfo).stream()
                .filter(categoryElement -> categoryElement.getText().equals(pdpelement))
                .findFirst().get().click();
    }
    public void callPDPElementToView(String pdpelement){
        visibilityOfAllElementsLocatedBy(productGridView).stream()
                .filter(categoryElement -> categoryElement.getText().equals(pdpelement))
                .findFirst().get().isDisplayed();
    }

    public void plpGridViewActive(){
        waitForExpectedElement(plpGridViewActive).isSelected();
        elementToBeClickable(plpListViewClickable);
    }
    public void plpListViewActive(){
        waitForExpectedElement(plpListViewActive).isSelected();
        elementToBeClickable(plpGridViewClickable);
    }
    public void clickSwitchViewCTA(){
        waitForExpectedElement(plpListViewClickable).click();
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
