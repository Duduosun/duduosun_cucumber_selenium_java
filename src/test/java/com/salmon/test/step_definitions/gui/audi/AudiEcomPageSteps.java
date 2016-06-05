package com.salmon.test.step_definitions.gui.audi;

import com.salmon.test.framework.helpers.utils.ConstantsHelper;
import com.salmon.test.page_objects.AudiCommonPage;
import com.salmon.test.page_objects.AudiEcomPage;
import com.salmon.test.page_objects.AudiHomePage;
import com.salmon.test.page_objects.AudiProductPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import static org.testng.Assert.assertTrue;

/**
 * Created by tfasoyiro on 06/04/2016.
 */
public class AudiEcomPageSteps {

    private AudiHomePage audiHomePage;
    private AudiCommonPage audiCommonPage;
    private AudiEcomPage audiEcomPage;
    private ConstantsHelper constantsHelper;
    private AudiProductPage audiProductPage;

    // Category Navigation
    public AudiEcomPageSteps(AudiHomePage audiHomePage, AudiCommonPage audiCommonPage,
                             AudiEcomPage audiEcomPage, AudiProductPage audiProductPage, ConstantsHelper constantsHelper){
        this.audiHomePage = audiHomePage;
        this.audiCommonPage = audiCommonPage;
        this.audiEcomPage = audiEcomPage;
        this.audiProductPage = audiProductPage;
        this.constantsHelper = constantsHelper;
    }

    @Then("^Audi Ecommerce Landing Page is returned$")
    public void Audi_Ecommerce_Landing_Page_is_returned() throws Throwable {
    }

    @When("^User Hover Top Level Category \"([^\"]*)\" for Sub Category \"([^\"]*)\"$")
    public void User_Hover_Top_Level_Category_for_Sub_Category(String tcat, String scat) throws Throwable {
        audiEcomPage.mouseOverTopCat(tcat);
    }

    @Then("^Sub Category \"([^\"]*)\" is Displayed$")
    public void Sub_Category_is_Displayed(String scat) throws Throwable {
        audiProductPage.PLPView();
        assertTrue(audiProductPage.stringBreadcrumbs().contains(scat));
        assertTrue(audiProductPage.stringPageName().contains(scat));
        assertTrue(audiProductPage.checkPageTitleContains(scat));
    }

    @When("^User Click Top Level \"([^\"]*)\" CTA$")
    public void User_Click_Top_Level_CTA(String tcat) throws Throwable {
        audiEcomPage.clickFirstCAT(tcat);
    }

    @Then("^Products List for \"([^\"]*)\" is Displayed$")
    public void Products_List_for_is_Displayed(String tcat) throws Throwable {
        assertTrue(audiProductPage.stringBreadcrumbs().contains(tcat));
        assertTrue(audiProductPage.stringPageName().contains(tcat));
        assertTrue(audiProductPage.checkPageTitleContains(tcat));
    }

    @When("^User Click Second Level \"([^\"]*)\" CTA$")
    public void User_Click_Second_Level_CTA(String scat) throws Throwable {
        audiEcomPage.clickSecondCAT(scat);
    }
}