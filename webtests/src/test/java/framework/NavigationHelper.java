package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {
    private WebDriver driver;

    public NavigationHelper(WebDriver driver) {
        this.driver = driver;
    }


    public void goToAddNew() {
        driver.findElement(By.linkText("add new")).click();
    }
    public void goToHome() {
        driver.findElement(By.linkText("home")).click();
    }
}
