package nl.rubix.dierckx.luna.pets;

public class DogPetService implements PetService {
    @Override
    public String getPetType() {
        return "Dogs are the best!";
    }
}
