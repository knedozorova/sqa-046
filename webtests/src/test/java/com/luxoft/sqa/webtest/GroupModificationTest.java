package com.luxoft.sqa.webtest;

import com.luxoft.sqa.model.GroupData;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
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

        Set<GroupData> before = app.getGroupHelper().all();
        GroupData modifiedGroup = before.iterator().next();
        GroupData group = new GroupData().withId(modifiedGroup.getId()).withName("test1").withHeader("test1").withFooter("test1");
        app.getGroupHelper().modifyGroup(group);
        Set<GroupData> after = app.getGroupHelper().all();
        before.remove(modifiedGroup);
        before.add(group);

        MatcherAssert.assertThat(after, CoreMatchers.equalTo(before));
    }



}
