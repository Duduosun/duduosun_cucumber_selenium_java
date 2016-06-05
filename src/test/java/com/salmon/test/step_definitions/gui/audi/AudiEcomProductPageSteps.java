package com.salmon.test.step_definitions.gui.audi;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import com.salmon.test.framework.PageObject;
import com.salmon.test.framework.helpers.utils.ConstantsHelper;
import com.salmon.test.page_objects.AudiEcomPage;
import com.salmon.test.page_objects.AudiProductPage;

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
        //audiProductPage.callPDPElementToView("Tola");
        audiProductPage.oneOfManyProducts(5);
    }
}
