package animalfactory.abstractfactory;

import animalfactory.Dog;
import animalfactory.Tiger;

public class PetAnimalFactory implements AnimalFactory {
    @Override
    public Dog makeDog() {
        return new PetDog();
    }

    @Override
    public Tiger makeTiger() {
        return new PetTiger();
    }
}
