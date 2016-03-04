package com.salmon.test.step_definitions.gui.audi;

import com.salmon.test.framework.helpers.UrlBuilder;
import cucumber.api.java.en.Given;

/**
 * Created by tfasoyiro on 02/03/2016.
 * this Class used to trigger entry into AUT
 */
public class AUTEntryPointSteps {
    @Given("^AUDI HOME Page$")
    public void AUDI_HOME_Page() throws Throwable {
        UrlBuilder.startAtHomePage();
    }
}
