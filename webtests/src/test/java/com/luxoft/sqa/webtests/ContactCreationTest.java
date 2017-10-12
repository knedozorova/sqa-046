package com.luxoft.sqa.webtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ContactCreationTest {
    @Test
    public void testAddNewProject() {
        System.setProperty("webdriver.chrome.driver", "lib/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://localhost:8080/addressbook/");
        driver.findElement(By.name("user")).clear();
        driver.findElement(By.name("user")).sendKeys("admin");
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys("secret");
        driver.findElement(By.cssSelector("input[type=submit]")).click();
        driver.findElement(By.linkText("add new")).click();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys("Test1");
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys("Test2");
        driver.findElement(By.name("company")).clear();
        driver.findElement(By.name("company")).sendKeys("Test3");
        driver.findElement(By.name("mobile")).clear();
        driver.findElement(By.name("mobile")).sendKeys("Test4");
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("Test5");
        driver.findElement(By.cssSelector("input[type=submit]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        /*
        driver.findElement(By.linkText("Manage"));
        driver.findElement(By.linkText("Manage Projects"));
        driver.findElement(By.cssSelector("input.button-small")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.close();*/
    }
}
