package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Application {
    WebDriver driver;
    SessionHelper sessionHelper;
    ContactHelper contactHelper;
    NavigationHelper navigationHelper;


    public void init() {
        System.setProperty("webdriver.chrome.driver", "lib/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        contactHelper = new ContactHelper(driver);
        sessionHelper = new SessionHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        driver.get("http://localhost:8080/addressbook/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
}
