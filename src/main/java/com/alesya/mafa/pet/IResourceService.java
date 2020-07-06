package com.alesya.mafa.pet;

import java.util.ArrayList;

public interface IResourceService {

    public PetResource loadResources();

    public void uploadResources(ArrayList<Pet> storage);
}
