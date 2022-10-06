package animalfactory.simple;

import animalfactory.Animal;

public class Application {
    public static void main(String[] args) throws Exception {
        Animal animal = AnimalFactory.getInstance().makeAnimal("dog");
        animal.makeSound();

        Animal dino = AnimalFactory.getInstance().makeAnimal("dino");
        dino.makeSound();
    }
}
