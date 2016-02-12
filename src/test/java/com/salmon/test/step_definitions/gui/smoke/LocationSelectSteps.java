package com.salmon.test.step_definitions.gui.smoke;


import com.salmon.test.page_objects.LocationSelectPage;
import com.salmon.test.page_objects.SelfridgesCommonPage;
import com.salmon.test.page_objects.SelfridgesHomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;
import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

/**
 * Created by tfasoyiro on 20/09/2015.
 */
public class LocationSelectSteps {
    private LocationSelectPage locationSelectPage;
    private SelfridgesCommonPage selfridgesCommonPage;
    private SelfridgesHomePage selfridgesHomePage;

    public LocationSelectSteps(LocationSelectPage locationSelectPage, SelfridgesCommonPage selfridgesCommonPage,
                               SelfridgesHomePage selfridgesHomePage){
        this.locationSelectPage = locationSelectPage;
        this.selfridgesCommonPage = selfridgesCommonPage;
        this.selfridgesHomePage = selfridgesHomePage;
    }

    @Then("^User is taken to Location Preference Module$")
    public void User_is_taken_to_Location_Preference_Module() throws Throwable {
        selfridgesCommonPage.visibleAvatar();
        selfridgesHomePage.homePageHeader();
        selfridgesHomePage.homePageFooter();
        locationSelectPage.vpCountrySelect();

        Assert.assertEquals(locationSelectPage.getCurrentPageTitle(), locationSelectPage.stringLocationPageTitle());
    }

    @And("^User Can View Shopping Locations \"([^\"]*)\"$")
    public void User_Can_View_Shopping_Locations(String country) throws Throwable {
        assertTrue(locationSelectPage.returnCountry().contains(country));
    }

    @And("^User Click Flag\"([^\"]*)\"$")
    public void User_Click_Flag(String country) throws Throwable {
        locationSelectPage.clickCountry(country);
        //locationSelectPage.clickFrance();
        locationSelectPage.clickContinue();
        selfridgesHomePage.visibleAvatar();
    }
}