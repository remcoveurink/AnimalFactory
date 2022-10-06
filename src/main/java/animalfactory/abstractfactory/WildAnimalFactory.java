package animalfactory.abstractfactory;

import animalfactory.Dog;
import animalfactory.Tiger;

public class WildAnimalFactory implements AnimalFactory {
    @Override
    public Dog makeDog() {
        return new WildDog();
    }

    @Override
    public Tiger makeTiger() {
        return new WildTiger();
    }
}
