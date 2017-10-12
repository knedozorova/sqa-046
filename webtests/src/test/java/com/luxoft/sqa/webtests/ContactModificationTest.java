package com.luxoft.sqa.webtests;

import model.ContactData;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {

    @Test
    public void TestContactModification(){
        goToHome();
        selectFirstContact();
        initFirstContactModification();
        fillNewContact(new ContactData("Test7", "Test3", "Test3", "Test4", "Test9" ));
        submitContactModification();
    }


}
