package com.luxoft.sqa.webtest;

import com.luxoft.sqa.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {

    @Test
    public void TestContactModification(){
        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().selectFirstContact();
        app.getContactHelper().initFirstContactModification();
        app.getContactHelper().fillNewContact(new ContactData("Test7", "Test3", "Test3", "Test4", "Test9" ));
        app.getContactHelper().submitContactModification();
    }


}
