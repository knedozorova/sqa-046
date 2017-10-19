package com.luxoft.sqa.webtest;

import com.luxoft.sqa.model.ContactData;
import org.testng.annotations.Test;

import java.util.List;

public class ContactCreationTest extends TestBase {


    @Test (enabled = false)
    public void testContactCreation() {
        app.getNavigationHelper().goToAddNew();
//        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().contactCreation();
    }


}
