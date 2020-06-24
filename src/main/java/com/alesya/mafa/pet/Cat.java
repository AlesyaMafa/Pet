package com.alesya.mafa.pet;

import java.util.Objects;
import java.util.UUID;

public class Cat extends Pet {

    private String hair;
    private Breed breed;

    public Cat(UUID petId, String name, Breed breed, byte age, String color, String hair) {
        super(petId, name, age, color);
        this.hair = hair;
        this.breed = breed;
    }

    public Cat(Pet pet) {
        super(pet.getPetId(), pet.getName(), pet.getAge(), pet.getColor());
    }

    public String getHair() {
        return this.hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public enum Breed {
        ABYSSINIAN("abyssinian"),
        BENGAL("bengal"),
        BIRMAN("birman"),
        BOMBAY("bombay"),
        BURMESE("burmese"),
        CORNISH_REX("cornish rex");

        private String title;

        Breed(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return getTitle();
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "hair='" + hair + '\'' +
                ", breed=" + breed +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return hair.equals(cat.hair) &&
                breed == cat.breed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hair, breed);
    }
}
