package com.rourke.sfgpetclinic.model;

import java.io.Serializable;

/* Jim created on 12/23/2021
inside the package - com.rourke.sfgpetclinic.model */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
