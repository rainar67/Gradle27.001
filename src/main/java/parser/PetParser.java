package parser;

import model.Pet;

public class PetParser {
    private Pet pet;

    public PetParser(Pet pet) {
        this.pet = pet;
    }

   public String getPetId() {
        return this.pet.getId().toString();
    }

    public String getCategoryName() {
        return this.pet.getCategory().getName();
    }

    public String getPetName() {
        return this.pet.getName();
    }
}
