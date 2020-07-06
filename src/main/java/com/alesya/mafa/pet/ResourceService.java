package com.alesya.mafa.pet;

import java.util.ArrayList;

public class ResourceService implements IResourceService {

    private IPetRepository petRepository = new PetRepositoryTxt();

    @Override
    public PetResource loadResources() {
        return new PetResource(petRepository.loadPets());
    }

    @Override
    public void uploadResources(ArrayList<Pet> storage) {
        petRepository.uploadPets(storage);
    }
}
