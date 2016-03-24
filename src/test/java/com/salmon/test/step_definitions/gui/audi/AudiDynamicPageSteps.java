package com.salmon.test.step_definitions.gui.audi;

import com.salmon.test.framework.helpers.utils.ConstantsHelper;
import com.salmon.test.page_objects.AudiCommonPage;
import com.salmon.test.page_objects.AudiTyresPage;
import com.salmon.test.page_objects.ValueYourAudiVehiclePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

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


    }

    @Then("^Value Your Vehicle App is triggered$")
    public void Value_Your_Vehicle_App_is_triggered() throws Throwable {

    }
}
