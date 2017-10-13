package com.luxoft.sqa.webtest;

import org.testng.annotations.Test;


public class GroupDeletionTest extends TestBase{

    @Test
    public void testGroupDeletion() {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectFirstGroup();
        app.getGroupHelper().deleteGroup();
    }

}
