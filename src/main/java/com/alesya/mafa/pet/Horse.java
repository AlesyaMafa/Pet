package com.alesya.mafa.pet;

import java.util.UUID;

public class Horse extends Pet {

    private String horseshoe;

    public Horse(UUID petId, String name, String breed, byte age, String color, String horseshoe) {
        super(petId, name, breed, age, color);
        this.horseshoe = horseshoe;
    }

    public Horse(Pet pet) {
        super(pet.getPetId(), pet.getName(), pet.getBreed(), pet.getAge(), pet.getColor());
    }

    public String getHorseshoe() {
        return horseshoe;
    }

    public void setHorseshoe(String horseshoe) {
        this.horseshoe = horseshoe;
    }

    @Override
    public String toString() {
        return String.format(getPetId() + ", " + "horse" + ", " + getName() + ", " + getBreed() + ", " + getAge() + ", " +  getColor() + ", " + getHorseshoe());
    }

}
