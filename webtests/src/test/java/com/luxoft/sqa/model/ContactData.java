package com.luxoft.sqa.model;

public class ContactData {
    String firstname;
    String lastname;
    String company;
    String mobile;
    String email;

    public ContactData(String firstname, String lastname, String company, String mobile, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.company = company;
        this.mobile = mobile;
        this.email = email;
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


}
