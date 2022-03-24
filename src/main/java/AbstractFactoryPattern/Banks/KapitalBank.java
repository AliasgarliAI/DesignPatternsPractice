package AbstractFactoryPattern.Banks;

public class KapitalBank implements Bank {
    private final String bankBank;

    public KapitalBank(){
        bankBank = "Kapital Bank";
    }

    @Override
    public String getBankName() {
        return bankBank;
    }
}
