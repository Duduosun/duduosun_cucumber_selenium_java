package com.salmon.test.step_definitions.gui.audi;

import com.salmon.test.framework.PageObject;
import com.salmon.test.framework.helpers.utils.ConstantsHelper;
import com.salmon.test.page_objects.AudiEcomPage;
import com.salmon.test.page_objects.AudiProductPage;

/**
 * Created by tfasoyiro on 15/05/2016.
 */
public class AudiEcomProductPageStepsToo extends PageObject {


    //PDP, PLP, Search, Navigation, Compare, Wishlist
    private AudiEcomPage audiEcomPage;
    private AudiProductPage audiProductPage;
    private ConstantsHelper constantsHelper;

    public AudiEcomProductPageStepsToo(AudiEcomPage audiEcomPage, AudiProductPage audiProductPage, ConstantsHelper constantsHelper){
        this.audiEcomPage = audiEcomPage;
        this.audiProductPage = audiProductPage;
        this.constantsHelper = constantsHelper;
    }


}
