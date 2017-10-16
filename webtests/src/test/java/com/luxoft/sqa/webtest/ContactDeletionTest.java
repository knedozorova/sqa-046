package com.luxoft.sqa.webtest;

import com.luxoft.sqa.model.ContactData;
import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase {


    @Test
        public void testContactDeletion() {
            app.getNavigationHelper().goToHomePage();
            if (!app.getContactHelper().isThereAContact()){
                app.getNavigationHelper().goToAddNew();
                app.getContactHelper().contactCreation();
                app.getNavigationHelper().goToHomePage();
            }
            app.getContactHelper().selectFirstContact();
            app.getContactHelper().submitContactDeletion();
        }

}


