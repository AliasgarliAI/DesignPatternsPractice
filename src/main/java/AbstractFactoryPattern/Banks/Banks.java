package AbstractFactoryPattern.Banks;

import java.util.Arrays;
import java.util.List;

public enum Banks {
    Kapital_Bank(1, "Kapital Bank", new KapitalBank()),
    Pasha_Bank(2, "Pasha Bank", new PashaBank()),
    BeynelXalq_Bank(3, "BeynelXalq Bank", new BeynelXalqBank());

    private int bankId;
    private String bankName;
    private Bank bank;

    private static final List<Banks> banksList = Arrays.asList(Banks.values());

    Banks(int id, String name, Bank bank) {
        this.bankId = id;
        this.bankName = name;
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "bankId= " + bankId + ", bankName= " + bankName;
    }

    public static void bankShower() {
        for (Banks b : banksList)
            System.out.println(b);
    }

    public static Bank bankChecker(int id) {
        for (Banks b : banksList)
            if (b.bankId == id)
                return b.bank;

        return null;
    }
}
