package com.salmon.test.step_definitions.gui.audi;

import com.salmon.test.page_objects.AudiCommonPage;
import com.salmon.test.page_objects.AudiHomePage;
import com.salmon.test.framework.helpers.utils.ConstantsHelper;
import cucumber.api.PendingException;
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

    @When("^User Click Book Repair CTA$")
    public void User_Click_Book_Repair_CTA() throws Throwable {
        assertEquals(audiHomePage.getCurrentPageTitle(), audiHomePage.stringAudiHomePageTitle());
        audiHomePage.audiHomeVP();
        audiCommonPage.audiCommonVP();
        assertTrue(audiHomePage.stringHomePageBody().contains(constantsHelper.audiRange));
        assertTrue(audiHomePage.stringHomePageBody().contains(constantsHelper.audiApps));
        assertTrue(audiHomePage.stringHomePageBody().contains(constantsHelper.audiCopyRight));
        audiHomePage.callToAction("Book Repair");
    }

    @When("^User Click How To Video CTA$")
    public void User_Click_How_To_Video_CTA() throws Throwable {
        assertEquals(audiHomePage.getCurrentPageTitle(), audiHomePage.stringAudiHomePageTitle());
        audiHomePage.audiHomeVP();
        audiCommonPage.audiCommonVP();
        assertTrue(audiHomePage.stringHomePageBody().contains(constantsHelper.audiRange));
        assertTrue(audiHomePage.stringHomePageBody().contains(constantsHelper.audiApps));
        assertTrue(audiHomePage.stringHomePageBody().contains(constantsHelper.audiCopyRight));
        audiHomePage.callToAction("How To Videos");
    }

    @When("^User Click Audi Tyres CTA$")
    public void User_Click_Audi_Tyres_CTA() throws Throwable {
        assertEquals(audiHomePage.getCurrentPageTitle(), audiHomePage.stringAudiHomePageTitle());
        audiHomePage.audiHomeVP();
        audiCommonPage.audiCommonVP();
        assertTrue(audiHomePage.stringHomePageBody().contains(constantsHelper.audiRange));
        assertTrue(audiHomePage.stringHomePageBody().contains(constantsHelper.audiApps));
        assertTrue(audiHomePage.stringHomePageBody().contains(constantsHelper.audiCopyRight));
        audiHomePage.callToAction("Audi Tyres");
    }

    @When("^User Click Service Price Match CTA$")
    public void User_Click_Service_Price_Match_CTA() throws Throwable {
        assertEquals(audiHomePage.getCurrentPageTitle(), audiHomePage.stringAudiHomePageTitle());
        audiHomePage.audiHomeVP();
        audiCommonPage.audiCommonVP();
        assertTrue(audiHomePage.stringHomePageBody().contains(constantsHelper.audiRange));
        assertTrue(audiHomePage.stringHomePageBody().contains(constantsHelper.audiApps));
        assertTrue(audiHomePage.stringHomePageBody().contains(constantsHelper.audiCopyRight));
        audiHomePage.callToAction("Service Price Match");
    }

    @When("^User Click Part Exchange CTA$")
    public void User_Click_Part_Exchange_CTA() throws Throwable {
        assertEquals(audiHomePage.getCurrentPageTitle(), audiHomePage.stringAudiHomePageTitle());
        audiHomePage.audiHomeVP();
        audiCommonPage.audiCommonVP();
        assertTrue(audiHomePage.stringHomePageBody().contains(constantsHelper.audiRange));
        assertTrue(audiHomePage.stringHomePageBody().contains(constantsHelper.audiApps));
        assertTrue(audiHomePage.stringHomePageBody().contains(constantsHelper.audiCopyRight));
        audiHomePage.callToAction("Part Exchange");
    }
}
