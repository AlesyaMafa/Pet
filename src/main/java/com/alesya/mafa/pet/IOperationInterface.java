package com.alesya.mafa.pet;

import java.util.Scanner;

public interface IOperationInterface {

    public Pet addPet();

    public void addCat();

    public void addDog();

    public void addHorse();

    public void addRabbit();

    public void listPet();

    public String updatePet(String updatedId);

    public String deletePet(String deletedId);

    public void setScanner(Scanner scanner);

    public void search(String name);

}
