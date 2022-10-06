package animalfactory.factorymethod;

import animalfactory.Animal;
import animalfactory.Dog;

public class DogFactory extends AnimalFactory {
    @Override
    public Animal makeAnimal() {
        return new Dog();
    }
}
