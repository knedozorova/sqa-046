package com.luxoft.sqa.webtests;

import model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {


    @Test
    public void testContactCreation() {
        app.getNavigationHelper().goToAddNew();
        app.getContactHelper().fillNewContact(new ContactData("Test9", "Test8", "Test3", "Test4", "Test5"));
        app.getContactHelper().submitContactCreation();
    }


}
