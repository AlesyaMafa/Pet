package com.alesya.mafa.pet;

import java.util.Objects;
import java.util.Scanner;

public class MainInterface implements IMainInterface {

    private final static String INCORRECT_VALUE = "Incorrect value, try again";
    private final static String INPUT_PET = "Input type of pet: cat, dog or horse";
    private final static String INPUT_APP = "Type 'add' to add new pet\nType 'update' to update existing pet\nType 'delete' to delete existing pet\nType 'list' to view all pets\nType 'exit' to stop app";
    private final static String UPDATE_PET = "To update pet type ID\nIf you don't remember ID, type list";
    private final static String DELETE_PET = "To delete pet type ID\nIf you don't remember ID, type list";
    private final static String DELETE_PET_BY_ID = "To delete pet type ID";
    private final static String UPDATE_PET_BY_ID = "To update pet type ID";

    private IOperationInterface operationInterface = new OperationInterface();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        operationInterface.setScanner(scanner);
        exit:
        while (true) {
            System.out.println(INPUT_APP);
            switch (scanner.nextLine().trim()) {
                case "exit":
                    break exit;
                case "list":
                    operationInterface.listPet();
                    break;
                case "add":
                    add();
                    break;
                case "update":
                    update();
                    break;
                case "delete":
                    delete();
                    break;
                default:
                    System.out.println(INCORRECT_VALUE);
            }
        }
        scanner.close();
    }

    private void add() {
        while (true) {
            System.out.println(INPUT_PET);
            switch (scanner.nextLine().trim()) {
                case "cat":
                    operationInterface.addCat();
                    return;
                case "dog":
                    operationInterface.addDog();
                    return;
                case "horse":
                    operationInterface.addHorse();
                    return;
                default:
                    System.out.println(INCORRECT_VALUE);
            }
        }
    }

    private void delete() {
        while (true) {
            System.out.println(DELETE_PET);
            String deletedId = scanner.nextLine().trim();
            if (deletedId.equals("list")) {
                operationInterface.listPet();
                System.out.println(DELETE_PET_BY_ID);
                deletedId = scanner.nextLine().trim();
            }
            if (Objects.isNull(operationInterface.deletePet(deletedId))) {
                System.out.println(INCORRECT_VALUE);
            } else return;
        }
    }

    private void update() {
        while (true) {
            System.out.println(UPDATE_PET);
            String updateId = scanner.nextLine().trim();
            if (updateId.equals("list")) {
                operationInterface.listPet();
                System.out.println(UPDATE_PET_BY_ID);
                updateId = scanner.nextLine().trim();
            }
            if (Objects.isNull(operationInterface.updatePet(updateId))) {
                System.out.println(INCORRECT_VALUE);
            } else return;
        }
    }
}
