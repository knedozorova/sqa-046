package com.luxoft.sqa.framework;

import com.luxoft.sqa.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ContactHelper extends BaseHelper {

    public ContactHelper(WebDriver driver) {

        super(driver);
    }

    public void submitContactCreation() {
        click(By.cssSelector("input[type=submit]"));
    }

    public void fillNewContact(ContactData contactData) {
            type(By.name("firstname"), contactData.getFirstname());
            type(By.name("lastname"), contactData.getLastname());
            type(By.name("company"), contactData.getCompany());
            type(By.name("mobile"), contactData.getMobile());
            type(By.name("email"), contactData.getEmail());
            if (contactData.getCreation() == true) {
                new Select(driver.findElement(By.name("new_group"))).selectByVisibleText("test2");
            }
            Assert.assertFalse(isElementPresent(By.name("new")));

    }

    public void submitContactDeletion() {

        click(By.cssSelector("input[value=Delete]"));
        driver.switchTo().alert().accept();
    }

    public void selectFirstContact() {
        click(By.name("selected[]"));
    }

    public void submitContactModification() {
        click(By.name("update"));
    }

    public void initFirstContactModification() {
        click(By.cssSelector("img[title=Edit]"));
    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));
    }


    public void contactCreation() {
        fillNewContact(new ContactData("Test8", "Test8", "Test3", "Test4", "Test9", true));
        submitContactCreation();
    }

    public void contactModification() {
        fillNewContact(new ContactData("Test7", "Test7", "Test3", "Test4", "Test9", false ));
        submitContactModification();
    }
}
