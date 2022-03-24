package AbstractFactoryPattern.Factories;



import java.util.Arrays;
import java.util.List;

public enum FactoryTypes {
    Business_factory(1, "Bank", new BankFactory()),
    Education_factory(2, "Loan", new LoanFactory());

    private int factoryId;
    private String factoryName;
    private AbstractFactory factory;

    private static final List<FactoryTypes> factoryList = Arrays.asList(FactoryTypes.values());

    FactoryTypes(int id, String name, AbstractFactory factory) {
        this.factoryId = id;
        this.factoryName = name;
        this.factory = factory;
    }

    @Override
    public String toString() {
        return "factoryId= " + factoryId + ", factoryName= " + factoryName;
    }

    public static void factoryhower() {
        for (FactoryTypes b : factoryList)
            System.out.println(b);
    }

    public static AbstractFactory factoryChecker(int id) {
        for (FactoryTypes b : factoryList)
            if (b.factoryId == id)
                return b.factory;

        return null;
    }
}
