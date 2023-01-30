package com.jpk.bootstrap;

import com.jpk.petclinic.model.Owner;
import com.jpk.petclinic.model.Vet;
import com.jpk.petclinic.services.OwnerService;
import com.jpk.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetSerivce;

    public DataLoader(OwnerService ownerService, VetService vetSerivce) {
        this.ownerService = ownerService;
        this.vetSerivce = vetSerivce;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Raju");
        owner1.setLastName("Rani");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("King");
        owner2.setLastName("Queen");
        ownerService.save(owner2);

        System.out.println("Loaded.. Owners");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sony");
        vet1.setLastName("Mony");
        vetSerivce.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Tony");
        vet2.setLastName("Bony");
        vetSerivce.save(vet2);

        System.out.println("Loaded.. Vets");
    }
}
