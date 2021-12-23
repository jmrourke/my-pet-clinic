package com.rourke.sfgpetclinic.model;

/* Jim created on 12/23/2021 
inside the package - com.rourke.sfgpetclinic.model */
public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
