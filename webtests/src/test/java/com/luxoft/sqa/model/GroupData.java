package com.luxoft.sqa.model;

public class GroupData {
    private String name;
    private String header;
    private String footer;
    private int id;

    @Override
    public String toString() {
        return "GroupData{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupData groupData = (GroupData) o;

        return name != null ? name.equals(groupData.name) : groupData.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    public GroupData(String name, String header, String footer) {
        this.name = name;
        this.header = header;
        this.footer = footer;

        this.id = Integer.MAX_VALUE;
    }

    public GroupData(int id, String name, String header, String footer) {
        this.name = name;
        this.header = header;
        this.footer = footer;
        this.id = id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getId() {

        return id;
    }


    public String getName() {
        return name;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }


}
