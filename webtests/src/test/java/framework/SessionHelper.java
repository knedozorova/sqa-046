package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper {
    private WebDriver driver;

    public SessionHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String userName, String password) {
        driver.findElement(By.name("user")).clear();
        driver.findElement(By.name("user")).sendKeys(userName);
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.cssSelector("input[type=submit]")).click();
    }
}
