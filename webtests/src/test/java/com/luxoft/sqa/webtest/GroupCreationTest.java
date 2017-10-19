package com.luxoft.sqa.webtest;

import com.luxoft.sqa.model.GroupData;
import com.luxoft.sqa.model.Groups;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.acl.Group;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GroupCreationTest extends TestBase{

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().goToGroupPage();
        Groups before = app.getGroupHelper().all();
        GroupData group = app.getGroupHelper().createGroup();
        Groups after = app.getGroupHelper().all();
        group.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt());
        before.add(group);
        MatcherAssert.assertThat(after, CoreMatchers.equalTo(before.withAdded(group.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt()))));

//        app.getSessionHelper().logout();
//        int max = 0;
//        for (GroupData g:after){
//            if (g.getId() > max){
//                max = g.getId();
//            }
//        }

 //       Comparator<? super GroupData> byId = (Comparator<GroupData>) // (o1, o2) -> Integer.compare(o1.getId(), o2.getId()); lambda expression
//        group.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId());




    }


}
