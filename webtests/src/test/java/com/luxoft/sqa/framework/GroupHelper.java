package com.luxoft.sqa.framework;

import com.luxoft.sqa.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

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

    public void selectFirstGroup(int index){
        driver.findElements(By.name("selected[]")).get(index).click();
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

    public List<GroupData> getGroupList() {
        List<GroupData> groups = new ArrayList<GroupData>();
        List<WebElement> elements = driver.findElements(By.cssSelector("span.group"));
        for (WebElement element: elements) {
            String name = element.getText();
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            GroupData group = new GroupData().withId(id).withName(name).withHeader(null).withFooter(null);
            groups.add(group);
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

    public GroupData modifyGroup(List<GroupData> before, int index) {
        selectFirstGroup(index);

        initGroupModification();
        GroupData group = new GroupData().withId(before.get(index).getId()).withName("test1").withHeader("test1").withFooter("test1");
        fillGroupForm(group);
        submitGroupModification();
        returnToGroupPage();
        return group;
    }

    public void deleteGroup(int index) {
        selectFirstGroup(index);
        deleteGroup();
        returnToGroupPage();
    }
}
