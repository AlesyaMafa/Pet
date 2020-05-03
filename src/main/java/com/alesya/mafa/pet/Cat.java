package com.alesya.mafa.pet;

import java.util.UUID;

public class Cat extends Pet {

    private String hair;

    public Cat(UUID petId, String name, String breed, byte age, String color, String hair) {
        super(petId, name, breed, age, color);
        this.hair = hair;
    }

    public Cat(Pet pet) {
        super(pet.getPetId(), pet.getName(), pet.getBreed(), pet.getAge(), pet.getColor());
    }

    public String getHair () {
        return this.hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String toString() {
        return String.format(getPetId() + ", " + "cat" + ", " + getName() + ", " + getBreed() + ", " + getAge() + ", " +  getColor() + ", " + getHair());
    }
}
