package animalfactory.factorymethod;

import animalfactory.Animal;
import animalfactory.Tiger;

public class TigerFactory extends AnimalFactory {
    @Override
    public Animal makeAnimal() {
        return new Tiger();
    }
}
