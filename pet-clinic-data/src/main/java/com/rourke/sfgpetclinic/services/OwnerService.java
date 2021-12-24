package com.rourke.sfgpetclinic.services;

/* Jim created on 12/23/2021 
inside the package - com.rourke.sfgpetclinic.services */

import com.rourke.sfgpetclinic.model.Owner;

public interface OwnerService  extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
