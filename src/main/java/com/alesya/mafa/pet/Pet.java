package com.alesya.mafa.pet;

import java.util.Objects;
import java.util.UUID;

public class Pet implements Comparable{

    private String name;
    private byte age;
    private String color;
    private UUID petId;

    public Pet(UUID petId, String name, byte age, String color) {
        this.name = name;
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
        return "Pet{" +
                "petId=" + petId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age + '\'' +
                ", color='" + color +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pet pet = (Pet) o;
        return age == pet.age &&
                name.equals(pet.name) &&
                color.equals(pet.color) &&
                petId.equals(pet.petId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color, petId);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
