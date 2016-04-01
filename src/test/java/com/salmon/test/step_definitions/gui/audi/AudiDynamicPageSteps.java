package com.salmon.test.step_definitions.gui.audi;

import com.salmon.test.framework.helpers.utils.ConstantsHelper;
import com.salmon.test.page_objects.AudiCommonPage;
import com.salmon.test.page_objects.AudiTyresPage;
import com.salmon.test.page_objects.ValueYourAudiVehiclePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by tfasoyiro on 24/03/2016.
 */
public class AudiDynamicPageSteps {

    private AudiCommonPage audiCommonPage;
    private AudiTyresPage audiTyresPage;
    private ValueYourAudiVehiclePage valueYourAudiVehiclePage;
    private ConstantsHelper constantsHelper;

    public AudiDynamicPageSteps(AudiCommonPage audiCommonPage, AudiTyresPage audiTyresPage,
                                ValueYourAudiVehiclePage valueYourAudiVehiclePage, ConstantsHelper constantsHelper){

        this.audiCommonPage = audiCommonPage;
        this.audiTyresPage = audiTyresPage;
        this.valueYourAudiVehiclePage = valueYourAudiVehiclePage;
        this.constantsHelper = constantsHelper;
    }


    @Then("^AUDI Tyres App is triggered$")
    public void AUDI_Tyres_App_is_triggered() throws Throwable {
        assertEquals(audiTyresPage.getCurrentPageTitle(), audiTyresPage.stringAudiTyresPageTitle());
        audiTyresPage.audiTyresVP();
        audiCommonPage.audiCommonVP();
        assertTrue(audiTyresPage.stringAudiTyresBody().contains(constantsHelper.tyresFitted));
        assertTrue(audiTyresPage.stringAudiTyresBody().contains(constantsHelper.tyresFind));
        assertTrue(audiTyresPage.stringAudiTyresBody().contains(constantsHelper.tyresGenuine));
        assertTrue(audiTyresPage.stringAudiTyresBody().contains(constantsHelper.tyresServicePrice));
        assertTrue(audiTyresPage.stringAudiTyresBody().contains(constantsHelper.tyresTnC));
    }

    @Then("^Value Your Vehicle App is triggered$")
    public void Value_Your_Vehicle_App_is_triggered() throws Throwable {
        assertEquals(valueYourAudiVehiclePage.getCurrentPageTitle(), valueYourAudiVehiclePage.stringVehicleValuePageTitle());
        valueYourAudiVehiclePage.valueVehicleVP();
        //audiCommonPage.audiCommonVP();
        assertTrue(valueYourAudiVehiclePage.stringVehicleValueOverlay().contains(constantsHelper.valueVehicle));
        assertTrue(valueYourAudiVehiclePage.stringVehicleValueOverlay().contains(constantsHelper.valueVehicle));
        assertTrue(valueYourAudiVehiclePage.stringVehicleValueOverlay().contains(constantsHelper.valueGuidePrice));

        assertTrue(valueYourAudiVehiclePage.stringEasySteps().contains(constantsHelper.stepOne));
        assertTrue(valueYourAudiVehiclePage.stringEasySteps().contains(constantsHelper.stepTwo));
        assertTrue(valueYourAudiVehiclePage.stringEasySteps().contains(constantsHelper.stepThree));
    }
}
