package animalfactory.abstractfactory;

public class AnimalFactoryProvider {
    private static AnimalFactoryProvider instance;
    private AnimalFactoryProvider() {
    }

    public static AnimalFactoryProvider getInstance(){
        if (instance == null) {
            instance = new AnimalFactoryProvider();
        }
        return instance;
    }

    public AnimalFactory getAnimalFactory(String type) throws Exception {
        if(type.equals("pet")) {
            return new PetAnimalFactory();
        } else if(type.equals("wild")) {
            return new WildAnimalFactory();
        }
        throw new Exception("type not exists");
    }
}
