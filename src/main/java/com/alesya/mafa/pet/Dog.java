package com.alesya.mafa.pet;

import java.util.Objects;
import java.util.UUID;

public class Dog extends Pet {

    private String tail;
    private String breed;

    public Dog(UUID petId, String name, String breed, byte age, String color, String tail) {
        super(petId, name, age, color);
        this.tail = tail;
        this.breed = breed;
    }

    public Dog(Pet pet) {
        super(pet.getPetId(), pet.getName(), pet.getAge(), pet.getColor());
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "tail='" + tail + '\'' +
                ", breed='" + breed + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return tail.equals(dog.tail) &&
                breed.equals(dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tail, breed);
    }
}
