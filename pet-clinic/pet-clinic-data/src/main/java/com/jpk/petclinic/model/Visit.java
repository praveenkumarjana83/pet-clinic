package com.jpk.petclinic.model;

public class Visit extends BaseEntity {

    private LocalDate date;
    private Pet pet;
    private String description;

    @java.lang.Override
    public java.lang.String toString() {
        return "Visit{" +
                "date=" + date +
                ", pet=" + pet +
                ", description='" + description + '\'' +
                '}';
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}