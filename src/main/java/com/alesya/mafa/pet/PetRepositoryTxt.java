package com.alesya.mafa.pet;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.io.FileWriter;

public class PetRepositoryTxt implements IPetRepository {

    @Override
    public List<Pet> loadPets() {
        ArrayList<Pet> storage = new ArrayList<Pet>();
        FileInputStream fstream = null;
        BufferedReader br = null;
        try {
            fstream = new FileInputStream("src/main/resources/storage_pet.txt");
            br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            String[] tokens;
            while ((strLine = br.readLine()) != null) {
                tokens = strLine.split("\\|");
                switch (tokens[0]) {
                    case "cat":
                        storage.add(new Cat(UUID.fromString((tokens[1])), tokens[2], Cat.Breed.valueOf(tokens[3].toUpperCase().replace(" ", "_")), Byte.valueOf(tokens[4]), tokens[5], tokens[6]));
                        break;
                    case "dog":
                        storage.add(new Dog(UUID.fromString((tokens[1])), tokens[2], tokens[3], Byte.valueOf(tokens[4]), tokens[5], tokens[6]));
                        break;
                    case "horse":
                        storage.add(new Horse(UUID.fromString((tokens[1])), tokens[2], tokens[3], Byte.valueOf(tokens[4]), tokens[5], tokens[6]));
                        break;
                    case "rabbit":
                        storage.add(new Rabbit(UUID.fromString((tokens[1])), tokens[2], tokens[3], Byte.valueOf(tokens[4]), tokens[5], tokens[6]));
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fstream.close();

            } catch (Exception ignore) {
                System.out.println(ignore);
            }
        }
        return storage;
    }

    @Override
    public void uploadPets(ArrayList<Pet> storage) {
        try {
            FileWriter writer = new FileWriter("src/main/resources/storage_pet.txt");
            for (Pet element : storage) {
                if (element instanceof Cat) {
                    writer.write("cat" + "|" + element.getPetId() + "|" + element.getName() + "|" + ((Cat) element).getBreed() + "|" + element.getAge() + "|" + element.getColor() + "|" + ((Cat) element).getHair() + System.getProperty("line.separator"));
                }
                if (element instanceof Dog) {
                    writer.write("dog" + "|" + element.getPetId() + "|" + element.getName() + "|" + ((Dog) element).getBreed() + "|" + element.getAge() + "|" + element.getColor() + "|" + ((Dog) element).getTail() + System.getProperty("line.separator"));
                }
                if (element instanceof Horse) {
                    writer.write("horse" + "|" + element.getPetId() + "|" + element.getName() + "|" + ((Horse) element).getBreed() + "|" + element.getAge() + "|" + element.getColor() + "|" + ((Horse) element).getHorseshoe() + System.getProperty("line.separator"));
                }
                if (element instanceof Rabbit) {
                    writer.write("rabbit" + "|" + element.getPetId() + "|" + element.getName() + "|" + ((Rabbit) element).getBreed() + "|" + element.getAge() + "|" + element.getColor() + "|" + ((Rabbit) element).getTypeOfEars() + System.getProperty("line.separator"));
                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
