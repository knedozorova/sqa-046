package com.luxoft.sqa.webtests;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase {


    @Test
        public void testContactDeletion() {
            goToHome();
            selectFirstContact();
            submitContactDeletion();
        }

}


