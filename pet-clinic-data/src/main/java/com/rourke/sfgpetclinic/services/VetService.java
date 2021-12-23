package com.rourke.sfgpetclinic.services;

/* Jim created on 12/23/2021 
inside the package - com.rourke.sfgpetclinic.services */

import com.rourke.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet owner);
    Set<Vet> findAll();
}
