package framework;

import model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper {
    private WebDriver driver;

    public ContactHelper(WebDriver driver) {
        this.driver = driver;
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

    private void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    private void click(By locator) {
        driver.findElement(locator).click();
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
