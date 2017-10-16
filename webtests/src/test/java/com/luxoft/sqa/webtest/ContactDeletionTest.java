package com.luxoft.sqa.webtest;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase {


    @Test
        public void testContactDeletion() {
            app.getNavigationHelper().goToHomePage();
            app.getContactHelper().selectFirstContact();
            app.getContactHelper().submitContactDeletion();
        }

}


