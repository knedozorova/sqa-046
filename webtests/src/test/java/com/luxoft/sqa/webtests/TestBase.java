package com.luxoft.sqa.webtests;

import framework.Application;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected final Application app = new Application();

    @BeforeMethod
    public void setup(){
        app.init();
    }


    @AfterMethod
    public void testDown(){
        app.stop();
    }


}
