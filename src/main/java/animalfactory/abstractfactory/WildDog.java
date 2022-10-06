package animalfactory.abstractfactory;

import animalfactory.Dog;

public class WildDog extends Dog {
    @Override
    public void makeSound() {
        System.out.println("bite!bite!");
    }
}
