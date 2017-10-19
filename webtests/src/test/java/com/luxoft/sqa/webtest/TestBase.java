package com.luxoft.sqa.webtest;

import com.luxoft.sqa.framework.Application;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    public static Application app = new Application(BrowserType.CHROME);

    @BeforeSuite
    public void setup(){
        app.init();
    }


    @AfterSuite
    public void testDown(){
        app.stop();
    }

}