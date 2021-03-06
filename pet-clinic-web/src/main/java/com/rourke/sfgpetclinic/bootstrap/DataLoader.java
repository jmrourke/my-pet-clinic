package com.rourke.sfgpetclinic.bootstrap;

/* Jim created on 12/27/2021 
inside the package - com.rourke.sfgpetclinic.bootstrap */


import com.rourke.sfgpetclinic.model.Owner;
import com.rourke.sfgpetclinic.model.Vet;
import com.rourke.sfgpetclinic.services.OwnerService;
import com.rourke.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("James");
        owner2.setLastName("Rourke");
        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Mary");
        vet2.setLastName("Jones");
        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }
}
