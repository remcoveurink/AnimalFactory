package animalfactory.factorymethod;

import animalfactory.Animal;

public class Application {
    public static void main(String[] args) {
        AnimalFactory dogFactory = new TigerFactory();
        Animal animal = dogFactory.makeAnimal(); // Create animal
        animal.makeSound();
    }
}
