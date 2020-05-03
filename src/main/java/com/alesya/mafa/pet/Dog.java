package com.alesya.mafa.pet;

import java.util.UUID;

public class Dog extends Pet {

    private String tail;

    public Dog(UUID petId, String name, String breed, byte age, String color, String tail) {
        super(petId, name, breed, age, color);
        this.tail = tail;
    }

    public Dog(Pet pet) {
        super(pet.getPetId(), pet.getName(), pet.getBreed(), pet.getAge(), pet.getColor());
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return String.format(getPetId() + ", " + "dog" + ", " + getName() + ", " + getBreed() + ", " + getAge() + ", " +  getColor() + ", " + getTail());
    }
}
