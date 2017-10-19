package com.luxoft.sqa.webtest;

import com.luxoft.sqa.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class GroupDeletionTest extends TestBase{

    @Test
    public void testGroupDeletion() {
        app.getNavigationHelper().goToGroupPage();
        List<GroupData> before = app.getGroupHelper().getGroupList();
        int index = before.size()-1;
        app.getGroupHelper().deleteGroup(index);
        List<GroupData> after = app.getGroupHelper().getGroupList();
        before.remove(before.size()-1);
        Assert.assertEquals(after, before);
    }



}
