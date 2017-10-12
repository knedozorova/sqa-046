package com.luxoft.sqa.webtests;
/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AddProjectTest {
    @Test
    public void testAddNewProject(){
        System.setProperty("webdriver.ie.driver", "lib/drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://shipovalov.net/login_page.php");
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("student");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("luxoft");
        driver.findElement(By.cssSelector("input.button")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Manage"));
        driver.findElement(By.linkText("Manage Projects"));
        driver.findElement(By.cssSelector("input.button-small")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.close();
    }

}
*/