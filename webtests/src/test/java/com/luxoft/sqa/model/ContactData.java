package com.luxoft.sqa.model;

public class ContactData {
    String firstname;
    String lastname;
    String company;
    String mobile;
    String email;
    boolean creation;

    public ContactData(String firstname, String lastname, String company, String mobile, String email, boolean creation) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.company = company;
        this.mobile = mobile;
        this.email = email;
        this.creation = creation;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCompany() {
        return company;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstname() {
        return firstname;
    }

    public boolean getCreation() {
        return creation;
    }


}
