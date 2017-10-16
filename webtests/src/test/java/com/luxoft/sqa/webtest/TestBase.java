package com.luxoft.sqa.webtest;

import com.luxoft.sqa.framework.Application;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    public Application app = new Application(BrowserType.IE);

    @BeforeMethod
    public void setup(){
        app.init();
    }


    @AfterMethod
    public void testDown(){
        app.stop();
    }

}