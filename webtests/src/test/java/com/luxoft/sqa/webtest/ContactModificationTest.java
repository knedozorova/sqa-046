package com.luxoft.sqa.webtest;

import com.luxoft.sqa.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {

    @Test
    public void TestContactModification(){
        app.getNavigationHelper().goToHomePage();
        if (!app.getContactHelper().isThereAContact()){
            app.getNavigationHelper().goToAddNew();
            app.getContactHelper().contactCreation();
            app.getNavigationHelper().goToHomePage();
        }
        app.getContactHelper().selectFirstContact();
        app.getContactHelper().initFirstContactModification();

        app.getContactHelper().contactModification();
    }


}
