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
        driver.findElement(By.cssSelector("input[type=submit]")).click();
    }

    public void fillNewContact(ContactData contactData) {

        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys(contactData.getLastname());
        driver.findElement(By.name("company")).clear();
        driver.findElement(By.name("company")).sendKeys(contactData.getCompany());
        driver.findElement(By.name("mobile")).clear();
        driver.findElement(By.name("mobile")).sendKeys(contactData.getMobile());
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys(contactData.getEmail());
    }

    public void submitContactDeletion() {

        driver.findElement(By.cssSelector("input[value=Delete]")).click();
        driver.switchTo().alert().accept();
    }

    public void selectFirstContact() {
        driver.findElement(By.name("selected[]")).click();
    }

    public void submitContactModification() {
        driver.findElement(By.name("update")).click();
    }

    public void initFirstContactModification() {
        driver.findElement(By.cssSelector("img[title=Edit]")).click();
    }
}
