package com.salmon.test.step_definitions.gui.audi;

import com.salmon.test.framework.helpers.utils.ConstantsHelper;
import com.salmon.test.page_objects.AudiCommonPage;
import com.salmon.test.page_objects.AudiEcomPage;
import com.salmon.test.page_objects.AudiHomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by tfasoyiro on 06/04/2016.
 */
public class AudiEcomPageSteps {

    private AudiHomePage audiHomePage;
    private AudiCommonPage audiCommonPage;
    private AudiEcomPage audiEcomPage;
    private ConstantsHelper constantsHelper;

    // Category

    public AudiEcomPageSteps(AudiHomePage audiHomePage, AudiCommonPage audiCommonPage,
                             AudiEcomPage audiEcomPage, ConstantsHelper constantsHelper){
        this.audiHomePage = audiHomePage;
        this.audiCommonPage = audiCommonPage;
        this.audiEcomPage = audiEcomPage;
        this.constantsHelper = constantsHelper;
    }

    @Then("^Audi Ecommerce Landing Page is returned$")
    public void Audi_Ecommerce_Landing_Page_is_returned() throws Throwable {



    }

    @When("^User Hover Top Level Category$")
    public void User_Hover_Top_Level_Category() throws Throwable {


    }

    @Then("^Sub Category is Displayed$")
    public void Sub_Category_is_Displayed() throws Throwable {


    }
}
