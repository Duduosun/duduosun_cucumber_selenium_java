package com.salmon.test.step_definitions.gui.audi;

import com.salmon.test.framework.helpers.utils.ConstantsHelper;
import com.salmon.test.page_objects.AudiCommonPage;
import com.salmon.test.page_objects.AudiOSBPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by tfasoyiro on 08/03/2016.
 */
public class AudiOSBPageSteps {

    private AudiCommonPage audiCommonPage;
    private AudiOSBPage audiOSBPage;
    private ConstantsHelper constantsHelper;

    public AudiOSBPageSteps(AudiCommonPage audiCommonPage, AudiOSBPage audiOSBPage, ConstantsHelper constantsHelper){
        this.audiCommonPage = audiCommonPage;
        this.audiOSBPage = audiOSBPage;
        this.constantsHelper = constantsHelper;
    }

    @Then("^Book Appointment AUDI App is triggered$")
    public void Book_Appointment_AUDI_App_is_triggered() throws Throwable {
        assertEquals(audiOSBPage.getCurrentPageTitle(), audiOSBPage.stringAudiOSBPageTitle());
        assertTrue(audiOSBPage.boolOsbForm());
        audiCommonPage.audiCommonVP();
        audiOSBPage.osbVP();
        assertTrue(audiOSBPage.stringAudiOSBPageBody().contains(constantsHelper.osbBookApp));
        assertTrue(audiOSBPage.stringAudiOSBPageBody().contains(constantsHelper.osbAudiExperience));
        assertTrue(audiOSBPage.stringAudiOSBPageBody().contains(constantsHelper.osbSomeStatement));
        assertTrue(audiOSBPage.stringAudiOSBPageBody().contains(constantsHelper.osbWashVacuum));
        assertTrue(audiOSBPage.stringAudiOSBPageBody().contains(constantsHelper.osbHealthCheck));
    }

    @And("^User Trigger Book an Appointment with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void User_Trigger_Book_an_Appointment_with_amd(String vehiclereg, String location) throws Throwable {
        Book_Appointment_AUDI_App_is_triggered();
        audiOSBPage.registrationNumberText().sendKeys(vehiclereg);
        audiOSBPage.postcodeTownNameText().sendKeys(location);
        audiOSBPage.clickLocateAudiCentres();
    }

    @Then("^User Can View Nearest Centres$")
    public void User_Can_View_Nearest_Centres() throws Throwable {
        assertEquals(audiOSBPage.getCurrentPageTitle(), audiOSBPage.stringAudiOSBPageTitle());
        assertTrue(audiOSBPage.stringAudiOSBPageBody().contains(constantsHelper.carFound));
        audiOSBPage.audiRangeFound();
        audiOSBPage.clickThisIsYourCar();


    }
}
