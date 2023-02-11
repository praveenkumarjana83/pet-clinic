package com.jpk.petclinic.model;
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Owner{" +
                "pets=" + pets +
                '}';
    }
}
