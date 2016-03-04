package com.salmon.test.step_definitions.gui.audi;

import com.salmon.test.page_objects.AudiCommonPage;
import com.salmon.test.page_objects.AudiHomePage;
import com.salmon.test.framework.helpers.utils.ConstantsHelper;
import cucumber.api.java.en.When;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


/**
 * Created by tfasoyiro on 02/03/2016.
 */
public class AudiHomePageSteps {

    private AudiHomePage audiHomePage;
    private AudiCommonPage audiCommonPage;
    private ConstantsHelper constantsHelper;

    public AudiHomePageSteps(AudiHomePage audiHomePage, AudiCommonPage audiCommonPage, ConstantsHelper constantsHelper){
        this.audiHomePage = audiHomePage;
        this.audiCommonPage = audiCommonPage;
        this.constantsHelper =constantsHelper;
    }

    @When("^User Click Book Service CTA$")
    public void User_Click_Book_Service_CTA() throws Throwable {
        assertEquals(audiHomePage.getCurrentPageTitle(), audiHomePage.stringAudiHomePageTitle());
        audiHomePage.audiHomeVP();
        audiCommonPage.audiCommonVP();
        assertTrue(audiHomePage.stringHomePageBody().contains(constantsHelper.audiRange));
        assertTrue(audiHomePage.stringHomePageBody().contains(constantsHelper.audiApps));
        assertTrue(audiHomePage.stringHomePageBody().contains(constantsHelper.audiCopyRight));
        audiHomePage.callToAction("Book Service");
    }
}
