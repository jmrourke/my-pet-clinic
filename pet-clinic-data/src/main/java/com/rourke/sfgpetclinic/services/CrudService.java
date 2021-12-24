package com.rourke.sfgpetclinic.services;

/* Jim created on 12/24/2021 
inside the package - com.rourke.sfgpetclinic.services */

import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}
