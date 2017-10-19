package com.luxoft.sqa.webtest;

import com.luxoft.sqa.model.GroupData;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;


public class GroupDeletionTest extends TestBase{

    @Test
    public void testGroupDeletion() {
        app.getNavigationHelper().goToGroupPage();
        Set<GroupData> before = app.getGroupHelper().all();
        GroupData deletedGroup = before.iterator().next();
        app.getGroupHelper().deleteGroup(deletedGroup);
        Set<GroupData> after = app.getGroupHelper().all();
        before.remove(deletedGroup);
        MatcherAssert.assertThat(after, CoreMatchers.equalTo(before));
    }



}
