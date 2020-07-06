package com.alesya.mafa.pet;

import java.util.List;

public class PetResource {

    private List<Pet> pets;

    public PetResource(List<Pet> pets) {
        this.pets = pets;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

}
