package com.paul;

import java.util.Date;

public class PhoneNumberDetails {
    private String name;
    private String email;
    private Date dateCreated;

    public PhoneNumberDetails(String name, String email, Date dateCreated) {
        this.name = name;
        this.email = email;
        this.dateCreated = dateCreated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "PhoneNumberDetails{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
