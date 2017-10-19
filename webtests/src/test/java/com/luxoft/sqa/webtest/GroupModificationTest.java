package com.luxoft.sqa.webtest;

import com.luxoft.sqa.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GroupModificationTest extends TestBase {

    @Test
    public void testGroupModification(){
        app.getNavigationHelper().goToGroupPage();

        List<GroupData> before = app.getGroupHelper().getGroupList();
        int index = before.size()-1;
        GroupData group = app.getGroupHelper().modifyGroup(before, index);
        List<GroupData> after = app.getGroupHelper().getGroupList();
        before.remove(index);
        before.add(group);
        Comparator<? super GroupData> byId = Comparator.comparingInt(GroupData::getId);
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before, after);
    }



}
