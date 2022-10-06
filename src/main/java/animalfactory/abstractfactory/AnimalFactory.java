package animalfactory.abstractfactory;

import animalfactory.Dog;
import animalfactory.Tiger;

public interface AnimalFactory {
    //TODO: definieer hier ook andere relevante factory methods (cohesie)
    Dog makeDog();

    Tiger makeTiger();
}
