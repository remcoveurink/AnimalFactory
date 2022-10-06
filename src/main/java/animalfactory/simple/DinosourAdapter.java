package animalfactory.simple;

import animalfactory.Animal;

public class DinosourAdapter implements Animal {
    private Dinosaur dinosaur;

    public DinosourAdapter(Dinosaur dinosaur) {
        this.dinosaur = dinosaur;
    }

    @Override
    public void makeSound() {
        dinosaur.produceSound();
    }
}
