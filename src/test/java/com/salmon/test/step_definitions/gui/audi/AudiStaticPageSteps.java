package com.salmon.test.step_definitions.gui.audi;

import com.salmon.test.framework.helpers.utils.ConstantsHelper;
import com.salmon.test.page_objects.AudiCommonPage;
import com.salmon.test.page_objects.AudiPriceMatchPage;
import com.salmon.test.page_objects.KnowYourAudiPage;
import cucumber.api.java.en.Then;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by tfasoyiro on 21/03/2016.
 */
public class AudiStaticPageSteps {

    private AudiCommonPage audiCommonPage;
    private KnowYourAudiPage knowYourAudiPage;
    private AudiPriceMatchPage audiPriceMatchPage;
    private ConstantsHelper constantHelpler;

    public AudiStaticPageSteps(AudiCommonPage audiCommonPage, KnowYourAudiPage knowYourAudiPage,
                               AudiPriceMatchPage audiPriceMatchPage, ConstantsHelper constantHelper){
        this.audiCommonPage = audiCommonPage;
        this.knowYourAudiPage = knowYourAudiPage;
        this.audiPriceMatchPage = audiPriceMatchPage;
        this.constantHelpler = constantHelper;
    }

    @Then("^Owners Area Get to Know your AUDI is triggered$")
    public void Owners_Area_Get_to_Know_your_AUDI_is_triggered() throws Throwable {
        assertEquals(knowYourAudiPage.getCurrentPageTitle(), knowYourAudiPage.stringKnowYourAudiPageTitle());
        knowYourAudiPage.knowYourAudiVP();
        audiCommonPage.audiCommonVP();
        assertTrue(knowYourAudiPage.stringKnowYourAudiBody().contains(constantHelpler.kyaCommunication));
        assertTrue(knowYourAudiPage.stringKnowYourAudiBody().contains(constantHelpler.kyaWheels));
        assertTrue(knowYourAudiPage.stringKnowYourAudiBody().contains(constantHelpler.kyaEngine));
        assertTrue(knowYourAudiPage.stringKnowYourAudiBody().contains(constantHelpler.kyaLighting));
        assertTrue(knowYourAudiPage.stringKnowYourAudiBody().contains(constantHelpler.kyaGeneral));
        assertTrue(knowYourAudiPage.stringKnowYourAudiBody().contains(constantHelpler.kyaVehicle));
    }

    @Then("^Owner Area AUDI Service Price Match App is triggered$")
    public void Owner_Area_AUDI_Service_Price_Match_App_is_triggered() throws Throwable {
        assertEquals(audiPriceMatchPage.getCurrentPageTitle(), audiPriceMatchPage.stringAudiPriceMatchPageTitle());
        audiPriceMatchPage.audiPriceMatchVP();
        audiCommonPage.audiCommonVP();
        assertTrue(audiPriceMatchPage.stringAudiPriceMatchBody().contains(constantHelpler.priceGenuine));
        assertTrue(audiPriceMatchPage.stringAudiPriceMatchBody().contains(constantHelpler.priceTyres));
        assertTrue(audiPriceMatchPage.stringAudiPriceMatchBody().contains(constantHelpler.priceTnC));
        assertTrue(audiPriceMatchPage.stringAudiPriceMatchBody().contains(constantHelpler.priceMOT));
    }
}
