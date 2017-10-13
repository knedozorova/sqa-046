package framework;

import model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
}
