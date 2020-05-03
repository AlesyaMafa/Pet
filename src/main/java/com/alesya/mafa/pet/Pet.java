package com.alesya.mafa.pet;

import java.util.UUID;

public class Pet {

    private String name;
    private String breed;
    private byte age;
    private String color;
    private UUID petId;

    public Pet(UUID petId, String name, String breed, byte age, String color){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.petId = petId;
    }

    public Pet() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public byte getAge() {
        return this.age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public UUID getPetId() {
        return petId;
    }

    public void setPetId(UUID petId) {
        this.petId = petId;
    }

    @Override
    public String toString() {
        return String.format(getPetId() + ", " + getName() + ", " + getBreed() + ", " + String.valueOf(getAge()) + ", " +  getColor());
    }
 }
