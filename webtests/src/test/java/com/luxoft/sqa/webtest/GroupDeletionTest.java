package com.luxoft.sqa.webtest;

import com.luxoft.sqa.model.GroupData;
import com.luxoft.sqa.model.Groups;
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
        Groups before = app.getGroupHelper().all();
        GroupData deletedGroup = before.iterator().next();
        app.getGroupHelper().deleteGroup(deletedGroup);
        Groups after = app.getGroupHelper().all();
        MatcherAssert.assertThat(after, CoreMatchers.equalTo(before.without(deletedGroup)));
    }



}
