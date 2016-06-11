package com.salmon.test.step_definitions.gui.audi;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import com.salmon.test.framework.PageObject;
import com.salmon.test.framework.helpers.utils.ConstantsHelper;
import com.salmon.test.page_objects.AudiEcomPage;
import com.salmon.test.page_objects.AudiProductPage;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Created by tfasoyiro on 04/06/2016.
 */

public class AudiEcomProductPageSteps extends PageObject {

    //PDP, PLP, Search, Compare, Wishlist
    private AudiEcomPage audiEcomPage;
    private AudiProductPage audiProductPage;
    private ConstantsHelper constantsHelper;

    public AudiEcomProductPageSteps(AudiEcomPage audiEcomPage, AudiProductPage audiProductPage, ConstantsHelper constantsHelper) {
        this.audiEcomPage = audiEcomPage;
        this.audiProductPage = audiProductPage;
        this.constantsHelper = constantsHelper;
    }


    @And("^Displayed In PLP Grid View$")
    public void Displayed_In_PLP_Grid_View() throws Throwable {
        audiProductPage.oneOfManyProducts(0);
        audiProductPage.oneOfManyProducts(4);
        audiProductPage.oneOfManyProducts(7);
        audiProductPage.oneOfManyProducts(11);
    }

    @And("^Displayed In PLP Grid View with Product \"([^\"]*)\"$")
    public void Displayed_In_PLP_Grid_View_with_Product(String eproduct) throws Throwable {
        audiProductPage.PLPView();
        audiProductPage.plpGridViewActive();
        assertTrue(audiProductPage.elementPLPGridView().isDisplayed());
    }

    @And("^Displayed In PLP List View with Product \"([^\"]*)\"$")
    public void Displayed_In_PLP_List_View_with_Product(String eproduct) throws Throwable {
        audiProductPage.PLPView();
        audiProductPage.plpListViewActive();
        assertTrue(audiProductPage.elementPLPListView().isDisplayed());
    }

    @And("^User Click Simple Product \"([^\"]*)\"$")
    public void User_Click_Simple_Product(String eproduct) throws Throwable {
        audiProductPage.clickOneOfManyProducts(eproduct);
    }

    @Then("^Audi PDP is Displayed with \"([^\"]*)\"$")
    public void Audi_PDP_is_Displayed_with(String eproduct) throws Throwable {
        audiProductPage.PDPView();
        assertTrue(audiProductPage.stringBreadcrumbs().contains(eproduct));
        assertTrue(audiProductPage.stringPageName().equals(eproduct));
    }
}
