package com.alesya.mafa.pet;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class OperationInterface implements IOperationInterface {

    private final static String NAME = "Input name: ";
    private final static String BREED = "Input breed: ";
    private final static String AGE = "Input age: ";
    private final static String COLOR = "Input color: ";
    private final static String HAIR = "Input hair: ";
    private final static String HORSESHOE = "Input horseshoe: ";
    private final static String TAIL = "Input tail: ";

    private ArrayList<Pet> storage = new ArrayList<>();
    private Scanner scanner;

    @Override
    public Pet addPet() {
        Pet pet = new Pet();
        System.out.println(NAME);
        pet.setName(scanner.nextLine());
        System.out.println(BREED);
        pet.setBreed(scanner.nextLine());
        System.out.println(AGE);
        pet.setAge(Byte.parseByte(scanner.nextLine()));
        System.out.println(COLOR);
        pet.setColor(scanner.nextLine());
        pet.setPetId(UUID.randomUUID());
        return pet;
    }

    @Override
    public void addCat() {
        storage.add(createCat());
    }

    @Override
    public void addHorse() {
        storage.add(createHorse());
    }

    @Override
    public void addDog() {
        storage.add(createDog());
    }

    @Override
    public void listPet() {
        for (Pet object: storage) {
            System.out.println(object);
        }
    }

    @Override
    public String updatePet(String updatedId) {
        for (int i = 0; i < storage.size(); i++) {
            if (String.valueOf(storage.get(i).getPetId()).equals(updatedId)) {
                Pet pet = storage.get(i);
                if(pet instanceof Cat) {
                    Cat cat = createCat();
                    cat.setPetId(pet.getPetId());
                    storage.set(i, cat);
                }
                if(pet instanceof Dog) {
                    Dog dog = createDog();
                    dog.setPetId(pet.getPetId());
                    storage.set(i, dog);
                }
                if(pet instanceof Horse) {
                    Horse horse = createHorse();
                    horse.setPetId(pet.getPetId());
                    storage.set(i, horse);
                }
                return updatedId;
            }
        }
        return null;
    }

    @Override
    public String deletePet(String deletedId) {
        for (int i = 0; i < storage.size(); i++) {
            if (String.valueOf(storage.get(i).getPetId()).equals(deletedId)) {
                storage.remove(i);
                return deletedId;
            }
        }
        return null;
    }

    @Override
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    private Cat createCat() {
        Cat cat = new Cat(addPet());
        System.out.println(HAIR);
        cat.setHair(scanner.nextLine());
        return cat;
    }

    private Horse createHorse() {
        Horse horse = new Horse(addPet());
        System.out.println(HORSESHOE);
        horse.setHorseshoe(scanner.nextLine());
        return horse;
    }

    private Dog createDog() {
        Dog dog = new Dog(addPet());
        System.out.println(TAIL);
        dog.setTail(scanner.nextLine());
        return dog;
    }
}
