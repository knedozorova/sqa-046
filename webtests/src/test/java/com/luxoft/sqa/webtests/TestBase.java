package com.luxoft.sqa.webtests;

import model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "lib/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/addressbook/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        login("admin", "secret");
    }

    private void login(String userName, String password) {
        driver.findElement(By.name("user")).clear();
        driver.findElement(By.name("user")).sendKeys(userName);
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.cssSelector("input[type=submit]")).click();
    }

    protected void goToAddNew() {
        driver.findElement(By.linkText("add new")).click();
    }

    protected void submitContactCreation() {
        driver.findElement(By.cssSelector("input[type=submit]")).click();
    }

    protected void fillNewContact(ContactData contactData) {

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


    protected void goToHome() {
        driver.findElement(By.linkText("home")).click();
    }

    protected void submitContactDeletion() {

        driver.findElement(By.cssSelector("input[value=Delete]")).click();
        driver.switchTo().alert().accept();
    }

    protected void selectFirstContact() {
        driver.findElement(By.name("selected[]")).click();
    }

    @AfterMethod
    public void testDown(){
        driver.close();
    }


    protected void submitContactModification() {
        driver.findElement(By.name("update")).click();
    }

    protected void initFirstContactModification() {
        driver.findElement(By.cssSelector("img[title=Edit]")).click();
    }
}
