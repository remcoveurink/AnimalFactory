package animalfactory.simple;

import animalfactory.Animal;
import animalfactory.Dog;
import animalfactory.Tiger;

class AnimalFactory {
    private static AnimalFactory instance;
    private AnimalFactory() {
    }

    public static AnimalFactory getInstance(){
        if (instance == null) {
            instance = new AnimalFactory();
        }
        return instance;
    }

    public Animal makeAnimal(String animal) throws Exception {
        if(animal.equals("dog")) {
            return makeDog();
        } else if(animal.equals("tiger")) {
            return makeTiger();
        } else if(animal.equals("dino")) {
            return new DinosourAdapter(new Dinosaur());
        }
        throw new Exception("unknown animal");
    }

    public Dog makeDog() {
        return new Dog();
    }

    public Tiger makeTiger() {
        return new Tiger();
    }

}
