package animalfactory.abstractfactory;

import animalfactory.Dog;

public class Application {
    public static void main(String[] args) throws Exception {
        AnimalFactory animalFactory = AnimalFactoryProvider.getInstance()
                .getAnimalFactory("wild");
        Dog dog = animalFactory.makeDog();
        dog.makeSound();
    }
}
