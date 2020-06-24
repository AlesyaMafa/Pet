package com.alesya.mafa.pet;

import java.util.Objects;
import java.util.UUID;

public class Horse extends Pet {

    private String horseshoe;
    private String breed;

    public Horse(UUID petId, String name, String breed, byte age, String color, String horseshoe) {
        super(petId, name, age, color);
        this.horseshoe = horseshoe;
    }

    public Horse(Pet pet) {
        super(pet.getPetId(), pet.getName(), pet.getAge(), pet.getColor());
    }

    public String getHorseshoe() {
        return horseshoe;
    }

    public void setHorseshoe(String horseshoe) {
        this.horseshoe = horseshoe;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "horseshoe='" + horseshoe + '\'' +
                ", breed='" + breed + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Horse horse = (Horse) o;
        return horseshoe.equals(horse.horseshoe) &&
                breed.equals(horse.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), horseshoe, breed);
    }
}
