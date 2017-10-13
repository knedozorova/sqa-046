package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends BaseHelper {
    private WebDriver driver;

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }


    public void goToAddNew() {
        click(By.linkText("add new"));
    }
    public void goToHome() {
        click(By.linkText("home"));
    }
}
