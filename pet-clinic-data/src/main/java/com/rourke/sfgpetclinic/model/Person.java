package com.rourke.sfgpetclinic.model;

/* Jim created on 12/23/2021 
inside the package - com.rourke.sfgpetclinic.model */

public class Person extends  BaseEntity {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
