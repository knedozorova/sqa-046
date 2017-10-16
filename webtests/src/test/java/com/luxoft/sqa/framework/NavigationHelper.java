package com.luxoft.sqa.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends BaseHelper {
    private WebDriver driver;

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void goToAddNew() {
        if (isElementPresent(By.tagName("h1")) && driver.findElement(By.tagName("h1")).getText().equals("Edit / add address book entry") && isElementPresent(By.name("submit"))) {
            return;
        }
        click(By.linkText("add new"));
    }

    public void goToHomePage() {
        if (isElementPresent(By.id("maintable"))){
            return;
        }
        click(By.linkText("home"));
    }

    public void goToGroupPage() {
        if (isElementPresent(By.tagName("h1")) && driver.findElement(By.tagName("h1")).getText().equals("Groups") && isElementPresent(By.name("new"))) {
            return;
        }
            click(By.linkText("groups"));
    }


}