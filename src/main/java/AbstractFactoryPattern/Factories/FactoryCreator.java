package AbstractFactoryPattern.Factories;

public class FactoryCreator {
    public static AbstractFactory getFactory(int choice){
        return FactoryTypes.factoryChecker(choice);

    }
}
