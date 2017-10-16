package com.luxoft.sqa.webtest;

import com.luxoft.sqa.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {


    @Test
    public void testContactCreation() {
        app.getNavigationHelper().goToAddNew();
        app.getContactHelper().contactCreation();
    }


}
