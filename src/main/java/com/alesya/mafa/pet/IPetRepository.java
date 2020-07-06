package com.alesya.mafa.pet;

import java.util.ArrayList;
import java.util.List;

public interface IPetRepository {

    public List<Pet> loadPets();

    public void uploadPets(ArrayList<Pet> storage);
}
