package com.luxoft.sqa.framework;

import com.luxoft.sqa.model.GroupData;
import com.luxoft.sqa.model.Groups;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GroupHelper extends BaseHelper{

    public GroupHelper(WebDriver driver) {
        super(driver);
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void deleteGroup() {
        click(By.name("delete"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public int getGroupCount() {
        return driver.findElements(By.name("selected[]")).size();
    }

    public Groups all() {
        Groups groups = new Groups();
        List<WebElement> elements = driver.findElements(By.cssSelector("span.group"));
        for (WebElement element: elements) {
            String name = element.getText();
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            groups.add(new GroupData().withId(id).withName(name));
        }
        return groups;
    }

    public GroupData createGroup() {
        initGroupCreation();
        GroupData group = new GroupData().withName("test1").withHeader(null).withFooter("test4");
        fillGroupForm(group);
        submitGroupCreation();
        returnToGroupPage();
        return group;
    }


    public void deleteGroup(GroupData group) {
        selectGroupById(group.getId());
        deleteGroup();
        returnToGroupPage();
    }

    private void selectGroupById(int id) {
        click(By.cssSelector("input[value='" + id + "']"));
    }

    public void modifyGroup(GroupData group) {
        selectGroupById(group.getId());

        initGroupModification();
        fillGroupForm(group);
        submitGroupModification();
        returnToGroupPage();
    }


}
