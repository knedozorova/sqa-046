package com.luxoft.sqa.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class Application {
    WebDriver driver;
    SessionHelper sessionHelper;
    ContactHelper contactHelper;
    GroupHelper groupHelper;
    NavigationHelper navigationHelper;
    String browser;

    public Application(String browser) {
        this.browser = browser;
    }


    public void init() {
        //System.setProperty("webdriver.chrome.driver", "lib/drivers/chromedriver.exe");
            if (browser.equals(BrowserType.CHROME)){
                driver = new ChromeDriver();}
            else if (browser.equals(BrowserType.IE)){
                driver = new InternetExplorerDriver();}
            else if (browser.equals(BrowserType.FIREFOX)){
                driver = new FirefoxDriver();}
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        groupHelper = new GroupHelper(driver);
        contactHelper = new ContactHelper(driver);
        sessionHelper = new SessionHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        driver.get("http://localhost:8080/addressbook/");
        sessionHelper.login("admin", "secret");

    }

    public void stop() {
        driver.close();
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

}