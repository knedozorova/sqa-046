package com.luxoft.sqa.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends BaseHelper {
    private WebDriver driver;

    public SessionHelper(WebDriver driver) {
        super(driver);
    }

    public void login(String userName, String password) {
        type(By.name("user"), userName);
        type(By.name("pass"), password);
        click(By.cssSelector("input[type=submit]"));
    }

    public void logout(){
        driver.findElement(By.linkText("Logout"));
    }
}
