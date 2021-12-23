package com.rourke.sfgpetclinic.services;

/* Jim created on 12/23/2021 
inside the package - com.rourke.sfgpetclinic.services */

import com.rourke.sfgpetclinic.model.Owner;
import com.rourke.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Owner owner);
    Set<Pet> findAll();
}
