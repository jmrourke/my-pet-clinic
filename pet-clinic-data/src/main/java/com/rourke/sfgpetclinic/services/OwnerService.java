package com.rourke.sfgpetclinic.services;

/* Jim created on 12/23/2021 
inside the package - com.rourke.sfgpetclinic.services */

import com.rourke.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
