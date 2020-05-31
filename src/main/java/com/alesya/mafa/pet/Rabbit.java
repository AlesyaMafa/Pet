package com.alesya.mafa.pet;

import java.util.Objects;
import java.util.UUID;

public class Rabbit extends Pet {

    private String typeOfEars;
    private String breed;

    public Rabbit() {
    }

    public Rabbit(UUID petId, String name, String breed, byte age, String color, String typeOfEars) {
        super(petId, name, age, color);
        this.typeOfEars = typeOfEars;
        this.breed = breed;
    }

    public Rabbit(UUID petId, String name, String breed) {
        this(petId, name, breed, (byte) 1, "red", "lop-eared");
    }

    public Rabbit(Pet pet) {
        super(pet.getPetId(), pet.getName(), pet.getAge(), pet.getColor());
    }

    public String getTypeOfEars() {
        return typeOfEars;
    }

    public void setTypeOfEars(String typeOfEars) {
        this.typeOfEars = typeOfEars;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Rabbit{" +
                "typeOfEars='" + typeOfEars + '\'' +
                ", breed='" + breed + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rabbit rabbit = (Rabbit) o;
        return typeOfEars.equals(rabbit.typeOfEars) &&
                breed.equals(rabbit.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfEars, breed);
    }
}
